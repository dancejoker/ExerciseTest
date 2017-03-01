package com.args;

import java.lang.management.ManagementFactory;

/**
 * Created by Administrator on 2017/2/24 0024.
 */
public class Helloworld implements Cloneable{

    private int h = 5;
    public  void helloworld(){
        int num = 0;
        while(num != 10) {
            String name = ManagementFactory.getRuntimeMXBean().getName();
            String pid = name.split("@")[0];
//            System.out.println("Function pid is :" + pid);
//            System.out.println("Hi ,my world");
            num++;
        }
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        return new Helloworld();
        return super.clone();
    }
}
