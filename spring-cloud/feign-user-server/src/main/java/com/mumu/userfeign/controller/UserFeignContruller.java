package com.mumu.userfeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mumu.userfeign.service.UserFeignservice;

/**
 * @ClassName: UserFeignContruller
 * @Description: TODO
 * @Author: huo
 * @Date: 2019/1/10 16:05
 * @Version: 1.0
 */
@RestController
public class UserFeignContruller {

    @Autowired
    private UserFeignservice userFeignservice;

    @GetMapping("info")
    public String getinfo(@RequestParam String name){
        return userFeignservice.sayHiFromClientOne(name);
    }

}
