package com.mumu.ribbon.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserServer {

    @Autowired
    private RestTemplate restTemplate;

    public String getUser(String name){
        return restTemplate.getForObject("http://USER-SERVICE/user/info?name="+name,String.class);
    }
}
