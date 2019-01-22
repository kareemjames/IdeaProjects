package com.company;

public class DogDemo {

    public static void main(String[] args) {

        Dog myDog = new Dog();

        myDog.setName("Dexter");
        myDog.setBreed("Pitbull");
        myDog.setAge(1);

        System.out.println("My dog's name is " + myDog.getName());
        System.out.println("My dog's breed is " + myDog.getBreed());
        System.out.println("My dog's age is " + myDog.getAge());
    }
}
