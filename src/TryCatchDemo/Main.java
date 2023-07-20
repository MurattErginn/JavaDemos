package TryCatchDemo;

public class Main {
    public static void main(String[] args) {
        try{
            int[] numbers = new int[] {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Exception satırı çalıştı");
        }
    }
}
