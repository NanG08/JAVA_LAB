package Mod3_Assignment;
import java.io.FileReader;
import java.io.IOException;

public class Q16 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("example.txt")) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
