package InterfaceDemo;

public class SqlServerCustomerDal implements ICustomerDal, IRepository {

    @Override
    public void add() {
        System.out.println("Added to Sql Server.");
    }
}
