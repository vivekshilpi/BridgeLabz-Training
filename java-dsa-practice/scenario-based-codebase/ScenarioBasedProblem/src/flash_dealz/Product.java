package flash_dealz;

class Product {
    int id;
    String name;
    double discount;   // discount in percentage

    public Product(int id, String name, double discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Discount: " + discount + "%";
    }
}
