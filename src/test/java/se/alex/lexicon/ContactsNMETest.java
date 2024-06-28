package se.alex.lexicon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ContactsNMETest {
    private ContactNME contactNME;

    @BeforeEach
    void setUp() {
        contactNME = new ContactNME();
        contactNME.addContact(new Contact("Alex Lexicon", "1234567890", "alex@example.com"));
        contactNME.addContact(new Contact("Jane Smith", "0987654321", "jane@example.com"));
    }

    @Test
    void testAddContact() {
        Contact newContact = new Contact("Alexsandra Brown", "1111111111", "alexsandra@example.com");
        contactNME.addContact(newContact);
        assertEquals(3, contactNME.getAllContacts().size());
    }

    @Test
    void testAddDuplicateContact() {
        Contact duplicateContact = new Contact("Alex Lexicon", "1234567890", "alex.lexicon@example.com");
        contactNME.addContact(duplicateContact);
        assertEquals(2, contactNME.getAllContacts().size());
    }

    @Test
    void testGetAllContacts() {
        List<Contact> contacts = contactNME.getAllContacts();
        assertEquals(2, contacts.size());
    }

    @Test
    void testFindContactsByName() {
        List<Contact> contacts = contactNME.findContactsByName("Alex Lexicon");
        assertEquals(1, contacts.size());
        assertEquals("Alex Lexicon", contacts.get(0).getName());
    }

    @Test
    void testRemoveContactByMobileNumber() {
        contactNME.removeContactByMobileNumber("1234567890");
        assertEquals(1, contactNME.getAllContacts().size());
    }

    @Test
    void testUpdateContactByMobileNumber() {
        Contact updatedContact = new Contact("Alex Lexicon", "1234567890", "alex.lexicon@example.com");
        contactNME.updateContactByMobileNumber("1234567890", updatedContact);
        Contact contact = contactNME.getAllContacts().get(0);
        assertEquals("alex.lexicon@example.com", contact.getEmail());
    }
}
