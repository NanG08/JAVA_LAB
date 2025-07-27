package Mod1_Assignment.Inheritance_and_Method_Overriding;

abstract class Abs{
    abstract void display(); 
}
public class AbstractClass extends Abs {
    void display() { 
        System.out.println("This is an abstract class method implementation."); 
    }

    public static void main(String[] args) {
        AbstractClass obj = new AbstractClass();
        obj.display(); 
    }
    
}
