package com.company;

import java.util.Random;
import java.util.Scanner;

public class HangmanDemo {

    public static void main(String[] args) {

        boolean isPlaying = false;
        Scanner scan = new Scanner(System.in);

        do {
            String[] words = {"hello", "bread", "fruit", "yellow"};

            // Randomizer to pick random word from array
            Random random = new Random();
            int index = random.nextInt(words.length);
            String randomWord = words[index];

            System.out.println(randomWord);

            System.out.println("Welcome to Hangman");

        } while(isPlaying);



    }
}
