package FileDemo;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getFileInfo();
        writeFile();
        readFile();
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

    public static void readFile() {
        File file = new File("C:\\Users\\Murat\\IdeaProjects\\JavaDemos\\src\\FileDemo\\files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Murat\\IdeaProjects\\JavaDemos\\src\\FileDemo\\files\\students.txt", true));
            writer.newLine();
            writer.write("Murat");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
