package com.pingan.fi.test.services;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;


import org.bouncycastle.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;

@Service
public class RestService {
    @Autowired
    private RestTemplate template;

    @HystrixCommand(fallbackMethod="fallBack")
    public String getJob(){
        String url = "http://KETTLE-SERVICE/kettle/task/getStatus?id=1";
        return   template.getForObject(url,String.class);
    }

    public String fallBack(){
        return "service unavailable now";
    }


    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException {
        SecretKeySpec signingKey=new SecretKeySpec("test".getBytes(),"HmacSHA1");

        Mac mac=Mac.getInstance("HmacSHA1");
        mac.init(signingKey);

        byte[] rawHmc=mac.doFinal("test".getBytes());

        Formatter formatter = new Formatter();
        for (byte b : rawHmc) {
            formatter.format("%02x", b);
        }

        System.out.println(formatter.toString()); ;

    }
}
