package com.bean.scope;

import com.autowire.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/1/25 0025.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-scope.xml");
        Car car = (Car) ctx.getBean("car");
        Car car1 = (Car) ctx.getBean("car");
        System.out.println(car == car1);
    }
}
