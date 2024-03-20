package com.example.solid_example.liskov;

public class Square extends Shape{
    @Override
    public void setHeight(int height) {
        setWidthAndHeight(width);
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void setWidth(int width) {
        setWidthAndHeight(width);
    }

    @Override
    public int getWidth() {
        return width;
    }

    private void setWidthAndHeight(int value) {
        this.height = value;
        this.width = value;
    }
}
