package Mod1_Assignment.Concepts_of_OOPs;

class sample{
    sample(){
        System.out.println("Default constructor called!");
    }
    sample(int a){
        System.out.println("Parameterized constructor called with value: " + a+ " !");
    }
}
public class constructors {
    public static void main(String[] args) {
        new sample();
        new sample(2);
    }
}
