package com.args;

import java.lang.management.ManagementFactory;

/**
 * Created by Administrator on 2017/2/24 0024.
 */
public class Main {
    public static void main(String[] args) {
        String name = ManagementFactory.getRuntimeMXBean().getName();
        String pid = name.split("@")[0];
        System.out.println("Pid is :" + pid);
        new Helloworld().helloworld();
        Helloworld helloworld = new Helloworld();
//        System.out.println(helloworld.getClass());
//        if(helloworld instanceof ){
//
//        }
        try {
            helloworld.setH(6);
            Helloworld helloworld1 = (Helloworld)helloworld.clone();

            System.out.println(helloworld1.getH());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
