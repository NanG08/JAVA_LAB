package Mod3_Assignment;
import java.io.*;

public class Q18 {
    public static void main(String[] args) {
        String data = "This is written using BufferedWriter for efficiency.";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("buffered.txt"))) {
            bw.write(data);
            System.out.println("Data written to buffered.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader("buffered.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Read: " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}