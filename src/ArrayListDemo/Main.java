package ArrayListDemo;

import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer(1, "Murat", "Ergin"));
        customers.add(new Customer(2, "Defne", "Eşkin"));
        customers.add(new Customer(3, "Duhan", "Güler"));
        customers.add(new Customer(4, "Musti", "Zengin"));

        for(Customer customer: customers) {
            System.out.println(customer.id + ". Customer: " + customer.firstName + " " + customer.lastName);
        }
    }
}
