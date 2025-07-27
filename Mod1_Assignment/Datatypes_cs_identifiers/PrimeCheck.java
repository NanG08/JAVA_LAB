package Mod1_Assignment.Datatypes_cs_identifiers;
import java.util.*;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime:");
        int n = sc.nextInt();

        int i = 2, count = 0;
        while (i <= n/2) {
            if (n % i == 0) count++;
            i++;
        }

        if (count == 0) System.out.println("Number is Prime!");
        else System.out.println("Number is not Prime!");

        sc.close();
    }
}
