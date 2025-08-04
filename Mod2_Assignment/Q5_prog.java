//Q5

package Mod2_Assignment;
import java.util.*;

public class Q5_prog {
    public static void main(String[] args){
        String[] list_strings = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 strings:");
        for(int i = 0; i < 5; i++) {
            list_strings[i] = sc.nextLine();
        }
        Arrays.sort(list_strings);
        System.out.println(" ");
        System.out.println("Sorted strings:");
        for(String str : list_strings) {
            System.out.println(str);

            sc.close();
        }
    }
}
