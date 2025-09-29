package Mod3_Assignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q21 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("source.txt");
             FileOutputStream fos = new FileOutputStream("copy.txt")) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("File copied successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}