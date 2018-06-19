package com.pingan.fi.algorithm.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author IonCannon
 * @date 2018/6/11
 * @decription : content
 */

@Configuration
public class SwaggerConf {
    @Bean
    public Docket createRestApi() {
        List<ResponseMessage> responseMessageList=new ArrayList<>(4);
        responseMessageList.add(new ResponseMessageBuilder().code(200).message("success").build());
        responseMessageList.add(new ResponseMessageBuilder().code(400).message("resource not found").responseModel(new ModelRef("Error")).build());
        responseMessageList.add(new ResponseMessageBuilder().code(500).message("server error").responseModel(new ModelRef("Error")).build());

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.pingan.fi.algorithm.controller"))
                .paths(PathSelectors.any())
                .build()
                .globalResponseMessage(RequestMethod.GET,responseMessageList)
                .globalResponseMessage(RequestMethod.POST,responseMessageList);
    }

    private ApiInfo apiInfo() {
        Contact contact=new Contact("夏朝","","XIAZHAO819@pingan.com.cn");
        return new ApiInfoBuilder()
                .title("算法工程化接口详情")
                .termsOfServiceUrl("http://10.25.75.136:8090/pages/viewpage.action?pageId=360537")
                .contact(contact)

                .version("1.0")
                .build();
    }
}
