import java.util.ArrayList;
import java.util.Scanner;

public class NumberFinder {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            Scanner scanObj = new Scanner(System.in);
            System.out.print("Please enter a number (Enter \"okey\" or \"Okey\" to stop entering new number. Enter \"E\" to exit): ");
            String input = scanObj.nextLine();
            if (input.equals("E") || input.equals("e")) {
                System.out.println("Have a great day!!!");
                break;
            } else if (input.equals("okey") || input.equals("Okey")) {
                System.out.println(numbers);
                System.out.print("Please enter the target number: ");
                Integer targetNum = Integer.parseInt(String.valueOf(scanObj.nextInt()));
                if (isNumberExist(targetNum, numbers)) {
                    System.out.println("The target number exists in the list of numbers");
                } else {
                    System.out.println("The target number doesn't exist in the list of numbers");
                }
                break;
            } else {
                Integer num = Integer.parseInt(input);
                numbers.add(num);
            }
        }
    }

    public static boolean isNumberExist(Integer targetNum, ArrayList<Integer> arr) {
        for (Integer integer : arr) {
            if (targetNum.equals(integer)) {
                return true;
            }
        }
        return false;
    }
}
