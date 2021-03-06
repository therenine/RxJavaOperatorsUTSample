package com.geniusmart.rxjava.utils;

/**
 * Created by geniusmart on 2016/11/9.
 */
public class OperatorUtils {

    public static void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void logThread(String name){
        System.out.println(name + " from " + Thread.currentThread().getName());
    }
}
