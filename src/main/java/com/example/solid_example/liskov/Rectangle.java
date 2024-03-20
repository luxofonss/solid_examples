package com.example.solid_example.liskov;

public class Rectangle extends Shape {

    @Override
    public void setHeight(int height) {
        height = height;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void setWidth(int width) {
        width = width;
    }

    @Override
    public int getWidth() {
        return width;
    }
}
