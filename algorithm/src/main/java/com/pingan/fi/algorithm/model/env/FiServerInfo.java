package com.pingan.fi.algorithm.model.env;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author IonCannon
 * @date 2018/6/11
 * @decription : 人脸识别服务器信息
 */

public class FiServerInfo {

    private String uriPrefixFor1V1;

    private String hostnameFor1V1;

    private String uriPrefixFor1VN;

    private String hostnameFor1VN;


    private String protocol="http";

    private int timeout=2000;


    public String getUriPrefixFor1V1() {
        return uriPrefixFor1V1;
    }

    public void setUriPrefixFor1V1(String uriPrefixFor1V1) {
        this.uriPrefixFor1V1 = uriPrefixFor1V1;
    }

    public String getHostnameFor1V1() {
        return hostnameFor1V1;
    }

    public void setHostnameFor1V1(String hostnameFor1V1) {
        this.hostnameFor1V1 = hostnameFor1V1;
    }

    public String getUriPrefixFor1VN() {
        return uriPrefixFor1VN;
    }

    public void setUriPrefixFor1VN(String uriPrefixFor1VN) {
        this.uriPrefixFor1VN = uriPrefixFor1VN;
    }

    public String getHostnameFor1VN() {
        return hostnameFor1VN;
    }

    public void setHostnameFor1VN(String hostnameFor1VN) {
        this.hostnameFor1VN = hostnameFor1VN;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

   public enum ServiceType{
        Search1V1,Search1VN;

        private int type;

   }
}
