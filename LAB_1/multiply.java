package LAB_1;
import java.util.*;

class multiply {
    public static void main(String args[]){
        int a, b, ans;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        a = sc.nextInt();

        System.out.print("Enter the second number: ");
        b = sc.nextInt();

        ans = a * b;

        System.out.println("Multiplication of given numbers: "+ans);
    }
}