package com.pingan.fi.database.configuration;

import org.apache.ibatis.mapping.VendorDatabaseIdProvider;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

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

    @Bean
    public VendorDatabaseIdProvider vendorDatabaseIdProvider(){
        VendorDatabaseIdProvider vendor=    new VendorDatabaseIdProvider();
        Properties properties=new Properties();
        properties.setProperty("MySQL","mysql");
        properties.setProperty("PostgreSQL","mppdb");
        vendor.setProperties(properties);
        return vendor;
    }
}
