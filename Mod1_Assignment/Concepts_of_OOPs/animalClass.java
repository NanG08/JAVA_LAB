package Mod1_Assignment.Concepts_of_OOPs;

class Animal {
    void makeSound() { System.out.println("Animal Sounds"); }
}
class Dog extends Animal {
    void makeSound() { System.out.println("Wooof"); }
}
class Cat extends Animal {
    void makeSound() { System.out.println("Meow"); }
}

public class animalClass {
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat() };
        for (Animal a : animals) a.makeSound();
    }
}
