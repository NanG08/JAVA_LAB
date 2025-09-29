package Mod3_Assignment;
import java.util.concurrent.locks.ReentrantLock;

class Counter {
    private int count = 0;
    private ReentrantLock lock = new ReentrantLock();

    public void incrementWithLock() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }

    public void incrementWithoutLock() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class Q12 {
    public static void main(String[] args) throws InterruptedException {
        Counter counterWithLock = new Counter();
        Counter counterWithoutLock = new Counter();

        Runnable taskWithLock = () -> {
            for (int i = 0; i < 1000; i++) {
                counterWithLock.incrementWithLock();
            }
        };

        Runnable taskWithoutLock = () -> {
            for (int i = 0; i < 1000; i++) {
                counterWithoutLock.incrementWithoutLock();
            }
        };

        Thread t1 = new Thread(taskWithLock);
        Thread t2 = new Thread(taskWithLock);
        Thread t3 = new Thread(taskWithoutLock);
        Thread t4 = new Thread(taskWithoutLock);

        t1.start(); t2.start();
        t3.start(); t4.start();

        t1.join(); t2.join();
        t3.join(); t4.join();

        System.out.println("Count with lock: " + counterWithLock.getCount()); 
        System.out.println("Count without lock: " + counterWithoutLock.getCount()); 
    }
}
