/*Write a program where one thread prints a countdown from 10 to 1 (1-second delay),
while another thread simultaneously prints "Tick..." every half a second. */

package Mod3_Assignment;

public class Q4 {
    public static void main(String[] args) {
        Thread countdownThread = new Thread(() -> {
            try {
                for (int i = 10; i >= 1; i--) {
                    System.out.println("Countdown: " + i);
                    Thread.sleep(1000); 
                }
            } catch (InterruptedException e) {
                System.out.println("Countdown thread interrupted");
            }
        });

        Thread tickThread = new Thread(() -> {
            try {
                while (true) {
                    System.out.println("Tick...");
                    Thread.sleep(500); 
                }
            } catch (InterruptedException e) {
                System.out.println("Tick thread interrupted");
            }
        });
        countdownThread.start();
        tickThread.start();

        new Thread(() -> {
            try {
                countdownThread.join(); 
                tickThread.interrupt(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
