package com.company;


public class CalculatorDemo {

//• Create a new project in IntelliJ named AreaCalculator using the Command Line App template
//• Initialize your project as a Git repository and be sure to add and commit all changes as you work
//• Rename your CalculatorDemo file to CalculatorDemo (right-click -> Refactor -> Rename...)
//• Create a new Java class file (File -> New -> Java Class) named Calculator
//• Your Calculator should have (2) properties: width and height (with accessor methods)
//• Your Calculator should have a method named calculateArea() which:
//• Accepts width and height as parameters
//• Calculates the area of the rectangle
//• Returns the area
//• In your CalculatorDemo, create an instance of Calculator and test your calculateArea() method
//• Bonus: Modify your program so that your calculator has a shape property, and modify calculateArea() to accept shape, width, and height. Your method should then calculate the area of the shape depending on whether the shape parameter is “triangle” or “rectangle”, and should return the area

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        calc.setWidth(5);
        calc.setHeight(7);

        int area = calc.calculateArea();

        System.out.println("The width of the rectangle is " + calc.getWidth());
        System.out.println("The height of the rectangle is " + calc.getHeight());
        System.out.println("The area of this rectangle is " + area);
        
    }
}