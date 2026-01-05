package swift_cart;

public class NonPerishableProduct extends Product {

    public NonPerishableProduct(String name, double price, String category) {
        super(name, price, category);
    }

    @Override
    public double getDiscountRate() {
        return 0.05; // 5% discount
    }
}

