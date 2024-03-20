package com.example.solid_example.interface_segregation;

public class ToyPlane implements FlyAble, Movable, Toy {
    private double price;
    private String color;
    @Override
    public void fly() {
        System.out.println("ToyPlane is flying");
    }

    @Override
    public void move() {
        System.out.println("ToyPlane is moving");
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
