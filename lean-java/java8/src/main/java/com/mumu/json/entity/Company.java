package com.mumu.json.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @ClassName Company
 * @Description: TODO
 * @Author: pc
 * @Date: Created in 2020/2/16 16:39
 * @Version: 1.0
 * @Modified By:
 */
@Data
public class Company extends BaseEntity implements Serializable {
    private String address;
    private BigDecimal money;
    private Date createTime;
    private Date updateTime;
    private List<User> users;
}
