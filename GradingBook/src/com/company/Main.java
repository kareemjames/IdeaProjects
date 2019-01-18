package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your grade");
	    int grade = scan.nextInt();

	    if (grade < 60) {
            System.out.println("You failed");
        } else if (grade >= 60 && grade < 63) {
            System.out.println("You got a D-");
        } else if (grade >= 63 && grade < 67) {
            System.out.println("You got a D");
        } else if (grade >= 67 && grade < 70) {
            System.out.println("You got a D+");
        } else if (grade >= 70 && grade < 73) {
            System.out.println("You got a C-");
        } else if (grade >= 73 && grade < 77) {
            System.out.println("You got a C");
        } else if (grade >= 77 && grade < 80) {
            System.out.println("You got a C+");
        } else if (grade >= 80 && grade < 83) {
            System.out.println("You got a B-");
        } else if (grade >= 83 && grade < 87) {
            System.out.println("You got a B");
        }else if (grade >= 87 && grade < 90) {
            System.out.println("You got a B+");
        } else if (grade >= 90 && grade < 93) {
            System.out.println("You got a A-");
        } else if (grade >= 93 && grade < 97) {
            System.out.println("You got a A");
        } else if (grade >= 97 && grade < 101) {
            System.out.println("You got a A+");
        }
	    else {
            System.out.println("Please enter valid grade");
        }
    }
}
