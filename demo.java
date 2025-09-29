public class demo {
    public static void main(String[] args) { 
        int[] numbers = {10, 20, 30, 40, 50};
        // Accessing elements 	
        System.out.println("First element: " + numbers[0]);
        //Modifying an element numbers[2] = 35; 	
        System.out.println("Updated third element: " + numbers[2]); 
        // Loop through the array 
        for (int number : numbers) { 			System.out.println(number);
        }
    } 
}