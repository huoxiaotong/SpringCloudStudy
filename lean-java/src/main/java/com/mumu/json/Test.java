package com.mumu.json;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        ArrayList<HashMap<String,String>> lists = new ArrayList<>();
        HashMap<String,String> map = new HashMap<>();
        map.put("dd","dd");
        lists.add(map);
        HashMap<String,String> map2 = new HashMap<>();
        map2.put("ee","ee");
        lists.add(map2);
        System.out.println(JSON.toJSONString(lists));
    }
}
