package com.company;

import java.util.ArrayList;

public class AddyBook {
    public ArrayList<Contact> contacts = new ArrayList<Contact>();

    public int numberOfContacts() {
        return contacts.size();
    }
}
