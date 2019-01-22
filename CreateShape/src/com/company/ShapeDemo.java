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
                    System.out.println("Success " + option);
                    error = false;
                } else {
                    System.out.println("Please enter a vaild choice");
                    error = true;
                }

                switch(option) {
                    case 1:
                        System.out.println("You have chosen to make a circle");
                        System.out.println("Can you please provide the radius of the circle");

                        Circle circle = new Circle();
                        double circleRadius = scan.nextInt();
                        circle.setRadius(circleRadius);
                        double circleArea = circle.area();
                        System.out.println("You have created a circle with the radius of " + circle.getRadius() + " diameter of " + circle.getDiamter() + " and the area of " + circleArea);
                        break;
                    case 2:
                        System.out.println("You have choosen option 2");
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
