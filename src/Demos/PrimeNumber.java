package Demos;

import java.util.Scanner;
/*
    This class contains a function which finds whether the number received from the user is prime or not.
 */
public class PrimeNumber {
    public static void main(String[] args) {

        while (true) {
            Scanner scanObj = new Scanner(System.in);
            System.out.print("Please enter a number(enter \"E\" to exit): ");
            String input =  scanObj.nextLine();
            if(input.equals("E") || input.equals("e")) {
                System.out.println("Have a great day!!!");
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
