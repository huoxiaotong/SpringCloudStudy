package com.mumu.bootjpa.repository;

import com.mumu.bootjpa.entity.Address;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AddressRepositoryTest {
    @Autowired
    AddressRepository addressRepository;

    @Test
    public void save(){
        Address address = new Address();
        address.setName("天津");
        for (int i = 1; i <= 20; i++) {
            address.setId(null);
            address.setAddress("达美中信+"+i);
            address.setZipcode("444");
            addressRepository.saveAndFlush(address);
        }

    }
}