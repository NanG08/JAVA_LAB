package Mod1_Assignment.Concepts_of_OOPs;

class Demo {
    Demo() { System.out.println("Default Constructor"); }
    Demo(int a) { System.out.println("Parameterized Constructor: "+a); }
}

public class constructures {
    public static void main(String[] args) {
        new Demo();
        new Demo(5);
    }
}
