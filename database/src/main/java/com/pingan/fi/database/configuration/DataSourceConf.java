package com.pingan.fi.database.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author IonCannon
 * @date 2018/6/12
 * @decription : content
 */
@Configuration
@EnableTransactionManagement
public class DataSourceConf {

    @Bean
    @ConfigurationProperties(prefix = "datasource")
    public DataSource dataSource(){
        return DataSourceBuilder.create().build();
    }
}
