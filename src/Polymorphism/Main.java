package Polymorphism;

public class Main {
    public static void main(String[] args) {
//        BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new Emailchild()};
//        for (BaseLogger logger: loggers) {
//            logger.Log("Log message");
//        }
        CustomerManager customerManager = new CustomerManager(new EmailLogger());
        customerManager.add();
    }
}
