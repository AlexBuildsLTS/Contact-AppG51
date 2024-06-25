package FullstackOS;

import java.util.ArrayList;
import java.util.List;

public class ContactsNME {
    private List<Contact> contacts;

    public ContactsNME() {
        this.contacts = new ArrayList<>();
    }
//  added a contact
public boolean addContact(Contact contact) {
    for (Contact c : contacts) {
        if (c.getMobileNumber().equals(contact.getMobileNumber())) {
            return false; // same mobileNumber
        }
    }
    contacts.add(contact);
    return true;
}

    public List<Contact> getAllContacts() {
        return new ArrayList<>(contacts);
    }

}
