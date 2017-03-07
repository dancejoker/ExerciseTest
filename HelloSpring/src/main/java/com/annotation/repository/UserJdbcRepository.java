package com.annotation.repository;

import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/2/2 0002.
 */
@Repository
public class UserJdbcRepository implements UserRepository {
    public void save() {
        System.out.println("UserJdbcRepository save....");
    }
}
