package com.pingan.fi.algorithm;


import com.pingan.fi.algorithm.configuration.ExecutorConf;
import com.pingan.fi.algorithm.configuration.SwaggerConf;
import com.pingan.fi.algorithm.model.env.FiServerInfo;
import org.springframework.boot.Banner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableEurekaClient
//@EnableConfigurationProperties
@EnableSwagger2
public class AlgorithmServiceStarter {

    @Bean
    @ConfigurationProperties(prefix="server.fi")
    public FiServerInfo serverInfo(){
        return new FiServerInfo();
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