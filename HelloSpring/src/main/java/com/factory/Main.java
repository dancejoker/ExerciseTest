package com.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/2/1 0001.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-factory.xml");
        Car car1 = (Car)ctx.getBean("car1");
        System.out.println(car1);
        Car car2 = (Car)ctx.getBean("car2");
        System.out.println(car2);
    }
}
