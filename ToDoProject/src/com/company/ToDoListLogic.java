package com.company;

import java.util.Scanner;

public class ToDoListLogic {
    Scanner scan = new Scanner(System.in);

    ToDoListLogic() {

    }

    public int intInput(int x) {
        x = scan.nextInt();
        return x;
    }

    public String stringInput(String x) {
        x = scan.nextLine();
        return x;
    }
}
