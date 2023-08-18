package contactservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The ContactServiceTest class contains JUnit test cases for testing the ContactService class.
 */
public class ContactServiceTest {
    private ContactService contactService;

    /**
     * Set up a new instance of ContactService before each test.
     */
    @BeforeEach
    public void setup() {
        // Create a new instance of ContactService before each test
        contactService = new ContactService();
    }

    /**
     * Test case to verify that a contact can be added to the ContactService and retrieved successfully.
     */
    @Test
    public void testAddContact() {
        // Create a new contact object
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");

        // Add the contact to the contact service
        contactService.addContact(contact);

        // Retrieve the contact from the contact service
        Contact retrievedContact = contactService.getContact("1234567890");

        // Assert that the retrieved contact is equal to the original contact
        Assertions.assertEquals(contact, retrievedContact, "Incorrect contact retrieved");
    }

    /**
     * Test case to verify that a contact can be deleted from the ContactService successfully.
     */
    @Test
    public void testDeleteContact() {
        // Create a new contact object
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");

        // Add the contact to the contact service
        contactService.addContact(contact);

        // Delete the contact from the contact service
        contactService.deleteContact("1234567890");

        // Retrieve the contact from the contact service
        Contact retrievedContact = contactService.getContact("1234567890");

        // Assert that the retrieved contact is null, indicating it was deleted
        Assertions.assertNull(retrievedContact, "Contact was not deleted");
    }

    /**
     * Test case to verify that a contact can be updated in the ContactService successfully.
     */
    @Test
    public void testUpdateContact() {
        // Create a new contact object
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");

        // Add the contact to the contact service
        contactService.addContact(contact);

        // Create an updated contact object
        Contact updatedContact = new Contact("1234567890", "Jane", "Smith", "9876543210", "456 Oak St");

        // Update the contact in the contact service
        contactService.updateContact(updatedContact);

        // Retrieve the contact from the contact service
        Contact retrievedContact = contactService.getContact("1234567890");

        // Assert that the retrieved contact is equal to the updated contact
        Assertions.assertEquals(updatedContact, retrievedContact, "Contact was not updated");
    }
}
