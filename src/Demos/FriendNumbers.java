package Demos;

import java.util.Scanner;

/*
    This class contains a function which finds whether the two numbers received from the user are friends or not.
 */
public class FriendNumbers {
    public static void main(String[] args) {
        while (true) {
            Scanner scanObj = new Scanner(System.in);
            System.out.print("Please enter first number (enter \"E\" to exit): ");
            String input = scanObj.nextLine();
            if (input.equals("E") || input.equals("e")) {
                System.out.println("Have a great day!!!");
                break;
            } else {
                System.out.print("Please enter second number: ");
                int num2 = scanObj.nextInt();
                int num1 = Integer.parseInt(input);
                if (areNumbersFriend(num1, num2)) {
                    System.out.println("The numbers you entered are friends");
                } else {
                    System.out.println("The numbers you entered are not friends");
                }
            }
        }
    }

    public static boolean areNumbersFriend(int num1, int num2) {
        int totalOfNum1 = 0;
        int totalOfNum2 = 0;
        for (int i = 1; i < num1 / 2 + 1; i++) {
            if (num1 % i == 0) {
                totalOfNum1 += i;
            }
        }
        for (int i = 1; i < num2 / 2 + 1; i++) {
            if (num2 % i == 0) {
                totalOfNum2 += i;
            }
        }
        return (totalOfNum1 == num2) && (totalOfNum2 == num1);
    }
}
