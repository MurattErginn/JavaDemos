package StaticDemo;

public class ProductValidator {

    static {
        System.out.println("Static constructor worked.");
    }

    public ProductValidator() {
        System.out.println("Product Validator created.");
    }
    public static boolean isValid(Product product) {
        return product.price > 0 && !product.name.isEmpty();
    }

    public void checkID(int id) {
        if(id <= 0) {
            System.out.println("Invalid id.");
        } else {
            System.out.println("id is valid.");
        }
    };

    public static class AnotherClass { // we can only make static, inner classes.
        public static void delete(int id) {
            System.out.println("Product " + id + " is deleted.");
        }
    }
}
