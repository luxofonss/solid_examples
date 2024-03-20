package com.example.solid_example.liskov;

public abstract class Shape {
    protected int height;
    protected int width;
    public abstract void setHeight(int height);
    public abstract int getHeight();
    public abstract void setWidth(int width);
    public abstract int getWidth();
    public int getArea() {
        return this.height * this.width;
    }
}
