package com.mumu.sdk.starter.config;

import com.mumu.sdk.starter.config.error.SdkErrorDecoder;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;

public class SdkFeignConfig {

    // sdk 统一异常处理
    public @Bean ErrorDecoder errorDecoder() {
        return new SdkErrorDecoder();
    }
}
