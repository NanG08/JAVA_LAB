package lab_5;

class NumThreads extends Thread{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + this.getName() + " is running: " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
}}

public class Q2_prog {
    public static void main(String[] args) {
        NumThreads t = new NumThreads();
        t.start();
    }
}