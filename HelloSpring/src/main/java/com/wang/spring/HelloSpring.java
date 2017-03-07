package com.wang.spring;

/**
 * Created by hadoop on 2017/1/4 0004.
 */
public class HelloSpring {
    private String name ;

    public void setName(String name) {
        this.name = name;
    }
    public void hello(){
        System.out.println("hello spring : " + name);
    }
}

