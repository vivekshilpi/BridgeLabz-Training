package address_book_system;

public class Main {
    public static void main(String[] args) {

        AddressBook book = new AddressBook();

        Address a1 = new Address("Bhopal", "Madhya Pradesh", "462001");
        Address a2 = new Address("Indore", "Madhya Pradesh", "452001");
        Address a3 = new Address("Pune", "Maharashtra", "411001");

        Contact c1 = new Contact("Vivek", "Shilpi", "9876543210", "vivek@email.com", a1);
        Contact c2 = new Contact("Aman", "Verma", "9123456780", "aman@email.com", a2);
        Contact c3 = new Contact("Riya", "Patel", "9000000000", "riya@email.com", a3);

        book.addContact(c1);
        book.addContact(c2);
        book.addContact(c3);

        book.displayAllContacts();

        book.searchByLocation("Madhya Pradesh");

        Contact updated = new Contact("Vivek", "Shilpi", "9999999999", "vivek_new@email.com", a1);
        book.editContact("Vivek Shilpi", updated);

        book.deleteContact("Aman Verma");

        book.displayAllContacts();
    }
}
