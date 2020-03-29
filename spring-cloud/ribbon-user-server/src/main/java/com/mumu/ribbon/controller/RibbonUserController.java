package com.mumu.ribbon.controller;

import com.mumu.ribbon.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonUserController {
    @Autowired
    private UserServer userServer;

    @GetMapping("info")
    public String getUser(@RequestParam String name){
        return userServer.getUser(name);
    }
}
