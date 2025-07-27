package Mod1_Assignment.Inheritance_and_Method_Overriding;

class Shape {
    double area() {
        return 0.0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        this.radius = r;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    @Override
    double area() {
        return length * width;
    }
}

public class dynamicDispatch {
     public static void main(String[] args) {
        Shape s1 = new Circle(5);        // dynamic method dispatch
        Shape s2 = new Rectangle(4, 6);  // superclass ref, subclass object

        System.out.println("Circle area: " + s1.area());
        System.out.println("Rectangle area: " + s2.area());
    }
}
