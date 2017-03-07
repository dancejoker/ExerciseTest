package com.annotation.repository;

import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/2/1 0001.
 */

/**
 *
 * 对于扫描到的组件，Spring有默认的命名策略：使用非限定类名，第一个字母小写，
 * 也可以在注解中通过value属性值标识组件的名称
 */
//持久化层
@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {
    public void save() {
        System.out.println("UserRepository Save....");
    }
}
