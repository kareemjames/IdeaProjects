package com.company;

import java.util.ArrayList;

public class AddyBook {
    public ArrayList<Contact> contacts = new ArrayList<Contact>();

    public int numberOfContacts() {
        return contacts.size();
    }

    public void searchByName(String name) {

        for(Contact contact : contacts) {
            if(contact.getName().equals(name)) {
                System.out.println("Your contact was found: " + contact);
            } else {
                System.out.println("Your contact was not found");
            }
        }
    }

    public void searchByPhone(String phone) {
        for(Contact contact : contacts) {
            if(contact.getPhoneNumber().equals)
        }
    }
}
