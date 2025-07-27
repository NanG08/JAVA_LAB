package Mod1_Assignment.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {-1, 5, 1, 4, 2, 7, 3, 6, 8, -2, 0};
        for(int i=0; i<arr.length-1; i++)
            for(int j=0; j<arr.length-i-1; j++)
                if(arr[j]>arr[j+1]) {
                    int t=arr[j]; arr[j]=arr[j+1]; arr[j+1]=t;
                }
        for(int i : arr) System.out.print(i+" ");
    }
}
