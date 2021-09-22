package com.mumu.json.mapbean;

import com.alibaba.fastjson.JSONObject;
import com.mumu.json.entity.Company;
import com.mumu.json.entity.User;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.*;

/**
 * 反射机制实现  map和bean  之间互转
 *
 */
public class ReflexMapOrBean {
    /**
     * bean to map
     * @param obj
     * @return
     * @throws IllegalAccessException
     */
    public static Map<String, Object> objectToMap(Object obj) throws IllegalAccessException {
        Map<String, Object> map = new HashMap<>();
        Class<?> clazz = obj.getClass();
        // 获取所有MAP
        getMap(clazz,obj,map);
        return map;
    }

    /**
     * 从对象中获取map，有继承递归处理
     * @param clazz
     * @param obj
     * @param map
     * @throws IllegalAccessException
     */
    public static void getMap(Class<?> clazz,Object obj,Map<String, Object> map) throws IllegalAccessException {
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            String fieldName = field.getName();
            Object value = field.get(obj);
            if (value!=null) {
                map.put(fieldName, value);
            }
        }

        //如果该类还有父类，将父类对象中的字段也取出
        //递归获取
        Class<?> superClass = clazz.getSuperclass();
        if (superClass != null) {
            getMap(superClass,obj,map);
        }
    }




    /**
     * map to bean
     * @param map
     * @param beanClass
     * @return
     * @throws Exception
     */
    public static <T> T mapToObject(Map<String, Object> map, Class<?> beanClass) throws Exception {
        if (map == null) {
            return null;
        }
        Object obj = beanClass.newInstance();

        BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor property : propertyDescriptors) {
            Method setter = property.getWriteMethod();
            if (setter != null) {
                setter.invoke(obj, map.get(property.getName()));
            }
        }

        return (T) obj;
    }


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
        // 对象转map
        Map<String, Object> map = objectToMap(company);
        System.out.println(JSONObject.toJSONString(map));
        // map转对象
        map.put("address","成都");
        Company company1 = mapToObject(map,Company.class);
        System.out.println(JSONObject.toJSONString(company1));
    }




}
