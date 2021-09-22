package com.mumu.json.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mumu.json.entity.Company;

/**
 * @ClassName GSONTest
 * @Description: TODO
 * @Author: pc
 * @Date: Created in 2020/2/16 17:00
 * @Version: 1.0
 * @Modified By:
 */
public class GSONTest {
    //不用创建对象,直接使用Gson.就可以调用方法
    private static Gson gson = null;
    //判断gson对象是否存在了,不存在则创建对象
    static {
        if (gson == null) {
            //gson = new Gson();
            //当使用GsonBuilder方式时属性为空的时候输出来的json字符串是有键值key的,显示形式是"key":null，而直接new出来的就没有"key":null的
            gson= new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        }
    }
    public static void main(String[] args){
        Company company = new Company();

        company.setId(1L);
        company.setName("北京");
//        company.setAddress("中国");
        String jsonstr = beanToStr(company);
        System.out.println(jsonstr);


        JsonObject jsonObject = strToJsonObject(jsonstr);
        System.out.println(jsonObject);

        jsonObject.addProperty("address","中国");
        System.out.println(jsonObject);

        Company company1 = strToBean(jsonObject.toString(),Company.class);

        System.err.println(company1);
    }

    /**
     * @Description: string to jsonObject
     * @Name: strToJsonObject
     * @Param jsonStr
     * @Return: com.google.gson.JsonObject
     * @Date: 2020/2/16 17:45
     * @Author: pc
     */
    public static JsonObject strToJsonObject(String jsonStr){
        try {
            JsonObject jsonObject = new JsonParser().parse(jsonStr).getAsJsonObject();
            return jsonObject;
        }finally {}
    }


    /**
     * @Description: bean to GsonStr
     * @Name: beanToString
     * @Param bean
     * @Return: java.lang.String
     * @Date: 2020/2/16 17:51
     * @Author: pc
     */
    public static String beanToStr(Object bean){

        return gson.toJson(bean);
    }

    public static <T> T strToBean(String strJson,Class<T> clazz){
        T t = null;
        if (gson != null) {
            //传入json对象和对象类型,将json转成对象
            t = gson.fromJson(strJson, clazz);
        }
        return t;
    }



}
