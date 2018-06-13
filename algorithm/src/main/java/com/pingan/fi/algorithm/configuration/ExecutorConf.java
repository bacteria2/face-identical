package com.pingan.fi.algorithm.configuration;

import com.pingan.fi.algorithm.engine.impl.FiServiceExecutor;
import com.pingan.fi.algorithm.engine.impl.ImageExecutor;
import com.pingan.fi.algorithm.model.env.FiServerInfo;
import com.pingan.fi.algorithm.model.env.ImageServerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author IonCannon
 * @date 2018/6/11
 * @decription : content
 */
@Configuration
public class ExecutorConf {

    @Bean
    @Autowired
    public FiServiceExecutor fiServiceExecutor(FiServerInfo serverInfo){
        return new FiServiceExecutor(serverInfo);
    }

    @Bean
    @Autowired
    public ImageExecutor imageExecutor(ImageServerInfo imageServerInfo){
        return new ImageExecutor(imageServerInfo);
    }


}
