package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double[] dailyAverageTemp = new double[7];
        double i;
        double sum = 0;
        double avg= 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("This program will collect information on daily average temps");
        System.out.println("Please enter the temp for Sunday");
        dailyAverageTemp[0] = scan.nextInt();
        System.out.println("Please enter the temp for Monday");
        dailyAverageTemp[1] = scan.nextInt();
        System.out.println("Please enter the temp for Tuesday");
        dailyAverageTemp[2] = scan.nextInt();
        System.out.println("Please enter the temp for Wednesday");
        dailyAverageTemp[3] = scan.nextInt();
        System.out.println("Please enter the temp for Thursday");
        dailyAverageTemp[4] = scan.nextInt();
        System.out.println("Please enter the temp for Friday");
        dailyAverageTemp[5] = scan.nextInt();
        System.out.println("Please enter the temp for Saturday");
        dailyAverageTemp[6] = scan.nextInt();
        System.out.println("Thank you for this information, I will get right on it.");

        for(i = 0; i < dailyAverageTemp.length; i++) {
            System.out.println(dailyAverageTemp[(int)i]);
            sum += dailyAverageTemp[(int)i];
        }

        avg = sum / dailyAverageTemp.length;
        System.out.println("The average temp for the week is " + avg);
    }
}
