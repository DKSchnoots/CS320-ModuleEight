package contactservice;

import java.util.HashMap;
import java.util.Map;

/**
 * The ContactService class provides functionality to manage contacts. It uses an in-memory data structure (HashMap)
 * to store and manipulate contact information.
 */
public class ContactService {
    private Map<String, Contact> contacts;

    /**
     * Constructs a new ContactService with an empty contacts map.
     */
    public ContactService() {
        // Initialize the contacts map as a new HashMap
        contacts = new HashMap<>();
    }

    /**
     * Adds a new contact to the contact service.
     *
     * @param contact The Contact object representing the contact to be added.
     */
    public void addContact(Contact contact) {
        // Add the contact to the contacts map using the contactId as the key
        contacts.put(contact.getContactId(), contact);
    }

    /**
     * Deletes a contact from the contact service based on its contactId.
     *
     * @param contactId The unique ID of the contact to be deleted.
     */
    public void deleteContact(String contactId) {
        // Remove the contact from the contacts map based on the contactId
        contacts.remove(contactId);
    }

    /**
     * Updates an existing contact in the contact service based on its contactId.
     *
     * @param updatedContact The updated Contact object with modified details.
     */
    public void updateContact(Contact updatedContact) {
        // Update the contact in the contacts map using the contactId as the key
        contacts.put(updatedContact.getContactId(), updatedContact);
    }

    /**
     * Retrieves a contact from the contact service based on its contactId.
     *
     * @param contactId The unique ID of the contact to be retrieved.
     * @return The Contact object representing the retrieved contact. Returns null if the contactId is not found.
     */
    public Contact getContact(String contactId) {
        // Retrieve the contact from the contacts map based on the contactId
        return contacts.get(contactId);
    }
}
