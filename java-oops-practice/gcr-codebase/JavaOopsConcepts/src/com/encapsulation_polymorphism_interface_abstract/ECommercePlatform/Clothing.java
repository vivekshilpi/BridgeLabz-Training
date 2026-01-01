package ECommercePlatform;

public class Clothing extends Product implements Taxable {
    private int size;

    public Clothing(int productId, String name, int price, int size) {
        super(productId, name, price);
        this.size = size;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Price : "+calculateDiscount());
    }

    @Override
    public double calculateDiscount() {

        return super.getPrice()+calculateTax()- (getPrice()*0.10);
    }

    @Override
    public double calculateTax() {
        return getPrice()*0.15;
    }

    @Override
    public String getTaxDetails() {
        return "15 % GST";
    }
}