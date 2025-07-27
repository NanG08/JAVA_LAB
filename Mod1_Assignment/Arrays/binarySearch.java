package Mod1_Assignment.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9}; int key=5, l=0, r=arr.length-1;
        while (l<=r) {
            int m=l+(r-l)/2;
            if(arr[m]==key) {System.out.println("Found"); break;}
            if(arr[m]<key) l=m+1; else r=m-1;
        }
    }
}
