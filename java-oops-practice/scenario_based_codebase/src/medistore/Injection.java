package medistore;

import java.time.LocalDate;

public class Injection extends Medicine implements ISellable {

    public Injection(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public double totalPrice(int quantity) {
        return getPrice() * quantity;
    }

    // Very sensitive medicine
    @Override
    public boolean checkExpiry() {
        return LocalDate.now().isAfter(getExpiryDate().minusDays(10));
    }

    @Override
    public void sell(int quantity) {
        if (checkExpiry()) {
            System.out.println("Injection expired");
            return;
        }
        reduceStock(quantity);
        System.out.println("Injection sold. Amount: " + totalPrice(quantity));
    }
}
