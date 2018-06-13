package com.pingan.fi.algorithm.services;

import com.google.common.collect.ImmutableMap;
import com.pingan.fi.algorithm.engine.impl.FiServiceExecutor;
import com.pingan.fi.algorithm.engine.impl.ImageExecutor;
import com.pingan.fi.algorithm.model.fi.ImageFeatureModel;
import com.pingan.fi.common.CommonResponse;
import com.pingan.fi.common.ResponseList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


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


    public CommonResponse search1VN() {

        return null;
    }

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
    public CommonResponse featureGenerate(List<ImageFeatureModel> imageList) throws Exception {

        //请求图文库获得图片
        imageList.forEach(image -> image.setImageBase64(imageExecutor.doImageGet(image.getImageId())));

        //请求算法生成特征值
        log.info("request feature generate");
        List<ImageFeatureModel> imageFeatureModelList = fiServiceExecutor.doFeatureGen(imageList);

        //请求XY值
        imageFeatureModelList.forEach(imageFeatureModel -> {
          String[] rect=  fiServiceExecutor.doFaceDetect(imageFeatureModel.getImageBase64());
          imageFeatureModel.setLeftTopX(rect[0]);
          imageFeatureModel.setLeftTopY(rect[1]);
          imageFeatureModel.setRightBtmX(rect[2]);
          imageFeatureModel.setRightBtmY(rect[3]);
        });
        //TODO
        //写入数据库
        return ResponseList.DEFAULT_SUCCESS_MESSAGE.getResponseWithData(imageFeatureModelList);
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

}
