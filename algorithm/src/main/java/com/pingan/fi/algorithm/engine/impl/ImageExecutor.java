package com.pingan.fi.algorithm.engine.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.pingan.fi.algorithm.engine.AbstractExecutor;
import com.pingan.fi.algorithm.engine.ServiceUrl;
import com.pingan.fi.algorithm.model.env.ImageServerInfo;
import com.pingan.fi.common.SignatureHelper;
import org.apache.http.NameValuePair;
import org.apache.http.client.fluent.Content;
import org.apache.http.client.fluent.Request;
import org.apache.http.message.BasicNameValuePair;


import java.io.IOException;
import java.util.List;

/**
 * @author IonCannon
 * @date 2018/6/11
 * @decription : content
 */
public class ImageExecutor extends AbstractExecutor {

    private ImageServerInfo imageServerInfo;

    public ImageExecutor() {
    }

    public ImageExecutor(ImageServerInfo imageServerInfo) {
        this.imageServerInfo = imageServerInfo;
    }

    /**
     *  <p>下载图片</p>
     * */
    public String doImageGet(String imageId) throws IOException {

        String  fetchUrl = getDownloadNode(imageId);
        log.debug("start download,imageId:{}",imageId);

        Content content = Request.Get(fetchUrl)
                .connectTimeout(imageServerInfo.getTimeout())
                .socketTimeout(imageServerInfo.getTimeout())
                .execute()
                .returnContent();
        JSONObject jsonObject=ifSuccessGetObject(content);
        String imageBase64=jsonObject.getString("data").replaceAll("\r|\n","");
        log.debug("imageBase64,{}",imageBase64);
        return imageBase64;
    }


    /**
     * 请求海康下载节点,组装成url返回
     */
    private String getDownloadNode(String imageId) throws IOException {
        log.debug("searching most fast download node:");
        String timeStamp = Long.toString(System.currentTimeMillis());
        String sign = sign(timeStamp);

        //组装请求参数
        List<NameValuePair> downloadNodeParameter = Lists.newArrayList(
                new BasicNameValuePair("sign", sign),
                new BasicNameValuePair("timestamp", timeStamp),
                new BasicNameValuePair("username", imageServerInfo.getUsername())
        );

        log.debug("request node search server sign:{},timestamp:{]",sign,timeStamp);
        //发起请求
        Content nodeContent = Request.Get(downloadNodeUrlFormat(downloadNodeParameter))
                .connectTimeout(imageServerInfo.getTimeout())
                .socketTimeout(imageServerInfo.getTimeout())
                .execute()
                .returnContent();

        //处理返回结果,拼装成下载链接返回
        JSONObject jsonNode = ifSuccessGetObject(nodeContent);

        String hostname=jsonNode.getString("hostname");
        String random =jsonNode.getString("random");

        List<NameValuePair> fetchImageParameter = Lists.newArrayList(
                new BasicNameValuePair("sign", sign),
                new BasicNameValuePair("username", imageServerInfo.getUsername()),
                new BasicNameValuePair("fileid", imageId),
                new BasicNameValuePair("random", random)
        );

        log.debug("finish search node,hostname:{},random:{}",hostname,random);
        return fetchUrlFormat(hostname, fetchImageParameter);
    }

    private JSONObject ifSuccessGetObject(Content content) {
        JSONObject jsonObject = contentTransformToJson(content);
        Preconditions.checkNotNull(jsonObject, "图片服务器节点请求返回的结果空,请查询调用参数");
        Preconditions.checkArgument(
                jsonObject.get("errorCode") != null && 0 == jsonObject.getIntValue("errorCode"), "图片请求出错: %s", jsonObject.get("msg"));
        return jsonObject;
    }

    private String sign(String timeStamp) {
        return SignatureHelper.hmcSha1Sign(
                imageServerInfo.getPassword(),
                String.format("%s%s%s", imageServerInfo.getUsername(), imageServerInfo.getPassword(), timeStamp));
    }

    private String fetchUrlFormat(String hostname, List<NameValuePair> parameterList) {
        Preconditions.checkNotNull(imageServerInfo, "图片服务信息为空");

        return String.format("%s://%s%s?%s",
                imageServerInfo.getProtocol(),
                hostname,
                ServiceUrl.ImageDownload,
                parameterStringBuild(parameterList));
    }

    private String downloadNodeUrlFormat(List<NameValuePair> parameterList) {
        Preconditions.checkNotNull(imageServerInfo, "图片服务信息为空");

        return String.format("%s://%s%s?%s",
                imageServerInfo.getProtocol(),
                imageServerInfo.getHostname(),
                ServiceUrl.FetchImageRepoNode,
                parameterStringBuild(parameterList));
    }

    private String parameterStringBuild(List<NameValuePair> parameterList) {
        return parameterList.stream()
                .map((Function<NameValuePair, String>) nameValuePair -> String.format("%s=%s", nameValuePair.getName(), nameValuePair.getValue()))
                .reduce((s, s2) -> String.format("%s&%s", s, s2)).orElse("");
    }
}
