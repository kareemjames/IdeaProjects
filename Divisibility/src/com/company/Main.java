package com.company;

public class Main {

    public static void main(String[] args) {
	    int i = 1;

	    //If i has a remainder after all these checks then continue with loop
        //When all of the conditions are true return me the number
	    while(
	            i % 2 != 0 || i % 3 != 0 || i % 4 != 0 || i % 5 != 0 ||
                i % 6 != 0 || i % 7 != 0 || i % 8 != 0 || i % 9 != 0 ||
                i % 10 != 0 || i % 11 != 0 || i % 12 != 0 || i %13 != 0 ||
                i % 14 != 0 || i % 15 != 0 || i % 16 != 0 || i % 17 != 0 ||
                i % 18 != 0 || i % 19 != 0 || i % 20 != 0
        )
        {
            i++;
        }
        System.out.println(i);
    }
}
