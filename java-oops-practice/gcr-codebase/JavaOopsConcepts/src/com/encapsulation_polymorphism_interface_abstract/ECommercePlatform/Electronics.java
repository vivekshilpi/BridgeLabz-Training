package ECommercePlatform;

public class Electronics extends Product implements Taxable{
    private int warranty;

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Price : "+calculateDiscount());
    }

    @Override
    public double calculateDiscount() {
        return getPrice()+calculateTax()-(getPrice()*0.10);
    }

    @Override
    public double calculateTax() {
        return getPrice() *0.18;
    }

    @Override
    public String getTaxDetails() {
        return "18 % GST";
    }

    public Electronics(int productId, String name, int price, int warranty) {
        super(productId, name, price);
        this.warranty = warranty;
    }
}
