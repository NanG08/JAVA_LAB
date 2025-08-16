//Create a Custom Exception InvalidAgeException that is throw when a user's age is less than 18
package lab_3;
import java.util.*;


class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Q2_prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        try {
            if (age < 18) {
                throw new InvalidAgeException("You must be older than 18.");
            } else {
                System.out.println("You are eligible.");
            }
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        sc.close();
    }
}
