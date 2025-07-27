package Mod1_Assignment.Arrays;
import java.util.*;

public class largestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter three numbers:");
            int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
            sc.close();
            int max = n1;
            if (n2 > max) max = n2;
            if (n3 > max) max = n3;
            System.out.println("Largest Number is: " + max);

        sc.close();
    }
}

