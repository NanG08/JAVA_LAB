//Q1
package Mod2_Assignment.Utilities;
import java.util.*;

public class MainMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.add(a, b);
        System.out.println("The sum is: " + result);

        sc.close();
    }
}