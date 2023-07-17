package Overriding;

public class BaseLoanManager {
    public /* final */ double calculate(double amount) { // if we make this final, none of the child class can override this method
        return amount * 1.18;
    }
}
