package com.mumu.sdk.impl.entity;

import lombok.Data;


import javax.persistence.*;

@Data
@MappedSuperclass
public class BaseProductEn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

}
