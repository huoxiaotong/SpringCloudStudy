package com.mumu.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/*
2.2.4版本自持这总写法。
contextId = "user1"
*/
@FeignClient(value = "user-service/user")
public interface UserFeignservice1 {

    @RequestMapping(value = "/info1",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
