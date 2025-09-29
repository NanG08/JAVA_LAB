package Mod3_Assignment;

class Chopstick {
}

class Philosopher extends Thread {
    private Chopstick left, right;

    Philosopher(String name, Chopstick left, Chopstick right) {
        super(name);
        this.left = left;
        this.right = right;
    }

    public void run() {
        synchronized (left) {
            System.out.println(getName() + " picked up left chopstick");
            try { Thread.sleep(500); } catch (InterruptedException e) {}
            synchronized (right) {
                System.out.println(getName() + " picked up right chopstick");
            }
        }
    }
}

public class Q9 {
    public static void main(String[] args) {
        Chopstick c1 = new Chopstick();
        Chopstick c2 = new Chopstick();

        new Philosopher("Philosopher-1", c1, c2).start();
        new Philosopher("Philosopher-2", c2, c1).start(); // creates deadlock
    }
}
