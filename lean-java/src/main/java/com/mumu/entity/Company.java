package com.mumu.entity;

import java.io.Serializable;

/**
 * @ClassName Company
 * @Description: TODO
 * @Author: pc
 * @Date: Created in 2020/2/16 16:39
 * @Version: 1.0
 * @Modified By:
 */
public class Company implements Serializable {

    private Long id;
    private String name;
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
