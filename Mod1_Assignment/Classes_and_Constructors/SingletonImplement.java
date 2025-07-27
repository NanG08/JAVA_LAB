package Mod1_Assignment.Classes_and_Constructors;

class Singleton {
    private static Singleton instance;
    private Singleton() {}
    public static Singleton getInstance() {
        if (instance==null) instance = new Singleton();
        return instance;
    }
}

public class SingletonImplement{
     public static void main(String[] args) {
            Singleton s1 = Singleton.getInstance();
            Singleton s2 = Singleton.getInstance();
            System.out.println("String 1 == String 2 is " + (s1 == s2));
        }
}
