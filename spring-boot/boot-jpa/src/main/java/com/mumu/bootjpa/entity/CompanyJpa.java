package com.mumu.bootjpa.entity;

import javax.persistence.*;

@Entity
@Table(name="company")
public class CompanyJpa {

    @Id
    // 字段自动生成
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "address")
    private int addres;
    private String companyName;


//    private UserJpa userJpa;

    public CompanyJpa() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAddres() {
        return addres;
    }

    public void setAddres(int addres) {
        this.addres = addres;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "CompanyJpa{" +
                "id=" + id +
                ", addres=" + addres +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
