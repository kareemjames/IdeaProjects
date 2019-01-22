package com.company;

import java.util.Scanner;

public class ShapeDemo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean error = false;

        do {
            System.out.println("What shape would you like to make?");
            System.out.println("1 for Circle");
            System.out.println("2 for Triangle");
            System.out.println("3 for Square");
            int option;

            if(scan.hasNextInt()) {
                option = scan.nextInt();
                if(option == 1 || option == 2|| option == 3) {
                    error = false;
                } else {
                    System.out.println("Please enter a vaild choice");
                    error = true;
                }

                switch(option) {
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
                    case 2:
                        System.out.println("You have chosen to make a Triangle");
                        System.out.println("Can you please provide the base of the triangle");

                        Triangle triangle = new Triangle();
                        double triBase = scan.nextInt();
                        triangle.setBase(triBase);
                        System.out.println("Can you please provide the height of the triangle");
                        double triHeight = scan.nextInt();
                        triangle.setHeight(triHeight);

                        double triArea = triangle.area();

                        System.out.println("You have created a Triangle with a base of " + triangle.getBase() + " a height of " + triangle.getHeight() + " and an area of " + triArea);
                        break;
                    case 3:
                        System.out.println("You have choosen option 3");
                        break;
                    default:
                        System.out.println("default");
                        break;
                }
            }




        }while(error);


    }
}
