package lab_5;

class ChildThread extends Thread {
    public void run() {
        try {
            Thread.sleep(3000); 
        } catch (InterruptedException e) {
            System.out.println("Child thread interrupted: " + e.getMessage());
        }
        System.out.println("Child thread finished execution.");
        }
    }

public class Q3_prog {
    public static void main(String[] args) {
        ChildThread t = new ChildThread();
        t.start();
        
        try {
            t.join(); 
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
        
        System.out.println("Main thread has finished execution.");
    }
}
