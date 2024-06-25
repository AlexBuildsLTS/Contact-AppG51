package com.yourname.contactlist;

import fullstackOS.org.Contact;
import fullstackOS.org.ContactsNME;

import java.util.List;
import java.util.Scanner;

public class App {
    private static ContactsNME contactsNME = new ContactsNME();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            showMenu();
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    getallcontacts();
                    break;
                case 3:
                    findContactsByName();
                    break;
                case 4:
                    removeContactByMobileNumber();
                    break;
                case 5:
                    updateContact();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("Contact List Menu:");
        System.out.println("1. Add a Contact");
        System.out.println("2. Get All Contacts");
        System.out.println("3. Find Contacts by Name");
        System.out.println("4. Remove a Contact by Mobile Number");
        System.out.println("5. Update Contact Information by Mobile Number");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter mobile number: ");
        String mobileNumber = scanner.nextLine();
        System.out.print("Enter Email");
        String email = scanner.nextLine();

        Contact contact = new Contact(name, mobileNumber, email)