package bookbazaar;

public abstract class Book implements IDiscountable {

    private String title;
    private String author;
    protected double price;
    private int stock;

    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    // Optional offer constructor
    public Book(String title, String author, double price) {
        this(title, author, price, 10);
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    // 🔒 inventory update controlled
    public boolean reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            return true;
        }
        return false;
    }

    public double calculateTotalCost(int quantity) {
        double discount = applyDiscount(quantity);
        return (price * quantity) - discount;
    }
}

