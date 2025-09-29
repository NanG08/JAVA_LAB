package Mod3_Assignment;
import java.io.RandomAccessFile;
import java.io.IOException;

public class Q23 {
    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("random.txt", "rw")) {
            raf.writeUTF("Hello, Java RandomAccessFile!");

            raf.seek(7);
            raf.writeUTF("Overwritten text");

            raf.seek(0);
            System.out.println("File contents: " + raf.readUTF());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
