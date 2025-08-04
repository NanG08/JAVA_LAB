package shape;


class MainShape {
    MainShape() {
    }
    public static void main(String[] args) {
        Circle c = new Circle(2.0);
        System.out.println("Area: " + c.area());
        System.out.println("Perimeter: " + c.perimeter());

        Rectangle r = new Rectangle(6.0, 8.0);
        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
    }
} 