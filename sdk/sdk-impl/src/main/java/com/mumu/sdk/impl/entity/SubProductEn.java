package com.mumu.sdk.impl.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "t_prdu_sub")
@Inheritance(strategy = InheritanceType.JOINED)
public class SubProductEn extends ProductEn {

    @Column(name = "sub_name")
    private String subName;

}
