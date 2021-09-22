package com.mumu.sdk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SdkServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SdkServerApplication.class, args);
    }

}

