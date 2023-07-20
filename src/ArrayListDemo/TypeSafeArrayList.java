package ArrayListDemo;

import java.util.ArrayList;
import java.util.Collections;

public class TypeSafeArrayList {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Ankara");
        cities.add("İstanbul");
        cities.add("İzmir");
        cities.add("Bolu");
        Collections.sort(cities);
        Collections.reverse(cities);
        for(String city: cities) {
            System.out.println(city);
        }
    }

}