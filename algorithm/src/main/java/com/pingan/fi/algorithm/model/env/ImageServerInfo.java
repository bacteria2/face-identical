package com.pingan.fi.algorithm.model.env;

/**
 * @author IonCannon
 * @date 2018/6/11
 * @decription : content
 */
public class ImageServerInfo {

    private String username;

    private String password;

    private String hostname;

    private String protocol;

    private int timeout=1000;

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }
}
