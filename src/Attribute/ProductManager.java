package Attribute;

public class ProductManager {
    public void add(Product product) {
        //JDBC -> Java Data Base Codes
        System.out.println("Product " + "(" + product.getCode() + ") added.");
    }

    public void add(int id, String name, String description, int stockAmount, double price) {

    }
}
