package address_book_system;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class AddressBook {
    private ArrayList<Contact> contacts = new ArrayList<>();

    // Add Contact with duplicate validation (by full name)
    public boolean addContact(Contact c) {
        for (Contact existing : contacts) {
            if (existing.getFullName().equalsIgnoreCase(c.getFullName())) {
                System.out.println("Duplicate contact exists: " + c.getFullName());
                return false;
            }
        }
        contacts.add(c);
        System.out.println("Contact added: " + c.getFullName());
        return true;
    }

    // Edit contact by name
    public boolean editContact(String fullName, Contact updatedContact) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getFullName().equalsIgnoreCase(fullName)) {
                contacts.set(i, updatedContact);
                System.out.println("Contact updated: " + fullName);
                return true;
            }
        }
        System.out.println("Contact not found: " + fullName);
        return false;
    }

    // Delete contact by name
    public boolean deleteContact(String fullName) {
        for (Contact c : contacts) {
            if (c.getFullName().equalsIgnoreCase(fullName)) {
                contacts.remove(c);
                System.out.println("Contact deleted: " + fullName);
                return true;
            }
        }
        System.out.println("Contact not found: " + fullName);
        return false;
    }

    // Search by City or State
    public void searchByLocation(String location) {
        System.out.println("Search results for: " + location);
        boolean found = false;

        for (Contact c : contacts) {
            Address a = c.getAddress();
            if (a != null &&
                    (a.getCity().equalsIgnoreCase(location) ||
                     a.getState().equalsIgnoreCase(location))) {
                System.out.println(c);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No contacts found in " + location);
        }
    }

    // Display all contacts sorted alphabetically by full name
    public void displayAllContacts() {
        Collections.sort(contacts, Comparator.comparing(Contact::getFullName, String.CASE_INSENSITIVE_ORDER));

        System.out.println("\n==== Address Book ====");
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}

