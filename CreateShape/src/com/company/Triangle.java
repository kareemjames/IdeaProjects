package com.company;

public class Triangle {
    private double base;
    private double height;
    private double sideOne;

    public double getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(double sideTwo) {
        this.sideTwo = sideTwo;
    }

    public double getSideOne() {
        return sideOne;
    }

    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }

    private double sideTwo;

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

    public double perimeter() {
        double triPerimeter = (sideOne + sideTwo + base);
        return triPerimeter;
    }
}
