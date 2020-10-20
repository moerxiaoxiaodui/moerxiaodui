package com.etc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringuserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringuserApplication.class, args);
    }

}
