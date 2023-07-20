package HashMapDemo;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("Book","Kitap");
        dictionary.put("Table","Masa");
        dictionary.put("Computer","Bilgisayar");
        System.out.println(dictionary);
        System.out.println();
    }
}
