package Mod3_Assignment;

import java.io.FileWriter;
import java.io.IOException;

public class Q17 {
    public static void main(String[] args) {
        String data = "Writing to a file using FileWriter in Java.";

        try (FileWriter writer = new FileWriter("example.txt")) {
            writer.write(data);
            System.out.println("Data written to example.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
