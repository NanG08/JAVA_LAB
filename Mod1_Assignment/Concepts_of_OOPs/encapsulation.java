// Write a program to demonstrate encapsulation in Java.

package Mod1_Assignment.Concepts_of_OOPs;
import java.util.*;

 class Person {
    private String name; 

    public String getName() { return name; }
    public void setName(String n) { name = n; }
}

   public class encapsulation {
    public static void main(String[] args) {
        Person p = new Person();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");   
        String inputName = sc.nextLine();
        p.setName(inputName);
        System.out.println(p.getName());

        sc.close();
    }
}
