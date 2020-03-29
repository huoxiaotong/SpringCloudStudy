package com.mumu.thread;

import java.util.TreeMap;
import java.util.concurrent.locks.ReentrantLock;

public class ReturnLockTest {

    private ReentrantLock reentrantLock = new ReentrantLock(false);

    public void fairlLock(){
        try{
            reentrantLock.lock();
            System.out.println(Thread.currentThread().getName()+"正在持有锁");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println(Thread.currentThread().getName()+"释放了锁");
            reentrantLock.unlock();
        }
    }

    public static void main (String[] args){
        ReturnLockTest returnLockTest = new ReturnLockTest();
        Runnable runnable =()->{
            System.out.println(Thread.currentThread().getName()+"启动");
            returnLockTest.fairlLock();
        };

        Thread[] thread = new Thread[10];
        for (int i = 0;i<10;i++){
            thread[i] = new Thread(runnable);
        }

        String a = "100",b="100";
        for (int i = 0;i<10;i++){
            if (a==b){
                System.out.println("11111");
            }
            thread[i].start();
        }
    }
}
