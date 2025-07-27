package Mod1_Assignment.Operators;

public class stringCompare {
    public static void main(String[] args) {
            String s1 = "Hello";
            String s2 = "Hello";
            String s3 = new String("Hello");
            System.out.println("string1 == string2: " + (s1 == s2)); // true (same object)
            System.out.println("string1 == string3: " + (s1 == s3)); // false (different objects)
            System.out.println("string1.equals(string3): " + s1.equals(s3)); // true (same content)
        }
}
