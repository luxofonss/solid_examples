package com.example.solid_example.interface_segregation;

public class NonISToyCar implements NonISToy{
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
        System.out.println("Car is moving");
    }

    @Override
    public void fly() {
        System.out.println("Car is flying");
    }
}
