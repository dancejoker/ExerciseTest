package com.autowire;

/**
 * Created by Administrator on 2017/1/19 0019.
 */
public class Person {
    private String name;
    private Address adresss;
    private Car car;

    public void setName(String name) {
        this.name = name;
    }

    public void setAdresss(Address adresss) {
        this.adresss = adresss;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public Address getAdresss() {
        return adresss;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", adresss=" + adresss +
                ", car=" + car +
                '}';
    }
}
