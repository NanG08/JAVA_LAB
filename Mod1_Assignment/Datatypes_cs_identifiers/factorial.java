package Mod1_Assignment.Datatypes_cs_identifiers;
import java.util.*;

public class factorial {
   static int fact(int n) {
        if (n <= 1) return 1;
        else return n * fact(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int num = sc.nextInt();
        System.out.println(fact(num));

        sc.close();
    } 
}
