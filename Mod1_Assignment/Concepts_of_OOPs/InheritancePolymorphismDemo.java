// Create a program showing the use of inheritance and polymorphism.

package Mod1_Assignment.Concepts_of_OOPs;

class Music {
    void sound() { System.out.println("MUSIC!!"); }
}

class Beats extends Music {
    @Override
    void sound() { System.out.println("Play the beats!"); }
}
class Lyrics extends Music {
    @Override
    void sound() { System.out.println("Lyrics"); }
}
public class InheritancePolymorphismDemo {
    public static void main(String[] args) {
        Music a = new Beats();
        Music b = new Lyrics();
        a.sound();  
        b.sound();  
    }
}
