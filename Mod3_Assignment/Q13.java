package Mod3_Assignment;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;

public class Q13 {
    private static final Lock lock1 = new ReentrantLock();
    private static final Lock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> acquireLocks(lock1, lock2), "Thread-1");
        Thread t2 = new Thread(() -> acquireLocks(lock2, lock1), "Thread-2");

        t1.start();
        t2.start();
    }

    private static void acquireLocks(Lock first, Lock second) {
        try {
            while (true) {
                if (first.tryLock(500, TimeUnit.MILLISECONDS)) {
                    try {
                        if (second.tryLock(500, TimeUnit.MILLISECONDS)) {
                            try {
                                System.out.println(Thread.currentThread().getName() + " acquired both locks!");
                                break;
                            } finally {
                                second.unlock();
                            }
                        }
                    } finally {
                        first.unlock();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " retrying...");
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
