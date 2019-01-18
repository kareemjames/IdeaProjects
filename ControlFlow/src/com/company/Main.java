package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Print out larger number
//        int x = 10;
//	    int y = 15;
//
//	    if (x > y) {
//            System.out.println(x + " is greater than " + y);
//        } else {
//            System.out.println(y + " is the greater than " + x);
//        }
//
//        // Print larger number after user input
//        String a;
//        String b;
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter first number");
//        a = scan.nextLine();
//        System.out.println("Please enter second number");
//        b = scan.nextLine();
//
//        if (Integer.parseInt(a) > Integer.parseInt(b)) {
//            System.out.println(a);
//        } else {
//            System.out.println(b);
//        }

        // Print numbers smallest to largest
        String c;
        String d;
        String e;
        ArrayList<Integer> numList = new ArrayList<Integer>();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Please enter first num");
        c = scan2.nextLine();
        numList.add(Integer.parseInt(c));
        System.out.println("Please enter second num");
        d = scan2.nextLine();
        numList.add(Integer.parseInt(d));
        System.out.println("Please enter third num");
        e = scan2.nextLine();
        numList.add(Integer.parseInt(e));

        Collections.sort(numList);
        for (int i = 0; i < numList.size(); i++) {
            System.out.println(numList.get(i));
        }

    }
}
