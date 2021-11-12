package com.mumu.json.mapbean;

import com.mumu.json.entity.Company;
import com.mumu.json.entity.User;
import org.apache.commons.beanutils.BeanUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 反射机制实现  map和bean  之间互转
 *
 */
public class CommonLang3MapOrBean {

    public static void main(String[] args) throws Exception {
        List<User> users = new ArrayList<>();
        for (int i = 0;i<2;i++){
            User user = new User();
            user.setId(i+1L);
            user.setAddress("beijing");
            user.setName("zhongxin");
            user.setMoney(new BigDecimal(100));
            users.add(user);
        }
        Company company = new Company();
        company.setUsers(users);
        company.setAddress("北京");
        company.setName("新晨");
        company.setId(100L);
        company.setCreateTime(new Date());
        company.setMoney(new BigDecimal(1000));
        // 对象转成 map
        Map<String, String> map = BeanUtils.describe(company);
        System.out.println(map);
        map.put("address","中信");
        // map转成对象
        BeanUtils.populate(company,map);
        System.out.println(company);
    }




}
