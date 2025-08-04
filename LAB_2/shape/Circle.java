package shape;

public class Circle implements Shape {
private double radius;

public Circle(double radius){
    this.radius = radius;
}

public double area(){
    return Math.PI*this.radius*this.radius;
}

public double perimeter(){
    return Math.PI*2*this.radius;
}
}
