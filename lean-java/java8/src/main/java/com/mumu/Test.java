package com.mumu;

public class Test {
    public static void main(String[] args) {

//        Optional  // 避免出现 null
//        Comparable
//        Predicate
//        Consumer

//        Function;
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("11111");
            }
        });
        Thread thread2 = new Thread(() -> System.out.println("22222"));

    }


}
