package com.pingan.fi.algorithm.model.env;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author IonCannon
 * @date 2018/6/11
 * @decription : 人脸识别服务器信息
 */
//@Component
//@ConfigurationProperties(prefix = "server.fi")
public class FiServerInfo {

    private String uriPrefix;

    private String host;

    private String port;

    private String version;

    private String vendorName;


    public String getUriPrefix() {
        return uriPrefix;
    }

    public void setUriPrefix(String uriPrefix) {
        this.uriPrefix = uriPrefix;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
}
