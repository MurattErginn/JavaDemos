package Attribute;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Laptop");
        product.setId(12);
        product.setDescription("Asus Laptop");
        product.setPrice(5500);
        product.setStockAmount(30);

        ProductManager productManager = new ProductManager();
        productManager.add(product);
    }
}
