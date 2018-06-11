package com.pingan.fi.registry;

import org.springframework.boot.Banner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerStart {
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(EurekaServerStart.class)
                .logStartupInfo(false)
                .web(WebApplicationType.SERVLET)
                .bannerMode(Banner.Mode.OFF)
                .build()
                .run(args);
    }
}
