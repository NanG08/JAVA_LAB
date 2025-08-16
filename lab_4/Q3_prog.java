package lab_4;

class Person{
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    int employID;
    Employee(String name, int age, int employID) {
        super(name, age);
        this.employID = employID;
    }
}

class Manager extends Employee {
    String department;
    Manager(String name, int age, int employID, String department) {
        super(name, age, employID);
        this.department = department;
    }

static void disDetails(Manager manager){
    System.out.println("Name: " + manager.name);
    System.out.println("Age: " + manager.age);
    System.out.println("Employee ID: " + manager.employID);
    System.out.println("Department: " + manager.department);
}}

public class Q3_prog {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 35, 12345, "Sales");
        Manager.disDetails(manager);
    }
}
