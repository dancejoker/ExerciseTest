package com.annotation.service;

import com.annotation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/2/1 0001.
 */
//业务层
@Service
public class UserService {
    //自动装配具有兼容类型的单个Bean属性：构造器，
    //普通字段（即使是非public）,一切具有参数的方法
    //所有使用@Autowired注解的属性都需要被设置，当Spring找不到
    //匹配的Bean装配属性时，会抛出异常。
    //若某一属性允许不被设置，可以设置@Autowired注解的required
    //属性为false。eg:@Autowired(required=false)
//    @Autowired
//    @Qualifier("userJdbcRepository")
    private UserRepository userRepository;

    /**
     * 当IOC容器里存在多个类型兼容的Bean时，通过类型的自动装配
     * 将无法工作，此时可以在@Qualifier注解里提供bean的名称，
     * Spring允许对方法的入参标注@Qualifier已指定注入bean的名称
     */
    @Autowired
    public void setUserRepository(@Qualifier("userJdbcRepository")UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public  void add(){
        System.out.println("UserService add...");
        userRepository.save();
    }
}
