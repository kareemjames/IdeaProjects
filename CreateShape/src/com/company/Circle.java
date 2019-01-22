package com.company;

public class Circle {
    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double area() {
        double circleArea = Math.PI * radius * radius;
        return circleArea;
    }
}
