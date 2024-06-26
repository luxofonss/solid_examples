package com.example.solid_example.interface_segregation;

public class NonISToyHouse implements NonISToy{
    double price;
    String color;
    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void move() {
        System.out.println("House is moving");
    }

    @Override
    public void fly() {
        System.out.println("House is flying");
    }
}
