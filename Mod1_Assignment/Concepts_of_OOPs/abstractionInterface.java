package Mod1_Assignment.Concepts_of_OOPs;


interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() { System.out.println("A Circle shape!"); }
} 

public class abstractionInterface {
    public static void main(String[] args) {
        Shape d = new Circle();
        d.draw();
    }
}
