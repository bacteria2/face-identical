package com.pingan.fi;


import com.pingan.fi.algorithm.model.env.FiServerInfo;
import com.pingan.fi.algorithm.model.env.ImageServerInfo;
import org.springframework.boot.Banner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;

import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
public class AlgorithmServiceStarter {

    @Bean
    @ConfigurationProperties(prefix="server.fi")
    public FiServerInfo serverInfo(){
        return new FiServerInfo();
    }

    @Bean
    @ConfigurationProperties(prefix="server.image")
    public ImageServerInfo imageServerInfo(){
        return new ImageServerInfo();
    }


    public static void main(String[] args) {

        new SpringApplicationBuilder()
                .sources(AlgorithmServiceStarter.class)
                .bannerMode(Banner.Mode.OFF)
                .web(WebApplicationType.SERVLET)
                .logStartupInfo(false)
                .build()
                .run(args);
    }




}
