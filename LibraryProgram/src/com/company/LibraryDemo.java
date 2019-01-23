package com.company;

import java.util.Scanner;

public class LibraryDemo {

    public static void main(String[] args) {

        boolean isBrowsing = false;
        Scanner scan = new Scanner(System.in);
        int option;

        do {
            // Instantiate library
            Library library = new Library();
            // Instantiate books
            for(int i = 0; i < library.books.length; i++) {
                library.books[i] = new Book();
            }
            // Add starter book
            library.books[0].setTitle("Cat In The Hat");
            library.books[0].setAuthor("Dr. Suess");
            library.books[0].setGenre("Childrens");
            library.books[0].setNoOfPages(50);



            System.out.println("Welcome to ETA Library! \nWhat would you like to do? \n 1 View number of books \n 2 Add new book \n 3 Exit program");
            option = scan.nextInt();

            switch(option) {
                case 1:
                    System.out.println("You have " + library.numberOfBooksInLibrary() + " books in your library");
                    System.out.println(library.books[0].printDetails());
                    isBrowsing = true;
                    break;
                case 2:

                    System.out.println("Great! You have decided to add a book \nPlease provide the title");

                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please choose a valid option");
            }
        } while (isBrowsing);
    }
}
