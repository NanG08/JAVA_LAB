package Mod1_Assignment.Classes_and_Constructors;

public class CopyConstruct {
    int value;
    CopyConstruct(int newValue) {
        value = newValue;
        System.out.println("Constructor called with value: " + value);
    }
    CopyConstruct(CopyConstruct other) {
        value = other.value;
        System.out.println("Copy constructor called, copied value: " + value);
    }
}
