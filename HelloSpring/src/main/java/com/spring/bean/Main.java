package com.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/1/18 0018.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) ctx.getBean("person3");
        System.out.println(person);
        Object newPerson = ctx.getBean("newPerson");
        System.out.println(person);
        System.out.println(newPerson);
        Person person4 = (Person) ctx.getBean("person4");
        System.out.println(person4);

    }
}
