package com.pingan.fi.algorithm.engine.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.pingan.fi.algorithm.engine.AbstractExecutor;
import com.pingan.fi.algorithm.engine.ServiceUrl;
import com.pingan.fi.algorithm.model.fi.ImageFeatureValue;
import com.pingan.fi.algorithm.model.env.FiServerInfo;
import com.pingan.fi.common.CommonResponse;
import org.apache.http.client.fluent.Content;
import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author IonCannon
 * @date 2018/6/11
 * @decription : content
 */
public class FiServiceExecutor extends AbstractExecutor {

    //服务器信息
    private FiServerInfo serverInfo;

    public FiServiceExecutor() {
    }

    public FiServiceExecutor(FiServerInfo serverInfo) {
        this.serverInfo = serverInfo;
    }


    //组装参数
    /**
     * <p>
     * 1v1接口执行，传入2个文件的base64字符串信息，获得匹配结果
     * </p>
     *
     * @param file1 1v1请求文件1
     * @param file2 1v1 请求文件2
     * @return 请求返回结果
     */
    public Content doFiSearch1v1(String file1, String file2) throws IOException {
        log.info("call search for 1v1 service");
        //组装参数
        Map<String, String> parameters = new HashMap<>();
        parameters.put("picture1", file1);
        parameters.put("picture2", file2);
        String jsonString = JSON.toJSONString(parameters);

        String url=urlFormat(ServiceUrl.Search1V1);
        //发送请求
        Content content = Request.Post(url).bodyString(jsonString, ContentType.APPLICATION_JSON)
                .execute()
                .returnContent();
        log.info("response from 1v1 service");
        return content;
    }

    public CommonResponse doFiSearch1vN() {
        log.info("");
        return null;
    }



    /**
     * <p>图片特征值生成</p>
     * @param imageList 图片的base64字符串
     * @return 填充feature信息的列表
     */
    public List<ImageFeatureValue> doFeatureGen(List<ImageFeatureValue> imageList) throws IOException {
        log.info("call feature generate  service");

        //请求参数包装
        List<Map> requestParam = imageList
                .stream()
                .map(this::getFeatureGenParameterMap)
                .collect(Collectors.toList());

        Map data = ImmutableMap.of("data", requestParam);

        //发送请求并且将返回结果转换为JSONObject
        Content content = Request.Post(urlFormat(ServiceUrl.Search1V1Vec))
                .bodyString(JSON.toJSONString(data), ContentType.APPLICATION_JSON)
                .execute()
                .returnContent();
        JSONObject jsonObject = contentTransformToJson(content);

        Preconditions.checkNotNull(jsonObject, "获取特征值返回结果为空");
        JSONArray featureList = jsonObject.getJSONArray("result");

        if (null != featureList)
            return featureList.toJavaList(ImageFeatureValue.class);
        else {
            log.info("result is null return empty list");
            return new ArrayList<>();
        }

    }

    private Map<String, String> getFeatureGenParameterMap(ImageFeatureValue image) {
        return getFeatureGenParameterMap(image.getImageBase64(), image.getFaceId(), "-1");
    }

    private Map<String, String> getFeatureGenParameterMap(String imageBase64, String guid, String libId) {
        return ImmutableMap.of("imageBase64", imageBase64, "guid", guid, "libid", libId);
    }

    private String urlFormat(ServiceUrl url) {
        Preconditions.checkNotNull(url,"传入url为空");
        Preconditions.checkNotNull(serverInfo,"识别服务信息为空");

        String prefix = serverInfo.getUriPrefix();

        if (prefix.endsWith("/"))
            prefix = prefix.substring(0, prefix.length() - 1);

        return  String.format("http://%s:%s%s",serverInfo.getHost(),serverInfo.getPort(),  prefix.concat(url.toString()));
    }

}
