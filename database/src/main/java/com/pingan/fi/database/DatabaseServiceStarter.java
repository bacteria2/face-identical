package com.pingan.fi.database;

import org.springframework.boot.Banner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author IonCannon
 * @date 2018/6/12
 * @decription : content
 */
@SpringBootApplication
@EnableEurekaClient

public class DatabaseServiceStarter {
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(DatabaseServiceStarter.class)
                .bannerMode(Banner.Mode.OFF)
                .web(WebApplicationType.SERVLET)
                .build()
                .run(args);

    }
}
