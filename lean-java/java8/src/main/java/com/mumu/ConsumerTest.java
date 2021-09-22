package com.mumu;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
    public static <T> List<T> filter(List<T> list , Consumer<T> c){
        List<T> result = new ArrayList<>();
        for (T s:list){
            c.accept(s);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        Consumer<String> consumer = (String s) -> System.out.println(s);
        filter(stringList,consumer);
        filter(stringList,(String s) -> System.out.println(s));
    }
}
