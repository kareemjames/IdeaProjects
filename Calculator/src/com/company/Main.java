package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // New scanner
	    Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the calculator, What operation would you like to perform?");
        System.out.println("1 for Addition");
        System.out.println("2 for Subtraction");
        System.out.println("3 for Multiplication");
        System.out.println("4 for Division");
        System.out.println("5 for Square Root");
        System.out.println("6 to exit");

        int option = scan.nextInt();

        switch(option) {
            case 1:
                System.out.println("Please enter the first number");
                int add1 = scan.nextInt();
                System.out.println("Please enter the second number");
                int add2 = scan.nextInt();
                int addAnswer = add1 + add2;
                System.out.println(addAnswer);
                break;
            case 2:
                System.out.println("Please enter the first number");
                int sub1 = scan.nextInt();
                System.out.println("Please enter the second number");
                int sub2 = scan.nextInt();
                int subAnswer = sub1 - sub2;
                System.out.println(subAnswer);
                break;
            case 3:
                System.out.println("Please enter the first number");
                int mult1 = scan.nextInt();
                System.out.println("Please enter the second number");
                int mult2 = scan.nextInt();
                int multAnswer = mult1 * mult2;
                System.out.println(multAnswer);
                break;
            case 4:
                System.out.println("Please beware, division can be a bit SHAKEY!!");
                System.out.println("Please enter the first number");
                int div1 = scan.nextInt();
                System.out.println("Please enter the second number");
                int div2 = scan.nextInt();
                int divAnswer = div1 / div2;
                System.out.println(divAnswer);
                break;
            case 5:
                

        }

    }
}
