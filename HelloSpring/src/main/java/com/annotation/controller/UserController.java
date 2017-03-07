package com.annotation.controller;

import com.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Administrator on 2017/2/1 0001.
 */
//±Ìœ÷≤„
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    public void execute(){
        System.out.println("UserController execute.....");
        userService.add();
    }
}
