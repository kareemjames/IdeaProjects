package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int averageTempArraySize = 7;

        Temperature[] dailyAverageTemp = new Temperature[averageTempArraySize];

        for (int i=0; i <averageTempArraySize; i++) {

            System.out.println("Please enter the daily average temperature " + "(in degrees Fahrenheit) for the last 7 days  ");
            // Instantiate the Temp Object
            dailyAverageTemp[i] = new Temperature();

            int userInput = scan.nextInt();
            dailyAverageTemp[i].setFahrenheit(userInput);

            System.out.println(dailyAverageTemp[i].getFahrenheit());

        }

    }

}
