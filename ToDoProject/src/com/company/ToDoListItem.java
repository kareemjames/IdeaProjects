package com.company;

public class ToDoListItem {

    private String description;
    boolean isComplete;

    public ToDoListItem() {

    }
    public ToDoListItem(String description) {
        this.description = description;
        isComplete = false;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

}
