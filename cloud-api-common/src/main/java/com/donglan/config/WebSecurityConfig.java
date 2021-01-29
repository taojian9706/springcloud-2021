package com.donglan.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author TAOJIAN
 * @version 1.0
 * @since 2021-01-29 19:00:14
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    //authorizeRequests 所有 security 全注解配置实现的开端，表示开始说明需要的权限
    //需要的权限分两部分，第一部分是拦截的路径，第二部分访问该路径需要的权限
    //antMarcher表示拦截说明路径，permitAll任何权限都可以访问，直接放行所有
    //anyRequest()任何请求，authenticated认证后才能访问
    //.and.csrf.disable(),固定写法，表示使用csrf拦截失败
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .antMatchers("/**").permitAll()
            .anyRequest().authenticated()
            .and().csrf().disable();
    }
}
