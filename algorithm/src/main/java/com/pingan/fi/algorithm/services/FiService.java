package com.pingan.fi.algorithm.services;

import com.alibaba.fastjson.JSON;
import com.pingan.fi.algorithm.engine.impl.FiServiceExecutor;
import com.pingan.fi.common.CommonResponse;
import com.pingan.fi.common.ResponseList;
import org.apache.http.client.fluent.Content;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.Charset;


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

        CommonResponse commonResponse = ResponseList.DEFAULT_SUCCESS_MESSAGE.getResponse();
        commonResponse.setData(JSON.parse(response.asString(Charset.forName("UTF-8"))));
        return commonResponse;
    }


}
