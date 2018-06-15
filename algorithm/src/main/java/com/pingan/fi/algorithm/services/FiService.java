package com.pingan.fi.algorithm.services;

import com.google.common.base.Preconditions;
import com.pingan.fi.algorithm.client.AlgorithmDataService;
import com.pingan.fi.algorithm.engine.AlgorithmCastException;
import com.pingan.fi.algorithm.engine.impl.FiServiceExecutor;
import com.pingan.fi.algorithm.engine.impl.ImageExecutor;
import com.pingan.fi.algorithm.model.fi.FeatureBody;
import com.pingan.fi.algorithm.model.fi.ImageFeatureModel;
import com.pingan.fi.common.CommonResponse;
import com.pingan.fi.common.ResponseList;
import com.pingan.fi.common.client.DatabaseService;
import com.pingan.fi.database.model.FiImageFeature;
import com.pingan.fi.database.services.FiImageFeatureService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;


/**
 * @author IonCannon
 * @date 2018/6/11
 * @decription : content
 */
@Service
public class FiService {
    private Logger log = LoggerFactory.getLogger(FiService.class);

    @Autowired
    FiServiceExecutor fiServiceExecutor;

    @Autowired
    ImageExecutor imageExecutor;

    @Autowired
    FiImageFeatureService databaseService;


    public CommonResponse search1VN() {

        return null;
    }

    /**
     * <p>1v1搜索</p>
     * */
    public CommonResponse search1V1(String file1, String file2) throws Exception {

        log.info("get image from image repo file1:{},file2:{}", file1, file2);
        String file1Base64 = imageExecutor.doImageGet(file1);
        String file2Base64 = imageExecutor.doImageGet(file2);

        log.info("call 1v1 search");
        float similarity = fiServiceExecutor.doFiSearch1v1(file1Base64, file2Base64);
        Map<String, Float> map = new HashMap<>();
        map.put("similarity", similarity);

        return ResponseList.DEFAULT_SUCCESS_MESSAGE.getResponseWithData(map);
    }


    /**
     * <p>特征值生成</p>
     *
     * @param imageList 图片ID集合
     */
    public CommonResponse featureGenerate(List<ImageFeatureModel> imageList) throws IOException, AlgorithmCastException {

        //请求算法生成特征值
        log.info("request feature generate");

        //特征值批量参数列表请求初始化
        List<Map> requestBodyList = new LinkedList<>();


        //请求图文库获得图片
        for (ImageFeatureModel image : imageList) {
            String imageBase64 = imageExecutor.doImageGet(image.getImageId());
            //填充特征值请求列表
            requestBodyList.add(newRequestBodyMap(imageBase64, image.getImageId(), Optional.of(image.getLibId()).orElse("0")));
            //根据imagebase64获取 xy rect
            String[] rect = fiServiceExecutor.doFaceDetect(imageBase64);
            image.setLeftTopX(rect[0]);
            image.setLeftTopY(rect[1]);
            image.setRightBtmX(rect[2]);
            image.setRightBtmY(rect[3]);
        }

        //包含特征值和图片id的列表
        List<Map> featureBodyList = fiServiceExecutor.doFeatureGen(requestBodyList);

        //完整数据的列表
        List<FiImageFeature> featureMap = mergeTempFeature(featureBodyList, imageList);

        //写入数据库
        databaseService.insertFeatureBatch(featureMap);

        return ResponseList.DEFAULT_SUCCESS_MESSAGE.getResponse();
    }


    /**
     * <p>小图坐标生成</p>
     */

    public CommonResponse faceDetect(String imageId) throws Exception {
        log.info("request picture rect, id:{}", imageId);
        //请求图文库获得图片
        String imageBase64 = imageExecutor.doImageGet(imageId);

        String[] rect = fiServiceExecutor.doFaceDetect(imageBase64);

        ImageFeatureModel data = new ImageFeatureModel(rect[0], rect[1], rect[2], rect[3]);

        return ResponseList.DEFAULT_SUCCESS_MESSAGE.getResponseWithData(data);
    }

    //合并列表
    private List<FiImageFeature> mergeTempFeature(List<Map> tempImageFeatures, List<ImageFeatureModel> imageList) {
        Preconditions.checkArgument(tempImageFeatures.size() == imageList.size(), "xy列表长度和特征值列表长度不匹配");

        Iterator<ImageFeatureModel> iterator = imageList.iterator();

        List<FiImageFeature> mapList=new LinkedList<>();

        for (Map tempMap : tempImageFeatures) {
            ImageFeatureModel image = iterator.next();
            Object guid=tempMap.get("guid");
            FiImageFeature imageFeature=new FiImageFeature();
            if (guid!=null&&guid.equals(image.getImageId())) {
                imageFeature.setFeature(tempMap.get("feature").toString());
            }

            imageFeature.setImageId(image.getImageId());
            imageFeature.setLibId(image.getLibId());

            imageFeature.setTopLeftX(Integer.valueOf(image.getLeftTopX()));
            imageFeature.setTopLeftY(Integer.valueOf(image.getLeftTopY()));
            imageFeature.setBottomRightX(Integer.valueOf(image.getRightBtmX()));
            imageFeature.setBottomRightY(Integer.valueOf(image.getRightBtmY()));

            imageFeature.setCreator("user");
            imageFeature.setUpdator("user");

            imageFeature.setCreateTime(LocalDateTime.now());
            imageFeature.setCreateTime(LocalDateTime.now());

            mapList.add(imageFeature);
        }
        return mapList;
    }

    private Map newRequestBodyMap(String imageBase64,String imageId,String libId){
        Map map=new HashMap();
        map.put("imagebase64",imageBase64);
        map.put("guid",imageId);
        map.put("libid",libId);
        return map;
    }
}
