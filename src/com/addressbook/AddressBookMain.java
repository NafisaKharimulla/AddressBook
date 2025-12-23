package com.addressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {

    private static Map<String, AddressBook> addressBooks = new HashMap<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Address Book System =====");
            System.out.println("1. Create New Address Book");
            System.out.println("2. Use Existing Address Book");
            System.out.println("3. List Address Books");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    System.out.print("Enter Address Book Name: ");
                    String name = sc.nextLine();
                    addressBooks.put(name, new AddressBook());
                    System.out.println("Address Book created.");
                    break;

                case 2:
                    System.out.print("Enter Address Book Name: ");
                    String bookName = sc.nextLine();
                    AddressBook selectedBook = addressBooks.get(bookName);

                    if (selectedBook == null) {
                        System.out.println("Address Book not found.");
                    } else {
                        addressBookMenu(selectedBook, sc);
                    }
                    break;

                case 3:
                    if (addressBooks.isEmpty()) {
                        System.out.println("No Address Books available.");
                    } else {
                        System.out.println("Available Address Books:");
                        for (String key : addressBooks.keySet()) {
                            System.out.println("- " + key);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // MENU INSIDE ONE ADDRESS BOOK
    private static void addressBookMenu(AddressBook book, Scanner sc) {

        while (true) {
            System.out.println("\n--- Address Book Menu ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Show Contacts");
            System.out.println("5. Back");
            System.out.print("Enter choice: ");

            int ch = Integer.parseInt(sc.nextLine());

            switch (ch) {

                case 1:
                    book.addContact(createContact(sc));
                    break;

                case 2:
                    System.out.print("Enter first name: ");
                    book.editContact(sc.nextLine(), sc);
                    break;

                case 3:
                    System.out.print("Enter first name: ");
                    book.deleteContact(sc.nextLine());
                    break;

                case 4:
                    book.showAllContacts();
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static Contact createContact(Scanner sc) {

        System.out.print("First Name: ");
        String first = sc.nextLine();

        System.out.print("Last Name: ");
        String last = sc.nextLine();

        System.out.print("Address: ");
        String addr = sc.nextLine();

        System.out.print("City: ");
        String city = sc.nextLine();

        System.out.print("State: ");
        String state = sc.nextLine();

        System.out.print("Zip: ");
        String zip = sc.nextLine();

        System.out.print("Phone: ");
        String phone = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        return new Contact(first, last, addr, city, state, zip, phone, email);
    }
}
