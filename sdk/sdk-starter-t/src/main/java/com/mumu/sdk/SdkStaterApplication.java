package com.mumu.sdk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.mumu.sdk.starter.feign")
@EnableDiscoveryClient
public class SdkStaterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SdkStaterApplication.class, args);
    }

}

