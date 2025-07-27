package Mod1_Assignment.Arrays;
import java.util.*;

public class removeDuplicates {
  public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5};
        Arrays.sort(arr);
        int n = arr.length;
        int[] tmp = new int[n]; int j=0;
        for(int i=0;i<n-1;i++) if(arr[i]!=arr[i+1]) tmp[j++]=arr[i];
        tmp[j++]=arr[n-1];
        for(int i=0;i<j;i++) System.out.print(tmp[i]+" ");
    }  
}
