package binary_search_tree.ecommerce_product_inventory;

class ProductNode {
    int sku;
    String name;
    double price;
    ProductNode left, right;

    ProductNode(int sku, String name, double price) {
        this.sku = sku;
        this.name = name;
        this.price = price;
        left = right = null;
    }
}

