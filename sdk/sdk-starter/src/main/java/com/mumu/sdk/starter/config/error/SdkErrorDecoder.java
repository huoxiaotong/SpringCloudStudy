package com.mumu.sdk.starter.config.error;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mumu.sdk.api.exception.SdkException;
import feign.Response;
import feign.codec.ErrorDecoder;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

public class SdkErrorDecoder implements ErrorDecoder {

    @Autowired
    private ObjectMapper mapper;

    @Override
    @SneakyThrows
    public Exception decode(String methodKey, Response response) {
        Response.Body body = response.body();
        if (Objects.isNull(body)) {
            return new SdkException("SDK 异常:"+ response.reason());
        }
        ErrorInfo errorInfo = mapper.readValue(body.asInputStream(), ErrorInfo.class);
        return new SdkException("SDK 异常:"+errorInfo.getMessage());
    }
}
