package ECommercePlatform;

public abstract class Product {
    private int productId;
    private String name;
    private int price;

    public abstract double calculateDiscount();
    public void getDetails(){
        System.out.println("Product Id : "+productId);
        System.out.println("Name : "+name);

    }
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(int productId, String name, int price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
}