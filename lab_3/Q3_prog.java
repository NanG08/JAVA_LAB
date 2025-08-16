//WAP to demonstrate the use of throw and throws keywords in a program that calculates the factorial of 2 nos . Throw exception if number is negative.

package lab_3;
import java.util.*;

public class Q3_prog {
    static Scanner sc = new Scanner(System.in);
    public static long factorial(int n) throws Exception {
        if (n < 0) {
            throw new Exception("Number must be non-negative. Hence, Factorial cannot be calculated.");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        try{
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num < 0) {
                throw new Exception("Number must be non-negative.Hence, Factorial cannot be calculated.");
            }
            long factorial = factorial(num);
            System.out.println("Factorial of " + num + " is: " + factorial);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
}
}