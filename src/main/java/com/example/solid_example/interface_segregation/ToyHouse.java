package com.example.solid_example.interface_segregation;

public class ToyHouse implements Toy{
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
}
