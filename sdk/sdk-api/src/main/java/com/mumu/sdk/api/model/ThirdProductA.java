package com.mumu.sdk.api.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ThirdProductA extends SubProduct {

    private String thirdName;

}
