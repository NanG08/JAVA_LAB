package Mod2_Assignment;
import java.util.*;

public class Q3_prog {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[5];

    for (int i = 0; i < 5; i++) {
        System.out.print("Enter number " + (i + 1) + ": ");
        arr[i] = sc.nextInt();
    }

    sc.close();

    System.out.println("Array is: " );
    for (int i =0; i<arr.length;i++)
    {System.out.print(arr[i] +" ");}

    // Reverse Array
    System.out.println("\nReversed Array is: ");
    for(int i=arr.length-1; i>=0; i--){
        System.out.print(arr[i] + " ");
}}}