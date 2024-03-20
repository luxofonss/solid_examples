package com.example.solid_example.liskov;

public class ShapeFactory {
    public static Shape generate() {
        return new Square();
    }
}
