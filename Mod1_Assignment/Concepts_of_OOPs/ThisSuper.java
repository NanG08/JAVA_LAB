package Mod1_Assignment.Concepts_of_OOPs;

class SuperClass {
        String name = "SuperClass";
        SuperClass() {
            System.out.println("SuperClass constructor called.");
        }
    }

    class SubClass extends SuperClass {
        String name;
        SubClass(String name) {
            super(); // Calls parent constructor
            this.name = name; // 'this' refers to current class instance variable
        }
        void printName() {
            System.out.println("SubClass name: " + this.name);
            System.out.println("SuperClass name: " + super.name); // 'super' refers to parent
        }
    }

    public class ThisSuper {
        public static void main(String[] args) {
            SubClass obj = new SubClass("MySub");
            obj.printName();
        }
    }
