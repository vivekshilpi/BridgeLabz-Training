package swift_cart;

public class PerishableProduct extends Product {

    public PerishableProduct(String name, double price, String category) {
        super(name, price, category);
    }

    @Override
    public double getDiscountRate() {
        return 0.15; // 15% discount
    }
}
