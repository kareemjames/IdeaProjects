package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPracticeProgram {

    public static void main(String[] args) {

        double[] dailyAverageTemp = new double[7];
        double[] dailyAverageTempCelcius = new double[7];
        double i;
        double sum = 0;
        double avg= 0;
        int count = 0;

        // Temp Object conversion
        // New object array
        Temperature[] tempArray = new Temperature[7];

        // Instantiate temp objects
        for(int x = 0; x < tempArray.length; x++) {
            tempArray[x] = new Temperature();
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("This program will collect information on daily average temps");

        System.out.println("Please enter the temp for Sunday");
        //dailyAverageTemp[0] = scan.nextInt();
        tempArray[0].setTempInF(scan.nextInt());

        System.out.println("Please enter the temp for Monday");
        //dailyAverageTemp[1] = scan.nextInt();
        tempArray[1].setTempInF(scan.nextInt());

        System.out.println("Please enter the temp for Tuesday");
        //dailyAverageTemp[2] = scan.nextInt();
        tempArray[2].setTempInF(scan.nextInt());

        System.out.println("Please enter the temp for Wednesday");
        //dailyAverageTemp[3] = scan.nextInt();
        tempArray[3].setTempInF(scan.nextInt());

        System.out.println("Please enter the temp for Thursday");
        //dailyAverageTemp[4] = scan.nextInt();
        tempArray[4].setTempInF(scan.nextInt());

        System.out.println("Please enter the temp for Friday");
        //dailyAverageTemp[5] = scan.nextInt();
        tempArray[5].setTempInF(scan.nextInt());

        System.out.println("Please enter the temp for Saturday");
        //dailyAverageTemp[6] = scan.nextInt();
        tempArray[6].setTempInF(scan.nextInt());

        System.out.println("Thank you for this information, I will get right on it.");

//        // Loop through dailyAverageTemp to display temp in F
//        for(i = 0; i < dailyAverageTemp.length; i++) {
//            System.out.println(dailyAverageTemp[(int)i]);
//            sum += dailyAverageTemp[(int)i];
//        }

        // Loop through objects to display temps in F
        for(Temperature g : tempArray) {
            System.out.println(g.getTempInF());
        }

//        avg = sum / dailyAverageTemp.length;
//        System.out.println("The average temp for the week is " + avg);
//
//        for(double z : dailyAverageTemp) {
//            //System.out.println(z);
//            z = (z - 32) * 5 / 9;
//            //System.out.println(z);
//            dailyAverageTempCelcius[count] = z;
//            count ++;
//        }
//
//        System.out.println("Your temp in Celcius is:");
//        //System.out.println(Arrays.toString(dailyAverageTempCelcius)); This is how to print an array
//
//        for(double y = 0; y < dailyAverageTempCelcius.length; y++) {
//            System.out.println(dailyAverageTempCelcius[(int) y]);
//        }
    }
}
