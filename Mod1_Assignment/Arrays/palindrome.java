package Mod1_Assignment.Arrays;
import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String s = sc.nextLine();
        String rev = "";
        for(int i=s.length()-1; i>=0; i--) rev += s.charAt(i);
        System.out.println(s.equals(rev)? "Word is Palindrome" : "Word is Not Palindrome");

        sc.close();
    }
}
