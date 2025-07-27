package Mod1_Assignment.Arrays;
import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fibonacci Series:");
        int n = sc.nextInt();
        int a = 0, b = 1, c;
        System.out.print(a+" "+b);
        for(int i=2; i<n; i++){
            c = a+b; System.out.print(" "+ c);
            a = b; b = c;

            sc.close();
        }
    }
}
