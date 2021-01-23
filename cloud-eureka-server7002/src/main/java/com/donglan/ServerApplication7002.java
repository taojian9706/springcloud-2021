package com.donglan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author TAOJIAN
 * @version 1.0
 * @since 2021-01-23 14:06:15
 */
@SpringBootApplication
@EnableEurekaServer
public class ServerApplication7002 {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication7002.class, args);
    }
}
