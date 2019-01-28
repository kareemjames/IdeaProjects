package com.company;

import java.util.Scanner;

public class ToDoListLogic {
    Scanner scan = new Scanner(System.in);
    String userInput;

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

    public void welcome() {
        System.out.println("Welcome to your ToDoList! \nType create - Create Todo List \nview - View Todos \nexit - Exit");
        userInput = stringInput(userInput);
        System.out.println(userInput);
    }
}
