package LAB_1;
import java.util.Scanner;

public class add {
    public static void  main(String args[]){
        int a,b, sumofNum;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        a = sc.nextInt();

        System.out.print("Enter the second number: ");
        b = sc.nextInt();
        
        sumofNum =a+b;
        System.out.println("Sum = "+sumofNum);
        sc.close();
    }
}