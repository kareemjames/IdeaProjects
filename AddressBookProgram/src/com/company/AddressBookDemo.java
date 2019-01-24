package com.company;

import java.util.Scanner;

public class AddressBookDemo {

    public static void main(String[] args) {
        boolean areBrowsing = false;
        Scanner scan = new Scanner(System.in);
        int option;


        do {

            System.out.println("Welcome to your book of contacts. What would you like to do?");
            System.out.println("Press 1 to view current contacts \n 2 to add a contact \n 3 search by name \n 4 search by phone \n 5 delete contact \n 6 quit");
            option = scan.nextInt();

            switch(option) {
                case 1:
                    break;
                default:
                    break;

            }

        } while(areBrowsing);
    }
}
