package com.example.solid_example.liskov;

public class RectangleFactory {
    public static NonLiskovRectangle generate() {
        return new NonLiskovSquare();
    }
}
