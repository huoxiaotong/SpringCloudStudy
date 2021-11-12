package com.mumu.bootjpa.entity;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@Table(name = "address" ,schema = "住址表")
@DynamicUpdate
public class Address {

    @Id
    // 字段自动生成
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "name", nullable = true, length = 20)
    private String name;

    @Column(name = "address", nullable = true, length = 20)
    private String address;

    @Column(name = "zipcode", nullable = true, length = 6)
    private String zipcode;//邮政编码

    @Column(name = "zipcode1", nullable = true, length = 6)
    private String zipcode1;//邮政编码

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

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

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getZipcode1() {
        return zipcode1;
    }

    public void setZipcode1(String zipcode1) {
        this.zipcode1 = zipcode1;
    }
}
