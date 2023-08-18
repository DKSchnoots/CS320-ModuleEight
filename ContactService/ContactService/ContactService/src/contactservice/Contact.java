package contactservice;

/**
 * The Contact class represents a contact with various fields such as contactId, firstName, lastName, phone, and address.
 */
public class Contact {
    private String contactId;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    /**
     * Constructs a new Contact object with the given details.
     *
     * @param contactId The unique ID of the contact.
     * @param firstName The first name of the contact.
     * @param lastName  The last name of the contact.
     * @param phone     The phone number of the contact.
     * @param address   The address of the contact.
     */
    public Contact(String contactId, String firstName, String lastName, String phone, String address) {
        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    /**
     * Retrieves the contact's unique ID.
     *
     * @return The contact's unique ID.
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * Retrieves the contact's first name.
     *
     * @return The contact's first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Retrieves the contact's last name.
     *
     * @return The contact's last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Retrieves the contact's phone number.
     *
     * @return The contact's phone number.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Retrieves the contact's address.
     *
     * @return The contact's address.
     */
    public String getAddress() {
        return address;
    }
}
