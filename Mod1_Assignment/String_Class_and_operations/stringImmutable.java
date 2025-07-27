package Mod1_Assignment.String_Class_and_operations;

public class stringImmutable {
    public static void main(String[] args) {
        String s = "abc";
        s.concat("xyz"); // s will not change
        System.out.println(s); // Output "abc"
    }
}