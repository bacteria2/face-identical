package com.pingan.fi;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.boot.Banner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * @author IonCannon
 * @date 2018/6/12
 * @decription : content
 */
@SpringBootApplication
@EnableEurekaClient
public class DatabaseServiceStarter {

//    @Bean
//    @LoadBalanced
//    public RestTemplate restTemplate(){
//        return new RestTemplate();
//    }

    @Bean
    Jackson2ObjectMapperBuilderCustomizer jsonCustomizer(){
        return jacksonObjectMapperBuilder -> {
            jacksonObjectMapperBuilder.serializationInclusion(JsonInclude.Include.NON_NULL);
        };
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(DatabaseServiceStarter.class)
                .bannerMode(Banner.Mode.OFF)
                .web(WebApplicationType.SERVLET)
                .build()
                .run(args);

    }
}
