// Create a thread by extending the Thread class that prints even numbers
// from 2 to 20 with a 500ms delay between each number.

package Mod3_Assignment;

class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        evenThread.start();
    }
}
