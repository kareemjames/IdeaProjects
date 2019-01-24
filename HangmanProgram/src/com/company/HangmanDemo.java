package com.company;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.Random;
import java.util.Scanner;

public class HangmanDemo {

    public static void main(String[] args) {

        boolean isPlaying = false;
        Scanner scan = new Scanner(System.in);

        do {
            String[] words = {"hello", "bread", "fruit", "yellow"};
            int guess = 0;

            // Randomizer to pick random word from array
            Random random = new Random();
            int index = random.nextInt(words.length);
            String randomWord = words[index];
            System.out.println(randomWord);

            // Convert string to array of char
            char[] chars = randomWord.toCharArray();
            System.out.println(chars.length);

            System.out.println("Welcome to Hangman");
            System.out.println("The length of the mystery word is " + randomWord.length());
            System.out.println("Guess a letter and try to win before you get hung");
            String letter = scan.next();




        } while(isPlaying);



    }
}
