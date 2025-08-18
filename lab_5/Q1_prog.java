package lab_5;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

public void run() {
    System.out.println("Thread " + getName() + " is running.");
}}

public class Q1_prog {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");
        
        t1.start();
        t2.start();
    }
}