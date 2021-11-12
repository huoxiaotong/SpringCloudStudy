package com.mumu;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * 返回Boolean类型
 */
public class PredicateTest {

    public static <T> List<T> filter(List<T> list , Predicate<T> p){
        List<T> result = new ArrayList<>();
        for (T s:list){
            if (p.test(s)){
                result.add(s);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        Predicate<String> predicate = (String s) -> s.length()>2;
        List<String> list = filter(stringList,predicate);
        List<String> list2 = filter(stringList,(String s) -> s.length()>2);
    }
}
