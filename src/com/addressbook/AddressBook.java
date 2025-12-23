package com.addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private final List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added successfully!");
        System.out.println(contact);
    }
}
