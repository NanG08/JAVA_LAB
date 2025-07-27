package Mod1_Assignment.Concepts_of_OOPs;

interface Swim {
    void swim();
}
interface Fly {
    void fly();
}
class Duck implements Swim, Fly {
    public void swim() { System.out.println("Duck swims"); }
    public void fly() { System.out.println("Duck flies"); }
}
public class MultipleInterfaceDemo {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.swim(); d.fly();
    }
}