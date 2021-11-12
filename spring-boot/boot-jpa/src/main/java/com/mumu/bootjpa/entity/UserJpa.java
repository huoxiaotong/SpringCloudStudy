package com.mumu.bootjpa.entity;

import javax.persistence.*;

@Entity
@Table(name="user")
public class UserJpa {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO) // 字段自动生成
    private Long id;

    @Column(name = "age",length = 3,nullable = false)
    private int age;
    @Column(name = "name",length = 20,nullable = false)
    private String name;
    @Column(name = "address_id",length = 19,nullable = true)
    private Long address_id;

//    @OneToOne(cascade=CascadeType.ALL)//People是关系的维护端，当删除 people，会级联删除 address
//    @JoinColumn(name = "address_id", referencedColumnName = "id")//people中的address_id字段参考address表中的id字段
//    private Address address;

    @Transient
    private String nameEn;

    public UserJpa() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public Long getAddress_id() {
        return address_id;
    }

    public void setAddress_id(Long address_id) {
        this.address_id = address_id;
    }

//    public Address getAddress() {
//        return address;
//    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }
}
