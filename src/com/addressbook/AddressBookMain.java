package com.addressbook;
import com.addressbook.Contact;


public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");

        Contact contact = new Contact(
                "John",
                "Doe",
                "123 Street",
                "Hyderabad",
                "Telangana",
                "500001",
                "9876543210",
                "john.doe@email.com"
        );

        System.out.println(contact);
    }
}

