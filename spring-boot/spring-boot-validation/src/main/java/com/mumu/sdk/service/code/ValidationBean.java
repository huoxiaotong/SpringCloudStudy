package com.mumu.sdk.service.code;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class ValidationBean {

    @NotBlank(message = "姓名不能为空")
    @Length(min = 1,message = "姓名必须大于两位")
    private String name;

    @Min(value = 10,message = "年龄必须大于10岁")
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
