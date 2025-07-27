package Mod1_Assignment.Concepts_of_OOPs;

class simpleMultiplication {
    int add(int a, int b) { return a*b; } // Overloading
    int add(int a, int b, int c) { return a*b*c; }
}

class AdvancedMultiplication extends simpleMultiplication {
    @Override
    int add(int a, int b) { return a*b*10; } // Overriding
}


public class OverloadDrive {
    public static void main(String[] args) {
        simpleMultiplication m1 = new simpleMultiplication();
        simpleMultiplication m2 = new simpleMultiplication();
        System.out.println(m1.add(1, 2));
        System.out.println(m1.add(1, 2, 3));
        System.out.println(m2.add(1, 2));
    }
}
