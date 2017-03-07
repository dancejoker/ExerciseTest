package com.relation;

import com.autowire.Address;
import com.autowire.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/1/24 0024.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-relation.xml");
//        Address address = (Address) ctx.getBean("address");
//        System.out.println(address);
        Address address1 = (Address) ctx.getBean("address1");
        System.out.println(address1);

        Person person = (Person) ctx.getBean("person");
        System.out.println(person);
    }
}
