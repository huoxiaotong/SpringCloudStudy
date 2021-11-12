package com.mumu.bootjpa.repository;

import com.mumu.bootjpa.entity.UserJpa;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserJpaRepositoryTest {

    @Autowired
    UserJpaRepository userJpaRepository;

    @Test
    public void saveAll() {
        List<UserJpa> alls=userJpaRepository.findAll();
        int i= 1;
        for (UserJpa jpa : alls){

            jpa.setId(null);
            jpa.setName("李四"+i++);
        }
        System.out.println(alls);
        userJpaRepository.saveAll(alls);
    }
}