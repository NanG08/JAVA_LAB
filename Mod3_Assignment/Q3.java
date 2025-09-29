/* Create a program that creates two threads. The first thread should print "Thread 1" 
every 1 second, and the second thread should print "Thread 2" every 2 seconds. */

package Mod3_Assignment;

public class Q3 {

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            try {
                while (true) {
                    System.out.println("Thread 1");
                    Thread.sleep(1000); 
                }
            } catch (InterruptedException e) {
                System.out.println("Thread 1 interrupted");
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                while (true) {
                    System.out.println("Thread 2");
                    Thread.sleep(2000); 
                }
            } catch (InterruptedException e) {
                System.out.println("Thread 2 interrupted");
            }
        });
        thread1.start();
        thread2.start();
    }
}