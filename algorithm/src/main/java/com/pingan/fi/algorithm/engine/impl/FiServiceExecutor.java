package com.pingan.fi.algorithm.engine.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.pingan.fi.algorithm.engine.AbstractExecutor;
import com.pingan.fi.algorithm.engine.AlgorithmCastException;
import com.pingan.fi.algorithm.engine.ServiceUrl;
import com.pingan.fi.algorithm.engine.TempImageFeature;
import com.pingan.fi.algorithm.model.fi.ImageFeatureModel;
import com.pingan.fi.algorithm.model.env.FiServerInfo;
import com.pingan.fi.common.CommonResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Content;
import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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
     * @return 请求返回结果 相似度
     */
    public float doFiSearch1v1(String file1, String file2) throws Exception {
        log.info("call search for 1v1 service");
        //组装参数
        Map<String, String> parameters = new HashMap<>();
        parameters.put("picture1", file1);
        parameters.put("picture2", file2);
        String jsonString = JSON.toJSONString(parameters);

        String url = urlFormat(ServiceUrl.Search1V1);
        //发送请求
        Content content = Request.Post(url).bodyString(jsonString, ContentType.APPLICATION_JSON)
                .socketTimeout(serverInfo.getTimeout())
                .connectTimeout(serverInfo.getTimeout())
                .execute()
                .returnContent();
        JSONObject resp = ifSuccessGet(content, JSONObject.class);

        log.info("response from 1v1 service");

        return resp.getFloat("similarity");
    }

    /**
     * <p>
     * 1vN接口执行，传入1个图片的base64编码，获得匹配结果
     * </p>
     */
    public CommonResponse doFiSearch1vN(String imageBase64) {
        log.info("");
        //TODO
        return null;
    }


    /**
     * <p>人脸小图3矩阵识别</p>
     *
     * @param imageBase64 图片的base64编码
     * @return 长度为4的字符串数组
     */
    public String[] doFaceDetect(String imageBase64) {
        log.info("do call face detect");
        try {
            Content content = Request.Post(urlFormat(ServiceUrl.FaceDetect))
                    .bodyString(String.format("{\"imagebase64\":%s,\"checkQuality\":0}", imageBase64), ContentType.APPLICATION_JSON)
                    .socketTimeout(serverInfo.getTimeout())
                    .connectTimeout(serverInfo.getTimeout())
                    .execute()
                    .returnContent();
            String rect = ifSuccessGet(content, String.class);

            log.info("finish call face detect,rect is {}", rect);

            if (!StringUtils.isEmpty(rect))
                return rect.split(",");
        } catch (AlgorithmCastException | IOException e) {
            log.error("detect error", e);
        }
        return new String[]{"", "", "", ""};
    }

    /**
     * <p>图片特征值生成</p>
     *
     * @param imageList 图片的base64字符串
     * @return 填充feature信息的列表
     */
    public List<ImageFeatureModel> doFeatureGen(List<ImageFeatureModel> imageList) throws Exception {
        log.info("call feature generate  service");

        //请求参数包装
        List<TempImageFeature> requestParam = imageList
                .stream()
                .map(this::getFeatureGenParameterMap)
                .collect(Collectors.toList());

        Map data = ImmutableMap.of("data", requestParam);

        //发送请求并且将返回结果转换为JSONObject
        Content content = Request.Post(urlFormat(ServiceUrl.FeatureGeneration))
                .bodyString(JSON.toJSONString(data), ContentType.APPLICATION_JSON)
                .socketTimeout(serverInfo.getTimeout())
                .connectTimeout(serverInfo.getTimeout())
                .execute()
                .returnContent();

        log.info("finish  feature generate");
        return ifSuccessGetList(content, TempImageFeature.class).stream()
                .map(temp -> new ImageFeatureModel(temp.getFeature(), temp.getGuid(), temp.getLibid())).collect(Collectors.toList());
    }


    private TempImageFeature getFeatureGenParameterMap(ImageFeatureModel image) {
        return new TempImageFeature(image.getImageId(), image.getLibId(), image.getFeature());
    }


    //检查返回是否成功,成功返回则对象
    private <T> T ifSuccessGet(Content content, Class<T> tClass) throws AlgorithmCastException {
        return isRtnSuccess(content).getObject("result", tClass);
    }

    private <T> List<T> ifSuccessGetList(Content content, Class<T> tClass) throws AlgorithmCastException {
        return isRtnSuccess(content).getObject("result", new TypeReference<List<T>>() {
        });
    }

    private JSONObject isRtnSuccess(Content content) throws AlgorithmCastException {
        JSONObject resp = contentTransformToJson(content);
        Preconditions.checkNotNull(resp, "请求返回结果对象位空");

        if (!"000".equals(resp.getString("rtn")) || resp.get("rtn") == null)
            throw new AlgorithmCastException(String.format("返回结果有误，返回结果: %s .", resp.toJSONString()));

        return resp;
    }

    private String urlFormat(ServiceUrl url) {
        Preconditions.checkNotNull(url, "传入url为空");
        Preconditions.checkNotNull(serverInfo, "识别服务信息为空");

        String prefix = serverInfo.getUriPrefix();

        if (prefix.endsWith("/"))
            prefix = prefix.substring(0, prefix.length() - 1);

        return String.format("%s://%s%s", serverInfo.getProtocol(), serverInfo.getHostname(), prefix.concat(url.toString()));
    }

}
