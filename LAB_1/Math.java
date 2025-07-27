package LAB_1;
public class Math {
    public static void main(String[] args) {
    sum(3,4);
    sum(10,5,2);;
    }

    public static void sum(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }
    public static void sum(int a, int b, int c) {
        System.out.println("Sum of three integers: " + (a + b + c));
    }
}
