package Mod3_Assignment;

import java.io.File;
import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter directory path: ");
        String path = sc.nextLine();

        File dir = new File(path);
        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            if (files != null) {
                System.out.println("Files in " + path + ":");
                for (File file : files) {
                    System.out.println(file.getName());
                }
            }
        } else {
            System.out.println("Invalid directory path.");
        }
    }
}