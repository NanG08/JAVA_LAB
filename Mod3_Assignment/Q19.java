package Mod3_Assignment;

import java.io.File;
import java.io.IOException;

public class Q19 {
    public static void main(String[] args) {
        File file = new File("testfile.txt");

        if (file.exists()) {
            System.out.println("File exists: " + file.getAbsolutePath());
        } else {
            try {
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getAbsolutePath());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}