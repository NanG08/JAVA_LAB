package Mod1_Assignment.Inheritance_and_Method_Overriding;

class A {}
class B extends A {}
class C extends B {}
public class mutiInherit {
        public static void main(String[] args) {
            C obj = new C();
            System.out.println("C is instance of A: " + (obj instanceof A));
        }
    }
