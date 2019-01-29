package com.company;

import java.util.Scanner;

public class ToDoListLogic {
    Scanner scan = new Scanner(System.in);
    String userInput;
    ToDoList toDoList = new ToDoList();
    ToDoList tempToDoList;

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

        switch(userInput) {
            case "create":
                createToDo();
                break;
            case "view":
                toDoList.getListOfToDoLists();
                System.out.println("Select the list you would like to add a todo");
                userInput = stringInput(userInput);
                tempToDoList = toDoList.selectTodoList(userInput);
                System.out.println("Type add - Add todo \nupdate - Update todo\ndelete - delete todo");
                userInput = stringInput(userInput);
                break;
        }
    }

    public void createToDo() {
        System.out.println("Please add the name of your Todo List");

        userInput = stringInput(userInput);
        ToDoList toDoListN = new ToDoList(userInput);
        toDoList.addTodoList(toDoListN);

    }



}
