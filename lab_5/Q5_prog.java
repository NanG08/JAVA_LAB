package lab_5;


class CounterThread extends Thread {
    static int count = 0;

    public CounterThread(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    public void run() {
        for (int i = 0; i <= 10000; i++) {
            synchronized (this) {
                count++;
            }
        }
        System.out.println(getName() + "finished");
    }

}

public class Q5_prog {
    public static void main(String[] args) {
        Thread high = new CounterThread("High Priority Thread", 8);
        Thread low = new CounterThread("Low Priority Thread", 2);

        high.start();
        low.start();

        try {
            high.join();
            low.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
        System.out.println("Final count: " + CounterThread.count);
    }
}
