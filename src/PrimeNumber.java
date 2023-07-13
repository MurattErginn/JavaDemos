import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanObj = new Scanner(System.in);
        boolean isOn = true;
        while (isOn) {
            System.out.print("Please enter a number(enter \"E\" to exit): ");
            String input =  scanObj.nextLine();
            if(input.equals("E")) {
                System.out.println("Have a great day!!!");
                isOn = false;
                break;
            } else {
                int number = Integer.parseInt(input);
                if(number <= 0) {
                    System.out.println("Invalid input. Please enter a number higher that 2.");
                    continue;
                }
                if (isPrime(number)) System.out.println(number + " is a prime number.");
                else System.out.println(number + " is not a prime number.");
            }
        }
    }

    static boolean isPrime(int number) {
        if (number == 1) return false;
        if (number == 2) return true;
        for (int i = 2; i <= (number / 2) + 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
