package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int balance = 1000;
        int withdrawal;
        int deposit;
        boolean transacting = true;
        Scanner scan = new Scanner(System.in);

        while(transacting) {
            System.out.println("Welcome to KJ's ATM");
            System.out.println("** You may or may not get bread from this machine **");
            System.out.println("Press 1 for balance");
            System.out.println("Press 2 for deposit");
            System.out.println("Press 3 for withdrawal");
            System.out.println("Press 4 to exit");

            // Why did I have to initialize this first? Error if I do not.
            int option = 0;

            if(scan.hasNextInt()) {
                option = scan.nextInt();
            } else {
                System.out.println("Please enter a valid choice.");
                break;
            }

            switch (option) {
                case 1:
                    System.out.println("Balance: " + balance);
                    break;
                case 2:
                    System.out.println("How much money would you like to deposit?");
                    deposit = scan.nextInt();
                    balance += deposit;
                    System.out.println("You have deposited: $" + deposit + " Your new balance is: $" + balance);
                    break;
                case 3:
                    System.out.println("How much money would you like to withdrawal?");
                    withdrawal = scan.nextInt();
                    if(withdrawal > balance) {
                        System.out.println("You don't have enough bread for that transaction, secure a bag first!");
                    } else {
                        balance -= withdrawal;
                        System.out.println("You have withdrew: $" + withdrawal + " Your new balance is: $" + balance);
                    }
                    break;
                case 4:
                    transacting = false;
                    break;
                default:
                    System.out.println("Please enter a valid choice.");
            }

        }


    }
}
