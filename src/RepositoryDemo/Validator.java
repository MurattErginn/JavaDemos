package RepositoryDemo;

public class Validator {
    public <T extends IEntity> void validate(T entity) { // This is a generic method
        Validator validator = new Validator();
        Customer customer = new Customer();
        validator.validate(customer);
    }
}
