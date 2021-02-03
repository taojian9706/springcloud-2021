package com.donglan.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author TAOJIAN
 * @version 1.0
 * @since 2021-02-02 20:38:57
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //本应用的所有方法都会去处理跨域请求
        registry.addMapping("/**")
            //允许远端访问的域名
            .allowedOrigins("http://localhost:4200")
            //允许请求的方法("POST", "GET", "PUT", "OPTIONS", "DELETE")
            .allowedMethods("*")
            //允许请求头
            .allowedHeaders("*");
    }
}
