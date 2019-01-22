package com.company;

public class Circle {
    private double radius;
    private double diameter;

    public double getDiamter() {
        diameter = radius * 2;
        return diameter;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        double circleArea = Math.PI * radius * radius;
        return circleArea;
    }

    public double perimeter() {
        double circlePerimeter = 2 * Math.PI * radius;
        return circlePerimeter;
    }
}
