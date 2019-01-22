package com.company;

public class Triangle {
    private double base;
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double area() {
        double triArea = (base * height) /2;
        return triArea;
    }
}
