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
            }


        }while(error);


    }
}
