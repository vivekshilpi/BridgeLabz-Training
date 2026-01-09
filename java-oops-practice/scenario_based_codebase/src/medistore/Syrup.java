package medistore;

import java.time.LocalDate;

public class Syrup extends Medicine implements ISellable {

    public Syrup(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public double totalPrice(int quantity) {
        return getPrice() * quantity;
    }

    // Liquid medicine expires earlier once opened
    @Override
    public boolean checkExpiry() {
        return LocalDate.now().isAfter(getExpiryDate().minusDays(30));
    }

    @Override
    public void sell(int quantity) {
        if (checkExpiry()) {
            System.out.println("Syrup expired");
            return;
        }
        reduceStock(quantity);
        System.out.println("Syrup sold. Amount: " + totalPrice(quantity));
    }
}
