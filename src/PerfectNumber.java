import java.util.Scanner;
/*
This class contains a function which finds whether the number received from the user is perfect or not and  notifies
the user with a message.
 */
public class PerfectNumber {
    public static void main(String[] args) {
        while (true) {
            Scanner scanObj = new Scanner(System.in);
            System.out.print("Please enter a number (enter \"E\" to exit): ");
            String input = scanObj.nextLine();
            if (input.equals("E") || input.equals("e")) {
                System.out.println("Have a great day!!!");
                break;
            } else {
                int number = Integer.parseInt(input);
                if(isPerfectNumber(number)) {
                    System.out.println("The number you entered is a perfect number.");
                } else {
                    System.out.println("The number you entered is not a perfect number.");
                }

            }
        }
    }
    static boolean isPerfectNumber(int num) {
        int total = 0;
        for (int i = 1; i < num / 2 + 1; i++) {
            if (num % i == 0) {
                total += i;
            }
        }
        return total == num;
    }
}
