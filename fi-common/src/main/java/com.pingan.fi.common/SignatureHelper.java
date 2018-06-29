package com.pingan.fi.common;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;

/**
 * @author IonCannon
 * @date 2018/6/11
 * @decription : content
 */
public class SignatureHelper {
    private final static String hmacSha1="HmacSHA1";


    public static String sha256(String secret,String... args){
        return secret;
    }


    public static String hmcSha1Sign(String password,String data){

        SecretKeySpec signingKey=new SecretKeySpec(password.getBytes(),"HmacSHA1");

        String encodeString="";

        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(signingKey);

            byte[] rawHmc=mac.doFinal(data.getBytes());
            Formatter formatter = new Formatter();

            for (byte b : rawHmc) {
                formatter.format("%02x", b);
            }

            encodeString=formatter.toString();
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            e.printStackTrace();
        }
        return encodeString;
    }

    public static String signature(String method,String url,String sortParam,String header,String body){
        return null;
    }
}
