package com.company;

public class Main {

    public static void main(String[] args) {

        isPalindrome("racecar");
        System.out.println(isPalindromeNoSpaceOrSpecial("Was it a car or a cat I saw?"));

    }

    public static void isPalindrome(String x) {

        String reverse = "";

        for (int i = x.length() - 1; i >= 0; i--) {
            reverse = reverse + x.charAt(i);
        }
        System.out.println(reverse);

        if(x.equals(reverse)) {
            System.out.println("This is a Palindrome");
        } else {
            System.out.println("This is not a Palindrome");
        }

    }

    public static boolean isPalindromeNoSpaceOrSpecial(String x) {

        String stripedX = x.replaceAll("[^a-zA-z0-9]", "");

        StringBuilder stringBuilder = new StringBuilder(stripedX);
        stringBuilder.reverse();

        return stripedX.equalsIgnoreCase(stringBuilder.toString());
    }
}
