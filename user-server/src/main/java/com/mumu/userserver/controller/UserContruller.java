package com.mumu.userserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: UserContruller
 * @Description: TODO
 * @Author: huo
 * @Date: 2019/1/10 16:05
 * @Version: 1.0
 */
@RestController
public class UserContruller {

    @GetMapping("info")
    public String getinfo(){
        return "hello word !";
    }

}
