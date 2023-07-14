import java.util.Scanner;

/*
This class contains a function which finds whether the letter received from the user is the vowel bold or thin and
notifies the user with a message.
 */
public class VowelType {
    public static void main(String[] args) {

        boolean isOn = true;
        Scanner scanObj = new Scanner(System.in);
        System.out.print("Lütfen bir harf giriniz(Çıkış için \"exit\" veya \"Exit\" yazınız): ");
        String input = scanObj.nextLine();

        while(isOn) {
            if(input.equals("Exit") || input.equals("exit")) {
                System.out.println("Have a great day!");
                isOn = false;
                break;
            } else {
                System.out.println("Girilen karakter " + findVovelType(input.charAt(0)));
                System.out.print("Lütfen bir harf giriniz(Çıkış için \"exit\" veya \"Exit\" yazınız): ");
                input = scanObj.nextLine();
            }
        }
    }
    public static String findVovelType(char ch) {
        String boldVovelsInTurkish = "aAıIoOuU";
        String thinVovelsInTurkish = "eEiİöÖüÜ";
        if(boldVovelsInTurkish.indexOf(ch) != -1) {
            return "kalın ünlüdür.";
        } else if(thinVovelsInTurkish.indexOf(ch) != -1) {
            return "ince ünlüdür.";
        } else {
            return "ünlü bir harf değil.";
        }

    }
}
