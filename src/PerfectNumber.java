import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanObj = new Scanner(System.in);
        boolean isOn = true;
        while (isOn) {
            System.out.print("Please enter a number (enter \"E\" to exit): ");
            String input = scanObj.nextLine();
            if (input.equals("E") || input.equals("e")) {
                System.out.println("Have a great day!!!");
                isOn = false;
                break;
            } else {
                int number = Integer.parseInt(input);
                int total = 0;
                for (int i = 1; i < number / 2 + 1; i++) {
                    if (number % i == 0) {
                        total += i;
                    }
                }
                if(total == number) {
                    System.out.println("The number you entered is a perfect number");
                } else {
                    System.out.println("The number you entered is not a perfect number");
                }
            }
        }
    }
}
