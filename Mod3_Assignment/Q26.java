package Mod3_Assignment;

import java.util.regex.*;

public class Q26 {
    public static void main(String[] args) {
        String email = "example@test.com";

        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println(email + " is a valid email address.");
        } else {
            System.out.println(email + " is not a valid email address.");
        }
    }
}
