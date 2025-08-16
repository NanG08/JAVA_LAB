package lab_4;
import java.util.*;

interface StringOperate {
    String operate(String str);
}

public class Q5_prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = " Java Programming" ;

        //Trim the string
        StringOperate trimmedStr = (String string) -> string.replaceAll(" ", "");
        String resultTrim = trimmedStr.operate(str);

        //Convert to Uppercase
        StringOperate toUpperCase = (String string) -> string.toUpperCase();
        String resultUpper = toUpperCase.operate(str);
        

        //Replace 'Java' with 'Core Java'
        StringOperate replaceJava = (String string) -> string.replace("Java", "Core Java");
        String resultReplace = replaceJava.operate(str);

        System.out.println("Original String: " + str);
        System.out.println("Trimmed String: " + resultTrim);
        System.out.println("Uppercase String: " + resultUpper);
        System.out.println("Replaced String: " + resultReplace);
        
        sc.close();
        
}
}