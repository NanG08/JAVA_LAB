package lab_4;

public class Q7_prog {
    public static void main(String[] args) {
    int[] num = {100,200,300};
        try {
            System.out.println(num[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    
    System.out.println("Program continued after Exception handling.");
    }}