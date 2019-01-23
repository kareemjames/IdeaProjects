package com.company;

import java.util.Scanner;

public class ShapeDemo {

    public static void main(String[] args) {

        // Scanner
        Scanner scan = new Scanner(System.in);
        boolean error = false;

        do {
            System.out.println("What shape would you like to make?");
            System.out.println("1 for Circle");
            System.out.println("2 for Triangle");
            System.out.println("3 for Square");
            int option;

            // Validation for choices
            if(scan.hasNextInt()) {
                option = scan.nextInt();
                if(option == 1 || option == 2|| option == 3) {
                    error = false;
                }

                switch(option) {

                    // Circle
                    case 1:
                        System.out.println("You have chosen to make a Circle");
                        System.out.println("Can you please provide the radius of the circle");

                        Circle circle = new Circle();
                        double circleRadius = scan.nextInt();
                        circle.setRadius(circleRadius);
                        double circleArea = circle.area();
                        double circlePerimeter = circle.perimeter();

                        System.out.println("You have created a circle with the radius of " + circle.getRadius() + " diameter of " + circle.getDiamter() + "  the area of " + circleArea + " and the perimeter of " + circlePerimeter);
                        break;

                    // Triangle
                    case 2:
                        System.out.println("You have chosen to make a Triangle");
                        System.out.println("Can you please provide the base of the triangle");

                        Triangle triangle = new Triangle();
                        double triBase = scan.nextInt();
                        triangle.setBase(triBase);
                        System.out.println("Can you please provide the height of the triangle");
                        double triHeight = scan.nextInt();
                        triangle.setHeight(triHeight);
                        System.out.println("Can you please provide the length of the first side");
                        double s1 = scan.nextInt();
                        triangle.setSideOne(s1);
                        System.out.println("Can you please provide the length of the second side");
                        double s2 = scan.nextInt();
                        triangle.setSideTwo(s2);

                        double triPeri = triangle.perimeter();
                        double triArea = triangle.area();

                        System.out.println("You have created a Triangle with a base of " + triangle.getBase() + " a height of " + triangle.getHeight() + " an area of " + triArea + " and a periment of " + triPeri);
                        break;

                    // Square
                    case 3:
                        System.out.println("You have chosen to make a Square");
                        System.out.println("Can you please provide the length of a side");

                        Square square = new Square();
                        double side = scan.nextInt();
                        square.setSide(side);

                        double squareArea = square.area();
                        double squarePeri = square.perimeter();

                        System.out.println("You have created a Square with a side length of " + side + " a perimenter of " + squarePeri + " and an area of " + squareArea);

                        break;
                    default:
                        System.out.println("default");
                        break;
                }
            } else {
                System.out.println("Please enter a valid choice");
                error = true;
                scan.next();
            }

        } while(error);


    }
}
