package lab_4;
import java.util.*;

public class Q2_prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]> largest){
                largest = arr[i];
            }}
            int sum = 0;
            for (int num: arr) {
                sum += num;
            }
            double average = (double) sum / arr.length;
            System.out.println("Largest number: " + largest);   
            System.out.println("Average: " + average);
            sc.close();
        }}
