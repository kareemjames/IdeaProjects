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
                    } else {
                        for(int i = 0; i < addyBook.contacts.size(); i++) {
                            System.out.println(addyBook.contacts.get(i) + "\n");
                        }
                    }
                    areBrowsing = true;
                    break;

                    case 2:
                        System.out.println("Please enter the contact information");
                        scan.nextLine();
                        System.out.println("name");
                        String tempName = scan.nextLine();
                        System.out.println("address");
                        String tempAddress = scan.nextLine();
                        System.out.println("phone number (no dashes please)");
                        String tempPhone = scan.nextLine();
                        System.out.println("birthdate (format mm/dd/yyyy no slashes please");
                        String tempBirth = scan.nextLine();
                        addyBook.contacts.add(new Contact(tempName, tempAddress, tempPhone, tempBirth));
                        System.out.println("you have successfully added the contact " + addyBook.contacts.get(addyBook.contacts.size()-1));
                        break;
                case 3:
                    //method that takes a string and gets user input and returns it

                default:
                    break;

            }

        } while(areBrowsing);
    }
}
