package contactservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * The ContactTest class contains JUnit test cases for testing the Contact class.
 */
public class ContactTest {
    
    /**
     * Test case to verify that a contact can be created with the correct field values.
     */
    @Test
    public void testContactCreation() {
        // Create a new contact object
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        
        // Assert that the contact object has the expected values
        Assertions.assertEquals("1234567890", contact.getContactId(), "Incorrect contact ID");
        Assertions.assertEquals("John", contact.getFirstName(), "Incorrect first name");
        Assertions.assertEquals("Doe", contact.getLastName(), "Incorrect last name");
        Assertions.assertEquals("1234567890", contact.getPhone(), "Incorrect phone number");
        Assertions.assertEquals("123 Main St", contact.getAddress(), "Incorrect address");
    }
}
