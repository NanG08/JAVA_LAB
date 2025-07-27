package Mod1_Assignment.Concepts_of_OOPs;

public class immutable {
    public static void main(String[] args) {
        String s = "test string";
        s.concat("123"); // String not changed
        System.out.println(s); // "test"
    }
}
