package Mod1_Assignment.String_Class_and_operations;
import java.util.*;

public class stringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a palindrome:");
        String s = sc.nextLine();
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println("Is palindrome? " + s.equals(reversed));
        }
}
