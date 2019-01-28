package com.company;

public class ToDoListDemo {

//    Write a program that manages a ToDo List. Your program should consist of at least (3) classes: ToDoList, ToDoListItem, and ToDoListDemo (you may use more classes if you see the need to do so).
//
//    Each item on the to-do list should have a description and a state (ToDo, In Progress, or Done). Your program should allow the user to add items to the to-do list, display all existing items, display existing items by state (e.g., the user may only want to view In Progress items), edit existing items, and delete items.
//
//    As always, be sure to initialize your project as a Git repository when you create it, and commit your code regularly (with descriptive commit messages) as you work.
//
//    Bonus: Your program should allow the user to create multiple ToDoLists, and should permit the user to choose which ToDoList they want to access and modify.

	static ToDoListLogic toDoListLogic = new ToDoListLogic();

	public static void main(String[] args) {

        while(true) {
            welcomeLoop();
        }
    }
    public static void welcomeLoop() {
	    toDoListLogic.welcome();
    }
}
