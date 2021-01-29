package com.donglan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author TAOJIAN
 * @version 1.0
 * @since 2021-01-29 19:22:24
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "com.donglan.dao")
public class GuanliApplication8003 {
    public static void main(String[] args) {
        SpringApplication.run(GuanliApplication8003.class, args);
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
