package binary_search_tree.ecommerce_product_inventory;

class ProductBST {

    private ProductNode root;

    // Insert 
    public void insert(int sku, String name, double price) {
        root = insertRec(root, sku, name, price);
    }

    private ProductNode insertRec(ProductNode root, int sku, String name, double price) {
        if (root == null)
            return new ProductNode(sku, name, price);

        if (sku < root.sku)
            root.left = insertRec(root.left, sku, name, price);
        else if (sku > root.sku)
            root.right = insertRec(root.right, sku, name, price);

        return root;
    }

    // Lookup Product
    public void search(int sku) {
        ProductNode result = searchRec(root, sku);
        if (result != null)
            System.out.println("Found → SKU: " + result.sku +
                    ", Name: " + result.name +
                    ", Price: ₹" + result.price);
        else
            System.out.println("Product not found.");
    }

    private ProductNode searchRec(ProductNode root, int sku) {
        if (root == null || root.sku == sku)
            return root;

        if (sku < root.sku)
            return searchRec(root.left, sku);

        return searchRec(root.right, sku);
    }

    // Update Price
    public void updatePrice(int sku, double newPrice) {
        ProductNode product = searchRec(root, sku);
        if (product != null) {
            product.price = newPrice;
            System.out.println("Price updated successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    // Display Sorted Products by SKU
    public void displaySorted() {
        System.out.println("📋 Products Sorted by SKU:");
        inorder(root);
    }

    private void inorder(ProductNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println("SKU: " + root.sku +
                    ", Name: " + root.name +
                    ", Price: ₹" + root.price);
            inorder(root.right);
        }
    }
}

