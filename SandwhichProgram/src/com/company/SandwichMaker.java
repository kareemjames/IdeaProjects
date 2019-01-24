package com.company;

public class SandwichMaker {

    public static void main(String[] args) {

        Sandwich pbj = new Sandwich("whole wheat", "peanut butter", "none", false);

        pbj.describeSandwich();

        Sandwich wgt = new Sandwich("turkey", "pepper jack", true);
        wgt.describeSandwich();
    }
}
