package com.company;

public class Main {

    public static void main(String[] args) {
	    //Fibonacci
       int i;
       int current = 0;
       int previous = 1;
       int total;

       for(i = 2; i < 22; i++) {
           total = current + previous;
           if(total % 2 == 0) {
               System.out.println(total);
           }
           current = previous;
           previous = total;
       }
    }
}
