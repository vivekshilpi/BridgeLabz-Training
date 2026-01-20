package address_book_system;

class Contact {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private Address address;   // Composition

    public Contact(String firstName, String lastName, String phone, String email, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    // Getters and Setters (Encapsulation)

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "Contact: " + getFullName() +
                "\nPhone: " + phone +
                "\nEmail: " + email +
                "\nAddress: " + (address != null ? address : "Not Provided") +
                "\n";
    }
}
