package Mod1_Assignment.Classes_and_Constructors;

public class multiConstruct {
    multiConstruct() {
        System.out.println("Default constructor called");
    }
    multiConstruct(int a) {
        System.out.println("Parameterized constructor called with value: " + a);
    }
}

class Main {
    public static void main(String[] args) {
        multiConstruct obj1 = new multiConstruct(); // Calls default constructor
        multiConstruct obj2 = new multiConstruct(105); // Calls parameterized constructor
    }
}
