package com.company;

public class Main {

    public static void main(String[] args) {

        isPalindrome("Was it a car or a cat I saw");

    }

    public static void isPalindrome(String x) {

        String reverse = "";

        for (int i = x.length() - 1; i >= 0; i--) {
            reverse = reverse + x.charAt(i);
        }

        if(x.equalsIgnoreCase(reverse)) {
            System.out.println("This is a Palindrome");
        } else {
            System.out.println("This is not a Palindrome");
        }

    }
}
