package lab_4;
import java.util.*;

interface StringOperation{
String operate(String str);
}

public class Q6_prog {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System. in);
    StringOperation toUpperCase = (string) -> string.toUpperCase();
    System.out.print("Enter String: ");
    String input = sc.next();
    String result = toUpperCase.operate(input);
    System.out.println("Original String is: "+input);
    System.out.println("Operated String is: "+result);

    sc.close();
    }
}