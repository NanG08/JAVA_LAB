package lab_5;

class CounterThread extends Thread {
    static int count = 0;

    public CounterThread(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + "iteration: " + i);      
        }
    }

}

public class Q6_prog {
    public static void main(String[] args) {
        Thread max = new CounterThread("Maximum Priority Thread", Thread.MAX_PRIORITY);
        Thread min = new CounterThread("Minimum Priority Thread", Thread.MIN_PRIORITY);
        Thread norm = new CounterThread("Normal Priority Thread", Thread.NORM_PRIORITY);

        max.start();
        min.start();
        norm.start();

    }
}
