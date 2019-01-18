package com.company;

public class Main {

    public static void main(String[] args) {

        Double purchasePrice = 60.00;
        Double taxRate = 0.080;
        Double totalCost = purchasePrice + (purchasePrice * taxRate);

        if (totalCost < 50) {
            System.out.println("Go for it!");
        } else if (totalCost > 50 && totalCost < 100){
            System.out.println("Are you sure about this?");
        } else {
            System.out.println("I'm taking your credit card");
        }

    }
}
