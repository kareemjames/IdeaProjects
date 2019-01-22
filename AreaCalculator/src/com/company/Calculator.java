package com.company;

public class Calculator {

    private double width;
    private double height;
    private double base;
    private double area;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    private String shape;

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateArea() {

        if(shape.equals("rectangle")) {
            area = width * height;
        } else if (shape.equals("triangle")){
            area = (base * height) / 2;
        } else {
            System.out.println("We only do Rectangles and Triangles!");
        }

        return area;
    }
}
