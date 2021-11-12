package com.mumu.sdk.impl.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "t_prdu_th_b")
public class ThirdProductEnB extends SubProductEn {

    @Column(name = "th_name_b")
    private String thirdNameB;

}
