package com.etc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.etc.feigninters")
public class SpringmanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringmanagerApplication.class, args);
    }

}
