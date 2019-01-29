package com.company;

public class CarDemo {

    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.setMake("Subaru");
        myCar.setModel("Wrx");

        myCar.printCarDetails();

        Car mySecondCar = new Car();
        mySecondCar.setMake("Honda");
        mySecondCar.setModel("Civic Si");

        mySecondCar.printCarDetails();

        String fullName = new String("Kareem James");
        String fullNameLower = "kareem james";
        String myName = "Kareem";
        String buddyName = "Omar";

        System.out.println(fullName.equals(fullNameLower));
        System.out.println(fullName.equalsIgnoreCase(fullNameLower));
        System.out.println(fullName.length());
        System.out.println(fullName.concat(" Bread"));
        System.out.println(fullName.charAt(3));
        System.out.println(myName.compareTo(buddyName));
        System.out.println(myName.replace('e', 'z'));
        System.out.println(myName.substring(4));



    }
}
