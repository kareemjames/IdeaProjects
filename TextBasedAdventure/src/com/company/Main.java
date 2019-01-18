package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean playing = true;
        Scanner scan = new Scanner(System.in);

        while(playing) {
            System.out.println("Your eyes are burning, your head is throbbing and you're not too sure what happened. You get up and realize that you're in clothes that don't belong to you and you have none of your belongings. You look around and see another dude sleeping, a cell phone on the counter and a book of matches. What do you want to do? Choose a number!");
            System.out.println("1. Try waking up the sleepy dude");
            System.out.println("2. Check the cell phone");
            System.out.println("3. Inspect the matches");
            System.out.println("4. Just leave");
            int option;
            option = scan.nextInt();

            switch(option) {
                case 1:
                    System.out.println("You decide to try and wake the dude up. As you get closer you glance a gun on his hip. What do you do?");
                    System.out.println("1. Run for your life?");
                    System.out.println("2. Still proceed to wake him up.");
                    int c1opt1 = scan.nextInt();
                    if(c1opt1 == 1) {
                        System.out.println("You wake up the sleepy dude as you stumble your way out of the place, he shoots you in the head as he is startled by the sudden noise");
                        playing = false;
                    } else {
                        System.out.println("You gently try to wake up the sleepy dude, he just grunts and tells you leave before you get into something you don't want. You don't think twice and high tail out to safety");
                        playing = false;
                        break;
                    }
                case 2:
                    System.out.println("You check the cellphone, It has only one contact and text message that says hit me ASAP! What you gonna do?");
                    System.out.println("1. Callback");
                    System.out.println("2. Call 911");
                    int c2opt1 = scan.nextInt();
                    if(c2opt1 == 1) {
                        System.out.println("You call the number and a voice tells you to drop the phone and run out the back door. You dont need to be told twice so you leave asap!");
                        playing = false;
                    } else {
                        System.out.println("You call 911, a voice tells you that you f**ked up! The phone blows up in your hand. You lose your hand and there is a hole in the side of your head. You lay down because eternal sleep is calling");
                        playing = false;
                    }
                case 3:
                    System.out.println("You pick up the matches, they're empty but the address is for a club you are not familiar with, The Blue Oyster. What should you do now?");
                    System.out.println("1. Call the Blue Oyster");
                    System.out.println("2. Leave");
                    int c3opt1 = scan.nextInt();
                    if(c3opt1 == 1) {
                        System.out.println("You pick up the phone to call Blue Oyster, the sleepy dude wakes up and says I can't believe you just did that. He hits you in the back of the head with his gun. Light Out Fam!!!");
                        playing = false;
                    } else {
                        System.out.println("You try to leave, but you all of a sudden feel very tired. You notice a oily residue on your fingers, it looks like blood. You're not sure if its yours but your eyes suddenly close");
                        playing = false;
                    }
                case 4:
                    System.out.println("You immediately head for the front door, as you start to turn the knob you are knocked off your feet. The door has been kicked in and the police are asking what you know about this drug deal and the 7 dead bodies in the house ");
                    playing = false;
                default:
                    System.out.println("Please choose an available option.");

            }
        }
    }
}
