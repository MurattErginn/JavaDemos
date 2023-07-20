package ThrowDemo;

public class Main {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();
        System.out.println(accountManager.getBalance());
        accountManager.deposit(100);
        System.out.println(accountManager.getBalance());
        try {
            accountManager.withdraw(200);
        } catch (BalanceInsufficentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(accountManager.getBalance());
    }
}
