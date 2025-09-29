package Mod3_Assignment;

class NumberPrinter {
    private int number = 1;
    private final int MAX = 20;

    public synchronized void printOdd() throws InterruptedException {
        while (number <= MAX) {
            if (number % 2 == 0) wait();
            System.out.println("Odd: " + number++);
            notify();
        }
    }

    public synchronized void printEven() throws InterruptedException {
        while (number <= MAX) {
            if (number % 2 != 0) wait();
            System.out.println("Even: " + number++);
            notify();
        }
    }
}

public class Q10_2 {
    public static void main(String[] args) {
        NumberPrinter np = new NumberPrinter();

        Thread t1 = new Thread(() -> {
            try { np.printOdd(); } catch (InterruptedException e) {}
        });

        Thread t2 = new Thread(() -> {
            try { np.printEven(); } catch (InterruptedException e) {}
        });

        t1.start();
        t2.start();
    }
}