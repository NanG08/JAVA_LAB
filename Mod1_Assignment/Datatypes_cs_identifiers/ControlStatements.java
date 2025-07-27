package Mod1_Assignment.Datatypes_cs_identifiers;

public class ControlStatements {
    public static void main(String[] args) {
        int n = 2;
        if (n == 1) System.out.println("One");
        else System.out.println("Not one");

        switch(n) {
            case 1: System.out.println("One"); break;
            case 2: System.out.println("Two"); break;
            default: System.out.println("Other");
        }

        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
        }
    }
}
