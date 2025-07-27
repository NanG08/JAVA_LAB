package Mod1_Assignment.Operators;
import java.util.*;

public class bitwiseOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int a = sc.nextInt();
        System.out.print("Enter number 2:");
        int b = sc.nextInt();
        System.out.println("AND OPERATION: "+ (a & b)); // AND
        System.out.println("OR OPERATOR: "+ (a | b)); // OR
        System.out.println("XOR OPERATION: " +(a ^ b)); // XOR
    sc.close();
}
}