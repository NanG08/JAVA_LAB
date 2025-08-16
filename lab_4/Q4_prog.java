package lab_4;

abstract class Shape {
    void disShape() {
        System.out.println("This is a shape!");
    }
    abstract double area();
}

class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double area() {
        return length * width;
    }
}

public class Q4_prog {
    public static void main(String[] args) {
        Shape circle = new Circle(3.5);
        circle.disShape();
        System.out.println("Area of Circle: " + circle.area());

        Shape rectangle = new Rectangle(2.5, 3);
        rectangle.disShape();
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}