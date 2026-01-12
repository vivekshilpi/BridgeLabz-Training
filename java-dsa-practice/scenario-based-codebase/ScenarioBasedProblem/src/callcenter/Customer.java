package callcenter;

public class Customer {
    String id;
    String name;
    boolean isVIP;

    public Customer(String id, String name, boolean isVIP) {
        this.id = id;
        this.name = name;
        this.isVIP = isVIP;
    }

    @Override
    public String toString() {
        return name + " (ID: " + id + ")";
    }
}

