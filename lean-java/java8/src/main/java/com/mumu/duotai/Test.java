package com.mumu.duotai;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.Map;

public class Test {
    public static void main(String[] args) {

        B1 b1 = new B1();
        b1.setB1("b1");
        b1.setA("a");
        A a = get(b1);
        B1 b11 = (B1) a;
        System.out.println(b11.getB1());
        Map<String, Object> map = JSONObject.parseObject(JSONObject.toJSONString(a));
        map.put("clazz", "com.mumu.duotai.B1");
        System.out.println(map);

        mapToEn(map);




    }

    public static <T extends A> T get(T a) {
        return a;

    }

    public static void mapToEn(Map<String, Object> map) {
        String clazzStr = (String) map.get("clazz");

        Class<?> classBook = null;
        try {
            classBook = Class.forName(clazzStr);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Object objectBook = null;
        try {
            objectBook = classBook.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("-----------------------");
        if (objectBook instanceof B1) {
            System.out.println("B1");
        }
        if (objectBook instanceof B2) {
            System.out.println("B2");
        }
        if (objectBook instanceof A) {
            System.out.println("A");
        }
        System.out.println("else");


        System.out.println("------------------------------------");

        Object a1 = JSON.parseObject(JSON.toJSONString(map), objectBook.getClass());

        System.out.println(a1);
    }
}