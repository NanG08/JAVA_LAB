package Mod1_Assignment.String_Class_and_operations;
import  java.util.*;

public class charFrequency {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String s = sc.nextLine();
        int[] freq = new int[256];
        for (char ch: s.toCharArray()) freq[ch]++;
        for (int i = 0; i < 256; i++)
            if (freq[i] > 0) System.out.println((char)i + ":" + freq[i]);
    }
}
