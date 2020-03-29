package com.mumu.validation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient
public class ValidationServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ValidationServerApplication.class, args);
    }

}

