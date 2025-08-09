package Mod2_Assignment;


interface SquareCalculate {
    int calculate(int number);
}

public class Q6_prog {
    
     public static int findSquare(int number) {
        return number * number;
    }

    public static void main(String[] args){
        
    SquareCalculate calculator = Q6_prog::findSquare;
        int num = 5;
        int result = calculator.calculate(num);

        System.out.println("Square of " + num + " is: " + result);
    }
}
