package InterfaceDemo;

public class OracleCustomerDal implements ICustomerDal, IRepository {
    @Override
    public void add() {
        System.out.println("Added to Oracle.");
    }
}
