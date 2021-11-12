package com.mumu.sdk.impl.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "t_prdu")
@Inheritance(strategy = InheritanceType.JOINED)
public class ProductEn extends BaseProductEn {

    @Column(name = "name")
    private String name;
    @Column(name = "code")
    private String code;

}
