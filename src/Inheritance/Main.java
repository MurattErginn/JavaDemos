package Inheritance;

public class Main {
    public static void main(String[] args) {
        LoanUI loanUI = new LoanUI();
        loanUI.LoanCalculate(new TeacherLoanManager()); // normally LoanCalculate() method takes BaseLoanManager object as parameter but BaseLoanManager is superclass of TeacherLoanManager, so we can give TeacherLoanManager as parameter.
    }
}
