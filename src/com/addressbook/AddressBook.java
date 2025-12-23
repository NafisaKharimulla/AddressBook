package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    private ArrayList<Contact> contacts = new ArrayList<>();

    // Add contact
    public void addContact(Contact c) {
        contacts.add(c);
        System.out.println("Contact added successfully!");
    }

    // Show all contacts
    public void showAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }
        System.out.println("\n===== All Contacts =====");
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }

    // Edit contact by first name
    public void editContact(String firstName, Scanner sc) {
        boolean found = false;

        for (Contact contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(firstName)) {
                found = true;
                System.out.println("Contact Found: " + contact);

                System.out.print("Enter new Address: ");
                contact.setAddress(sc.nextLine());

                System.out.print("Enter new City: ");
                contact.setCity(sc.nextLine());

                System.out.print("Enter new State: ");
                contact.setState(sc.nextLine());

                System.out.print("Enter new Zip: ");
                contact.setZip(sc.nextLine());

                System.out.print("Enter new Phone Number: ");
                contact.setPhoneNumber(sc.nextLine());

                System.out.print("Enter new Email: ");
                contact.setEmail(sc.nextLine());

                System.out.println("Contact updated successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found.");
        }
    }
}
