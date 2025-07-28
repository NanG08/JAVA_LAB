public class Rectangle implements shape {
private double length;
private double width;

public Rectangle(double length, double width){
this.length = length;
this.width = width;
}

public double area(){
return (width*length);
}

public double perimeter(){
return 2*(length +width);
}


}