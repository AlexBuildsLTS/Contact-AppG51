package fullstackOS.org;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ContactNME contactNME = new ContactNME();
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.println("Choose an option: add, getAll, find, remove, update, exit");
            command = scanner.nextLine();

            switch (command) {
                case "add":
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter mobile number: ");
                    String mobileNumber = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    contactNME.addContact(new Contact(name, mobileNumber, email));
                    break;
                case "getAll":
                    List<Contact> contacts = contactNME.getAllContacts();
                    for (Contact contact : contacts) {
                        System.out.println(contact);
                    }
                    break;
                case "find":
                    System.out.print("Enter name to find: ");
                    String findName = scanner.nextLine();
                    List<Contact> foundContacts = contactNME.findContactsByName(findName);
                    for (Contact contact : foundContacts) {
                        System.out.println(contact);
                    }
                    break;
                case "remove":
                    System.out.print("Enter mobile number to remove: ");
                    String removeNumber = scanner.nextLine();
                    contactNME.removeContactByMobileNumber(removeNumber);
                    break;
                case "update":
                    System.out.print("Enter mobile number to update: ");
                    String updateNumber = scanner.nextLine();
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new email: ");
                    String newEmail = scanner.nextLine();
                    contactNME.updateContactByMobileNumber(updateNumber, new Contact(newName, updateNumber, newEmail));
                    break;
                case "exit":
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
