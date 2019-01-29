package com.company;

import java.util.ArrayList;

public class ToDoList {

    private String name;
    private ArrayList<ToDoList> list = new ArrayList<ToDoList>();
    private ArrayList<ToDoListItem> item = new ArrayList<>();

    public ToDoList() {

    }

    public ToDoList(String name) {
        this.name = name;
    }

    public void getListOfToDoLists() {
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).name);
        }
        System.out.println("You have "+ list.size() + " list(s)");
    }

   public void addTodoList(ToDoList x) {
        list.add(x);
       System.out.println("You have successfully added the " + x.name + " todo list");
       getListOfToDoLists();
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
