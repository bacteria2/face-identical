package com.pingan.fi.common;

/**
 * @author IonCannon
 * @date 2018/6/11
 * @decription : content
 */
public class SignatureHelper {

    public static String sha256(String secret,String... args){
        return secret;
    }

    public static String sha1(String secret,String... args){
        return secret;
    }

    public static String signature(String method,String url,String sortParam,String header,String body){
        return null;
    }
}
