package com.spring.bean;

import com.wang.spring.Car;

import java.util.List;

/**
 * Created by Administrator on 2017/1/18 0018.
 */
public class Person {
    private String name;
    private int age;
    private List<Car> cars;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Car> getCars() {
        return cars;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                '}';
    }
}
