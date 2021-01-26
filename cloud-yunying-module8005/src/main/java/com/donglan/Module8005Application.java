package com.donglan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author TAOJIAN
 * @version 1.0
 * @since 2021-01-25 11:02:22
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "com.donglan.dao")
public class Module8005Application {
    public static void main(String[] args) {
        SpringApplication.run(Module8005Application.class, args);
    }

}
