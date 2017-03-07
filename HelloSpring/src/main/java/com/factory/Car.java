package com.factory;

/**
 * Created by Administrator on 2017/2/1 0001.
 */
public class Car {
    private String brand;
    private double price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public Car() {
        System.out.println("Car's Constructor....");
    }

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
}
