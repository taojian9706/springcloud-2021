package com.donglan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author TAOJIAN
 * @version 1.0
 * @since 2021-01-23 14:02:03
 */
@SpringBootApplication
@EnableEurekaServer
public class ServerApplication7001 {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication7001.class, args);
    }
}
