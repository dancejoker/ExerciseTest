package com.cycle;

/**
 * Created by Administrator on 2017/1/28 0028.
 */
public class Car {
    public Car() {
        System.out.println("Car's Constructor..");
    }
    public String brand;

    public void setBrand(String brand) {
        System.out.println("setBrand....");
        this.brand = brand;
    }


    public void init2(){
        System.out.println("init.....");
    }
    public void destroy(){
        System.out.println("destroy....");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
