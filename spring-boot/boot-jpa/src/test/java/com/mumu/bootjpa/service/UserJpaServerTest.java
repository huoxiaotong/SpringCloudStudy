package com.mumu.bootjpa.service;

import com.mumu.bootjpa.entity.UserJpa;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserJpaServerTest {

    @Autowired
    UserJpaServer userJpaServer;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void save() {
        UserJpa jpa = new UserJpa();
        jpa.setAge(18);
        jpa.setName("张三");
        userJpaServer.save(jpa);
    }



    @Test
    public void testSave() {
    }
}
