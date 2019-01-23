package com.company;

public class Square {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double area() {
        double squareArea = side * side;
        return squareArea;
    }

    public double perimeter() {
        double squarePerimeter = side * 4;
        return squarePerimeter;
    }
}
