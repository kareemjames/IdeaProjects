package com.company;

public class CarDemo {

//    Create a new project in IntelliJ named CarProgram using the Command Line
//    App template
//    • Initialize your project as a Git repository and be sure to add and commit all changes as you work
//    • Rename your CarDemo file to CarDemo (right-click -> Refactor -> Rename...)
//    • Create a new Java class file (File -> New -> Java Class) named Car
//    • Define your Car class with at least (3) instance variables such as color, make, model, etc., and create accessor methods for each variable
//    • In your CarDemo class, write a program that instantiates a Car object named myCar, uses accessor methods to set each of its instance variables and then get their values, and finally prints out information about your vehicle

    public static void main(String[] args) {

        Car honda = new Car();

        honda.setMake("Honda");
        honda.setModel("Civic Si");
        honda.setColor("Electron Blue Pearl");

        System.out.println("My car make is " + honda.getMake());
        System.out.println("My car model is " + honda.getModel());
        System.out.println("My car color is " + honda.getColor());
        honda.honkHorn();

    }
}
