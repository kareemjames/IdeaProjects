package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        System.out.println("The valule of a is " + a);
        System.out.println("The valule of b is " + b);
        System.out.println("a + b equals " + (a + b));
        System.out.println("a - b equals " + (a - b));
        System.out.println("a * b equals " + (a * b));
        System.out.println("a / b equals " + (a / b));
        System.out.println("The avg of a & b equals " + (a + b) / 2);
        if (a > b) {
            System.out.println("a is larger!");
        } else {
            System.out.println("b is larger!");
        }
    }
}
