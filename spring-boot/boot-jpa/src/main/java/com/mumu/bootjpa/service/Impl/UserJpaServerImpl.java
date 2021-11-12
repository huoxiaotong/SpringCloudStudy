package com.mumu.bootjpa.service.Impl;

import com.mumu.bootjpa.entity.UserJpa;
import com.mumu.bootjpa.repository.UserJpaRepository;
import com.mumu.bootjpa.service.UserJpaServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserJpaServerImpl implements UserJpaServer {

    @Autowired
    UserJpaRepository userJpaRepository;

    @Override
    public Long save(UserJpa jpa){
        userJpaRepository.save(jpa);
        return jpa.getId();
    }

}
