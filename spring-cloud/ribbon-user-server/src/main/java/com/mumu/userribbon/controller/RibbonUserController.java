package com.mumu.userribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mumu.userribbon.server.UserServer;

@RestController
public class RibbonUserController {
    @Autowired
    private UserServer userServer;

    @GetMapping("info")
    public String getUser(@RequestParam String name){
        return userServer.getUser(name);
    }
}
