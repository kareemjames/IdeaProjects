package com.company;

import java.util.ArrayList;

public class ToDoList {

    private String name;
    private ArrayList<ToDoList> list = new ArrayList<ToDoList>();

    public ToDoList(String name) {
        this.name = name;
    }

    private void getListOfToDoLists() {
        for(int i =0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
