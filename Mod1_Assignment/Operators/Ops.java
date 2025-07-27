package Mod1_Assignment.Operators;
import java.util.*;

public class Ops {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number 1:");
    int a = sc.nextInt();
    System.out.print("Enter number 2:");
    int b = sc.nextInt();
    System.out.println(a+b); // Arithmetic
    System.out.println(a>b); // Relational
    System.out.println(a>0 && b>0); // Logical

    sc.close();
    } 
}
