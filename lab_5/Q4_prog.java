package lab_5;

class Greeting extends Thread {
    private String message;
    public Greeting(String name, String msg) {
        super(name);
        this.message = msg;
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + ": " + message + "");
            try {
                Thread.sleep(100 + (int)(Math.random() * (500 - 100 + 1)));
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted: " + e.getMessage());
            }
        }
    }
}

public class Q4_prog {
    public static void main(String[] args) {
        Thread t1 = new Greeting("Thread 1", "Hello from Thread 1!");
        Thread t2 = new Greeting("Thread 2", "Hello from Thread 2!");
        Thread t3 = new Greeting("Thread 3", "Hello from Thread 3!");

        t1.start();
        t2.start();
        t3.start();
    }
}