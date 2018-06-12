package com.pingan.fi.algorithm.engine;

import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Preconditions;
import com.pingan.fi.algorithm.engine.impl.FiServiceExecutor;
import org.apache.http.client.fluent.Content;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.Charset;

/**
 * @author IonCannon
 * @date 2018/6/11
 * @decription : content
 */
public class AbstractExecutor {
    protected Logger log=LoggerFactory.getLogger(AbstractExecutor.this.getClass());


    protected String contentTransformToString(Content content){
        return content.asString(Charset.forName("UTF-8"));
    }

    protected JSONObject contentTransformToJson(Content content){
        return JSONObject.parseObject(content.asString(Charset.forName("UTF-8"))) ;

    }
}
