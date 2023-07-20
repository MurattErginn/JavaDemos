package ReadingFileDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        BufferedReader reader = null;
        int total = 0;
        try {
            String line = null;
            reader = new BufferedReader(new FileReader("C:\\Users\\Murat\\IdeaProjects\\JavaDemos\\src\\ReadingFileDemo\\numbers.txt"));
            while ((line = reader.readLine()) != null) {
                total += Integer.valueOf(line);
            }
            System.out.println(total);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
