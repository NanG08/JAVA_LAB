//WAP TO DEMONSTRATE THE DIFFERENCE BETWEEN TRY-CATCH AND TRY-CATCH-FINALLY BY DIVIDING 2 NOS. AND HANDLING ARITHEMATIC EXCEPTION .

package lab_3;
import java.util.*;

public class Q1_prog {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int b=0;
        try{
            int c= a/b;
            System.out.println("Result: " + c);
        } catch(ArithmeticException e) {
            System.out.println("Error: Try-Catch cannot perform division by zero is not allowed.");
        } 
        
        try{
            int c= a/b;
            System.out.println("Result: " + c);
        } catch(ArithmeticException e) {
            System.out.println("Error: Try-Catch-Finally cannot perform division by zero is not allowed.");
        } 
        finally {
            System.out.println("Execution completed.");
        }
    }
}
