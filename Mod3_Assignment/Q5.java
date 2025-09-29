/*Write a Java program that creates three threads: "Worker-1", "Worker-2", 
and "Worker-3". Assign different priorities and print messages from each thread showing their execution order. */
package Mod3_Assignment;

public class Q5 {

    public static void main(String[] args) {
        Thread worker1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " is working, step " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Worker-1");

        Thread worker2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " is working, step " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Worker-2");

        Thread worker3 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " is working, step " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Worker-3");

        worker1.setPriority(Thread.MAX_PRIORITY);   
        worker2.setPriority(Thread.NORM_PRIORITY);  
        worker3.setPriority(Thread.MIN_PRIORITY);   
        worker1.start();
        worker2.start();
        worker3.start();
    }
}
