package com.mumu.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: UserContruller
 * @Description: TODO
 * @Author: huo
 * @Date: 2019/1/10 16:05
 * @Version: 1.0
 */
@RestController
public class ConfigContruller {

    @Value("${ser.prt}")
    String port;

    @GetMapping("info")
    public String getinfo(@RequestParam String name){
        return "hello word !name="+name+",port="+port;
    }

}
