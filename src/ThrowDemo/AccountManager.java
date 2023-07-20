package ThrowDemo;

public class AccountManager {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws BalanceInsufficentException {
        if(balance >= amount) {
            balance -= amount;
        } else {
            throw new BalanceInsufficentException("Insufficient balance.");
        }

    }

    public double getBalance() {
        return balance;
    }
}
