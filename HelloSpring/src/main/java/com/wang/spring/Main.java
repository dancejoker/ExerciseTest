package com.wang.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hadoop on 2017/1/4 0004.
 */
public class Main {
    public static void main(String[] args) {
/*
    Spring 提供了2种类型的IOC容器实现
    BeanFactory
    ApplicationContext(其中实现类有以下2种,)
    ClassPathXmlApplicationContext 从类路径下加载配置文件
    FileSystemXmlApplicationContext 从文件流中加载配置文件
 */

        //创建Spring的IOC容器对象
        //AplicationContext在初始化上下文时就实例化所有单例的Bean
        //ApplicationContext代表IOC容器，
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        //从IOC  容器中获取Bean实例
        //利用id定位到IOC容器中的bean
        HelloSpring helloSpring = (HelloSpring) ctx.getBean("hellospring");
        //利用类型返回IOC容器中的Bean，但要求IOC容器中必须只能有一个该类型的bean
        //  HelloSpring helloSpring = ctx.getBean(HelloSpring.class);
        //调用hello方法
        helloSpring.hello();


        Car car = (Car) ctx.getBean("car");
        System.out.println(car);

        car = (Car) ctx.getBean("car2");
        System.out.println(car);

        Person person = (Person) ctx.getBean("person");
        System.out.println(person);

        Person person2 = (Person) ctx.getBean("person2");
        System.out.println(person2);

//        Person person3 = (Person) ctx.getBean("person3");
//        System.out.println(person3);

        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        System.out.println(dataSource);

    }

}
