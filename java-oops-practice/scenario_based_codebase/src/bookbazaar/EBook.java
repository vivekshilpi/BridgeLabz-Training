package bookbazaar;

public class EBook extends Book {

    public EBook(String title, String author, double price) {
        super(title, author, price, Integer.MAX_VALUE); // unlimited stock
    }

    @Override
    public double applyDiscount(int quantity) {
        return price * quantity * 0.10; // flat 10% discount
    }
}

