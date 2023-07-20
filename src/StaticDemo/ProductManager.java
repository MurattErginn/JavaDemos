package StaticDemo;

public class ProductManager {
    public void add(Product product) {
        if(ProductValidator.isValid(product)) {
            System.out.println(product.name + " (Product) added.");
        } else {
            System.out.println("Product informations are invalid.");
        }

        ProductValidator productValidator = new ProductValidator();
        productValidator.checkID(product.id);
    }
}
