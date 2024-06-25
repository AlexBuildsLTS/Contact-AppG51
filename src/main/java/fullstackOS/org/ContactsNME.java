package fullstackOS.org;

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

    public List<Contact> findContactsByName(String name) {
        List<Contact> result = new ArrayList<>();
        for (Contact c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                result.add(c);
            }
        }
        return result;
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
    public boolean removeContactByMobileNumber(String mobileNumber) {
        return contacts.removeIf(c -> c.getMobileNumber().equals(mobileNumber));
    }

    public boolean updateContact(String mobileNumber, Contact newContact) {
        for (Contact c : contacts) {
            if (c.getMobileNumber().equals(mobileNumber)) {
                c.setName(newContact.getName());
                c.setEmail(newContact.getEmail());
                return true;
            }
        }
        return false;
    }




}
