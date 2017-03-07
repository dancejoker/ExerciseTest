package com.generic.di;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/2/2 0002.
 */
public class BaseService<T> {
    @Autowired
    protected BaseRepository<T> repository;
    public void add(){
        System.out.println("add.....");
        System.out.println(repository);
    }
}
