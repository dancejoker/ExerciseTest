package com.spring.bean;

import com.wang.spring.Car;

import java.util.Map;

/**
 * Created by Administrator on 2017/1/19 0019.
 */
public class NewPerson {
    private String name;
    private int age;
    private Map<String,Car> cars;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Map<String, Car> getCars() {
        return cars;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCars(Map<String, Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "NewPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                '}';
    }
}
