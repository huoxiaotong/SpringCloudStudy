package com.mumu.sdk.impl.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class SubProductEn extends ProductEn {

    private String subName;

}
