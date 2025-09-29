package Mod3_Assignment;

import java.io.File;

public class Q22 {
    public static void main(String[] args) {
        File file = new File("delete_me.txt");

        if (file.delete()) {
            System.out.println("Deleted file: " + file.getName());
        } else {
            System.out.println("Failed to delete file.");
        }
    }
}
