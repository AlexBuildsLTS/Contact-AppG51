package fullstackOS.org;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ContactsNMETest {
    private ContactsNME contactsNME;

    @BeforeEach
    public void setUp() {
        contactsNME = new ContactsNME();
    }

    @Test
    public void testAddContact() {
        Contact contact = new Contact("Alice", "1234567890", "alice@example.com");
        assertTrue(contactsNME.addContact(contact));
        assertFalse(contactsNME.addContact(contact)); // Duplicate mobile number
    }

    @Test
    public void testGetAllContacts() {
        Contact contact1 = new Contact("Alice", "1234567890", "alice@example.com");
        Contact contact2 = new Contact("Bob", "0987654321", "bob@example.com");
        contactsNME.addContact(contact1);
        contactsNME.addContact(contact2);

        List<Contact> allContacts = contactsNME.getAllContacts();
        assertEquals(2, allContacts.size());
    }

    @Test
    public void testFindContactsByName() {
        Contact contact1 = new Contact("Alice", "1234567890", "alice@example.com");
        Contact contact2 = new Contact("Alice", "0987654321", "alice.b@example.com");
        contactsNME.addContact(contact1);
        contactsNME.addContact(contact2);

        List<Contact> contacts = contactsNME.findContactsByName("Alice");
        assertEquals(2, contacts.size());
    }

    @Test
    public void testRemoveContactByMobileNumber() {
        Contact contact = new Contact("Alice", "1234567890", "alice@example.com");
        contactsNME.addContact(contact);

        assertTrue(contactsNME.removeContactByMobileNumber("1234567890"));
        assertFalse(contactsNME.removeContactByMobileNumber("1234567890")); // Already removed
    }

    @Test
    public void testUpdateContact() {
        Contact contact = new Contact("Alice", "1234567890", "alice@example.com");
        contactsNME.addContact(contact);

        Contact updatedContact = new Contact("Alice Updated", "1234567890", "alice.updated@example.com");
        assertTrue(contactsNME.updateContact("1234567890", updatedContact));

        Contact retrievedContact = contactsNME.getAllContacts().get(0);
        assertEquals("Alice Updated", retrievedContact.getName());
        assertEquals("alice.updated@example.com", retrievedContact.getEmail());
    }
}
