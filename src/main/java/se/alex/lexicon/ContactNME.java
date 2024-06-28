package se.alex.lexicon;

import java.util.ArrayList;
import java.util.List;

public class ContactNME {
    private List<Contact> contacts;

    public ContactNME() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        for (Contact c : contacts) {
            if (c.getMobileNumber().equals(contact.getMobileNumber())) {
                System.out.println("Contact with this mobile number already exists.");
                return;
            }
        }
        contacts.add(contact);
    }

    public List<Contact> getAllContacts() {
        return contacts;
    }

    public List<Contact> findContactsByName(String name) {
        List<Contact> result = new ArrayList<>();
        for (Contact c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                result.add(c);
            }
        }
        return result;
    }

    public void removeContactByMobileNumber(String mobileNumber) {
        contacts.removeIf(contact -> contact.getMobileNumber().equals(mobileNumber));
    }

    public void updateContactByMobileNumber(String mobileNumber, Contact newContact) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getMobileNumber().equals(mobileNumber)) {
                contacts.set(i, newContact);
                return;
            }
        }
        System.out.println("There is no contact with that phone Number");
    }
}
