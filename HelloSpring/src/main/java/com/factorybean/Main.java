package com.factorybean;

import com.factory.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/2/1 0001.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-beanfactory.xml");
        Car car = (Car) ctx.getBean("car");
        System.out.println(car);
    }
}
