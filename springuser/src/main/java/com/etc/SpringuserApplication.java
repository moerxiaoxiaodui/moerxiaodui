package com.etc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableEurekaClient
//@EnableRedisHttpSession
public class SpringuserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringuserApplication.class, args);
    }


}
