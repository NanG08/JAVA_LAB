package Mod1_Assignment.Inheritance_and_Method_Overriding;

class ParentX {
    void display() { System.out.println("Parent"); }
}
public class SuperOverride extends ParentX {
    void display() { 
        super.display(); // Calls the display method of ParentX
        System.out.println("Child"); 
    }

    public static void main(String[] args) {
        SuperOverride obj = new SuperOverride();
        obj.display(); // This will call the overridden method in SuperOverride
    }
    
}
