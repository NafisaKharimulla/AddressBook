package com.addressbook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook {

    private ArrayList<Contact> contacts = new ArrayList<>();

    // UC1 - Add Contact
    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added successfully.");
    }

    // UC3 - Edit Contact
    public void editContact(String firstName, Scanner sc) {
        boolean found = false;

        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(firstName)) {
                found = true;

                System.out.print("Enter new Address: ");
                c.setAddress(sc.nextLine());

                System.out.print("Enter new City: ");
                c.setCity(sc.nextLine());

                System.out.print("Enter new State: ");
                c.setState(sc.nextLine());

                System.out.print("Enter new Zip: ");
                c.setZip(sc.nextLine());

                System.out.print("Enter new Phone: ");
                c.setPhoneNumber(sc.nextLine());

                System.out.print("Enter new Email: ");
                c.setEmail(sc.nextLine());

                System.out.println("Contact updated successfully.");
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found.");
        }
    }

    // UC4 - Delete Contact
    public void deleteContact(String firstName) {
        Iterator<Contact> iterator = contacts.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            Contact c = iterator.next();
            if (c.getFirstName().equalsIgnoreCase(firstName)) {
                iterator.remove();
                found = true;
                System.out.println("Contact deleted successfully.");
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found.");
        }
    }

    // Show All Contacts
    public void showAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }

        System.out.println("\n----- Contact List -----");
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}
