import Java.utils.*;

public interface Calculator{

public int compute(int a,b){

}}

public class Calculator_main{

public static void main(Strin args[]){
Calculator add=(a,b) -> a+b;
Calculator subtract=(a,b) -> a-b;
Calculator multiply=(a,b) -> a*b;
Calculator divide=(a,b) -> a/b;


int a=14, b=32;

System.out.print("Addition: "+ add(a,b);

System.out.print("Subtraction: "+subtract(a,b);

System.out.print("Multiply: "+multiply(a,b);

System.out.print("Division: "+divide(a,b);

}}