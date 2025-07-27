package Mod1_Assignment.String_Class_and_operations;

public class stringSplit {
    public static void main(String[] args) {
        String s = "Java is fun";
        String[] words = s.split(" ");
        for (String w : words) System.out.println(w);
    }
}
