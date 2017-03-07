package com.annotation;

import com.annotation.controller.UserController;
import com.annotation.repository.UserRepository;
import com.annotation.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/2/2 0002.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annotation.xml");
//        TestObject testObject = (TestObject) ctx.getBean("testObject");
//        System.out.println(testObject);

        UserController userController = (UserController) ctx.getBean("userController");
        System.out.println(userController);
        userController.execute();

//        UserService userService = (UserService) ctx.getBean("userService");
//        System.out.println(userService);
//
//        UserRepository userRepository = (UserRepository) ctx.getBean("userRepository");
//        System.out.println(userRepository);
    }
}
