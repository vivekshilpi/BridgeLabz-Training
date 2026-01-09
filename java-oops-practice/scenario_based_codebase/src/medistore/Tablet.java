package medistore;

import java.time.LocalDate;

public class Tablet extends Medicine implements ISellable {

    private static final double DISCOUNT_PERCENT = 10;

    public Tablet(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public double totalPrice(int quantity) {
        double total = getPrice() * quantity;
        return total - (total * DISCOUNT_PERCENT / 100);
    }

    // Preserved medicine: exact expiry date
    @Override
    public boolean checkExpiry() {
        return LocalDate.now().isAfter(getExpiryDate());
    }

    @Override
    public void sell(int quantity) {
        if (checkExpiry()) {
            System.out.println("Tablet expired");
            return;
        }
        reduceStock(quantity);
        System.out.println("Tablet sold. Amount: " + totalPrice(quantity));
    }
}
