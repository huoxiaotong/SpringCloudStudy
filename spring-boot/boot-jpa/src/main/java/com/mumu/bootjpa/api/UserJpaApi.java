package com.mumu.bootjpa.api;

import com.mumu.bootjpa.entity.UserJpa;
import com.mumu.bootjpa.service.UserJpaServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class UserJpaApi {

    @Autowired
    UserJpaServer userJpaServer;

    @GetMapping("/save")
    public String save(){
        UserJpa jpa = new UserJpa();
        jpa.setAge(18);
        jpa.setName("张三");
        userJpaServer.save(jpa);
        return "success="+jpa;
    }
    @PostMapping("/page")
    public String geta(Pageable pageable){

        System.out.println(pageable);
        return "我的生活";
    }

}
