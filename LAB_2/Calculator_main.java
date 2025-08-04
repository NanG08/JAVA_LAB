// package LAB_2;

import java.util.*;

@FunctionalInterface
interface Calculator {
	int compute(int a, int b);
}

public class Calculator_main{

static Scanner sc = new Scanner(System.in);

public static void main(String args[]){
Calculator add = (a, b) -> a + b;
Calculator subtract = (a, b) -> a - b;
Calculator multiply = (a, b) -> a * b;
Calculator divide = (a, b) -> b/a;


System.out.print("Enter first number: ");
int a = sc.nextInt();
System.out.print("Enter second number: ");
int b = sc.nextInt();

System.out.println("Addition: " + add.compute(a, b));
System.out.println("Subtraction: " + subtract.compute(a, b));
System.out.println("Multiply: " + multiply.compute(a, b));
System.out.println("Division: " + divide.compute(a, b));
}}