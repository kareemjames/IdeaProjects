package com.company;

import java.util.Scanner;

public class AddressBookDemo {

    public static void main(String[] args) {
        boolean areBrowsing = false;
        Scanner scan = new Scanner(System.in);
        int option;

        // instantiate addyBook
        AddyBook addyBook = new AddyBook();

        do {

            System.out.println("Welcome to your book of contacts. What would you like to do?");
            System.out.println("1 view current contacts \n2 add a contact \n3 search by name \n4 search by phone \n5 delete contact \n6 quit");
            option = scan.nextInt();

            switch(option) {
                case 1:
                    if(addyBook.numberOfContacts() == 0) {
                        System.out.println("You have no contacts yet, please add one");
                        areBrowsing = true;
                    } else {
                        return;
                    }
                    break;
                default:
                    break;

            }

        } while(areBrowsing);
    }
}
