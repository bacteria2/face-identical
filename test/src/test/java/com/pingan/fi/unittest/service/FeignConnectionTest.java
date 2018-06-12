package com.pingan.fi.unittest.service;


//import KettleService;

import com.pingan.fi.test.services.ReflectionDemo;
import com.pingan.fi.unittest.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.MessageFormat;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

//import org.springframework.cloud.openfeign.EnableFeignClients;


public class FeignConnectionTest extends BaseTest {
    //  @Autowired
    // KettleService service;
    //  @Test
    // public void transSubmitTest() {
    //    System.out.println(service.getStatusByJobId("ttt1231232"));
    //  }
    private  int[] a=new int[10];
    private long b=1000;
    private long c;

    @Test
    public void testRest() {
        RestTemplate restTemplate = new RestTemplate();
        String body = restTemplate.getForObject("http://www.baidu.com", String.class);


        System.out.println(body);
    }

    @Test
    public void testBase64(){
        System.out.println(Base64.getEncoder().encodeToString(String.format("%s:%s","cluster","cluster").getBytes()));
    }
    @Test
    public void testArray(){
        try {
          Method helloWorld=  ReflectionDemo.class.getMethod("helloWorld1");
            Method helloWorld2=  ReflectionDemo.class.getDeclaredMethod("helloWorld2");
            helloWorld2.setAccessible(true);
          Object obj=  ReflectionDemo.class.newInstance();
            Map<String,Method> methodMap=new HashMap<>();

            methodMap.put("a",helloWorld);
            methodMap.put("b",helloWorld2);

            methodMap.get("a").invoke(obj);
            methodMap.get("b").invoke(obj);
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    private static String Stringformat(String host,String... args ){
        return MessageFormat.format("{0}host1,{1},%s",host,args);
    }
}
