package Mod1_Assignment.Operators;
import java.util.*;

public class ternaryOp {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int a = sc.nextInt();
        System.out.print("Enter number 2:");
        int b = sc.nextInt();
        int max = (a>b)?a:b;
        System.out.println(max);
        
        sc.close();
    }
}
