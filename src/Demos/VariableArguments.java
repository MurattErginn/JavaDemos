package Demos;

/*
    This class is a demo for Variable Arguments
 */
public class VariableArguments {

    public static void main(String[] args) {
        int sum = sum(1,2,3,4,5);
        System.out.println(sum);
    }

    public static int sum(int ... nums) { // int ... means user can enter as much as int variable. (Variable Arguments)
        int sum = 0;
        for (int num:nums) {
            sum += num;
        }
        return sum;
    }
}
