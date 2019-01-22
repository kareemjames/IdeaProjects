package com.company;

public class Calculator {

    private int width;
    private int height;
    private int base;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    private String shape;

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calculateArea() {

        int area = width * height;
        return area;
    }
}
