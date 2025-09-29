// Create a thread by implementing the Runnable interface that takes a string 
// "MULTITHREADING" and prints its characters in reverse order one by one.

package Mod3_Assignment;

class ReverseRunnable implements Runnable {
    public void run() {
        String s = "MULTITHREADING";
        for (int i = s.length() - 1; i >= 0; i--)
            System.out.print(s.charAt(i));
    }
}

public class Q2 {
    public static void main(String[] args) {
        Thread t = new Thread(new ReverseRunnable());
        t.start();
    }
}