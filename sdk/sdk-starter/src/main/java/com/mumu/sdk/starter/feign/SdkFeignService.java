package com.mumu.sdk.starter.feign;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.mumu.sdk.api.model.Product;
import com.mumu.sdk.starter.config.SdkFeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

//@FeignClient(value = "sdk-server/sdk" /*contextId = "user1"*/)
@FeignClient(url = "localhost:8763/sdk/",name = "sdkFeignService",configuration = SdkFeignConfig.class)
public interface SdkFeignService {

    @GetMapping(value = "/product/{code}")
    <P extends Product> ResponseEntity<ObjectNode> getProduct(@PathVariable(value = "code") String code,
                                                              @RequestHeader String clazz);

    @GetMapping(value = "/product/error1")
    void error();

}
