package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the temp in Farenheit and I will convert it to Celcius!");
        int f = scan.nextInt();
        int c = (f - 32) * 5/9;
        System.out.println("The temp in Celcius is " + c + " deg");

    }
}
