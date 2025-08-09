package Mod2_Assignment;

import java.util.*;
import java.io.IOException;
import java.util.logging.*;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Q9_prog {
    private static final Logger logger = Logger.getLogger(Q9_prog.class.getName());

    public static void main(String[] args) {
        try {
            FileHandler fileHandler = new FileHandler("error.log", true); 
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
            logger.setUseParentHandlers(false); 
        } catch (IOException e) {
            System.out.println("Failed to initialize logger: " + e.getMessage());
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new InvalidAgeException("Age is less than 18. Access not granted.");
            } else {
                System.out.println("You are eligible. Access granted.");
            }
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
            logger.severe(e.getMessage()); 
        } finally {
            sc.close();
        }
    }
}

