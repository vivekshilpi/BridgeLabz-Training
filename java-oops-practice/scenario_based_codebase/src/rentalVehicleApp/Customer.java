package rentalVehicleApp;

class Customer {
    private int customerId;
    private String name;

    public Customer(int id, String name) {
        this.customerId = id;
        this.name = name;
    }

    public void displayCustomer() {
        System.out.println("Customer: " + name + " (ID: " + customerId + ")");
    }
}
