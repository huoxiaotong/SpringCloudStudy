package com.mumu.feign;

import com.mumu.feign.service.UserFeignservice;
import com.mumu.feign.service.UserFeignservice1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FeignUserServerApplicationTests {

    @Autowired
    private UserFeignservice userFeignservice;
    @Autowired
    private UserFeignservice1 userFeignservice1;


    @Test
    public void contextLoads() {
        System.out.println(userFeignservice.sayHiFromClientOne("name"));
    }

    @Test
    public void contextLoads1() {
        System.out.println(userFeignservice1.sayHiFromClientOne("name"));
    }

}

