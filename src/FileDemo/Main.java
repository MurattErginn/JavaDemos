package FileDemo;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        getFileInfo();
    }
    public static void createFile() {
        File file = new File("C:\\Users\\Murat\\IdeaProjects\\JavaDemos\\src\\FileDemo\\files\\students.txt");
        try {
            if(file.createNewFile()) {
                System.out.println("File created.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getFileInfo() {
        File file = new File("C:\\Users\\Murat\\IdeaProjects\\JavaDemos\\src\\FileDemo\\files\\students.txt");
        if(file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Is file writable: " + file.canWrite());
            System.out.println("Is file readable: " + file.canRead());
            System.out.println("File size (byte): " + file.length());
        }
    }
}
