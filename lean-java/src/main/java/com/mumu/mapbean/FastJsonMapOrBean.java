package com.mumu.mapbean;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mumu.entity.Company;
import com.mumu.entity.User;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 反射机制实现  map和bean  之间互转
 *
 */
public class FastJsonMapOrBean {

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
        company.setAddress("北京");
        company.setName("新晨");
        company.setId(100L);
        company.setCreateTime(new Date());
        company.setMoney(new BigDecimal(1000));

        company.setUsers(users);
        // 对象转换map
        Map<String, Object> map = JSONObject.parseObject(JSONObject.toJSONString(company));
        System.out.println(map);
        // map转换对象
        map.put("address","成都");
        Company company1 = JSON.parseObject(JSON.toJSONString(map), Company.class);
        System.out.println(JSONObject.toJSON(company1));
    }




}
