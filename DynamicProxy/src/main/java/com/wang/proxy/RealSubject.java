package com.wang.proxy;

/**
 * Created by Administrator on 2017/3/7 0007.
 */
public class RealSubject implements Subject {
    public void helloworld() {
        System.out.println("hello proxy world");
    }

    public void rent() {
        System.out.println("rent somebody some money");
    }
}
