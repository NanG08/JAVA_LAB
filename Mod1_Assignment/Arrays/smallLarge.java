package Mod1_Assignment.Arrays;

public class smallLarge {
    public static void main(String[] args) {
        int[] arr = {5,2,10,1,7,-5,3};
        int min=arr[0], max=arr[0];
        for(int i: arr) {
            if(i<min) min=i;
            if(i>max) max=i;
        }
        System.out.println("Min: "+min+", Max: "+max);
    }
}
