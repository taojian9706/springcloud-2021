package com.donglan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author TAOJIAN
 * @version 1.0
 * @since 2021-01-26 20:46:38
 */
@SpringBootApplication
@MapperScan(basePackages = "com.donglan.dao")
@EnableEurekaClient
@EnableTransactionManagement
public class MapModuleApplication8007 {

    public static void main(String[] args) {
        SpringApplication.run(MapModuleApplication8007.class, args);
    }
}
