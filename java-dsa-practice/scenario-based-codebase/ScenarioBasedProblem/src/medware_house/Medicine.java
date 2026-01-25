package medware_house;

class Medicine {
    String name;
    int expiryDays; // days remaining before expiry

    Medicine(String name, int expiryDays) {
        this.name = name;
        this.expiryDays = expiryDays;
    }

    void display() {
        System.out.println(
            "Medicine: " + name + 
            ", Expiry in: " + expiryDays + " days"
        );
    }
}
