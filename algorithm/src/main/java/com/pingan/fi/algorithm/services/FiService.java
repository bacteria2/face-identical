package com.pingan.fi.algorithm.services;

import com.alibaba.fastjson.JSON;
import com.pingan.fi.algorithm.engine.impl.FiServiceExecutor;
import com.pingan.fi.algorithm.engine.impl.ImageExecutor;
import com.pingan.fi.algorithm.model.fi.ImageFeatureValue;
import com.pingan.fi.common.CommonResponse;
import com.pingan.fi.common.ResponseList;
import org.apache.http.client.fluent.Content;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
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


    public CommonResponse search1VN() {

        return null;
    }

    public CommonResponse search1V1(String file1, String file2) throws IOException {

        log.info("get image from image repo file1:{},file2:{}", file1, file2);
        //TODO

        log.info("call 1v1 search");
        Content response = fiServiceExecutor.doFiSearch1v1(file1, file2);

        return ResponseList.DEFAULT_SUCCESS_MESSAGE.getResponseWithData(JSON.parse(response.asString(Charset.forName("UTF-8"))));
    }



    /**
     * <p>特征值生成</p>
     * @param ImageList  图片ID集合
     * */
    public CommonResponse featureGenerate(String[]  ImageList) throws IOException {


        log.info("get image from image repo");
        //请求图文库获得图片
        //TODO
        List<ImageFeatureValue> base64ImageList= Arrays.stream(ImageList)
                .map(id->{
                    ImageFeatureValue image=new ImageFeatureValue();
                    image.setFaceId(id);
                    return image;
                }).collect(Collectors.toList());

        //请求算法生成特征值
        log.info("request feature generate");
        List<ImageFeatureValue> imageFeatureValueList=  fiServiceExecutor.doFeatureGen(base64ImageList);

        return ResponseList.DEFAULT_SUCCESS_MESSAGE.getResponseWithData(imageFeatureValueList);
    }



}
