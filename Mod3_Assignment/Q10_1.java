package Mod3_Assignment;

class DataBuffer {
    private int data;
    private boolean available = false;

    public synchronized void produce(int value) throws InterruptedException {
        while (available) wait();
        data = value;
        System.out.println("Produced: " + data);
        available = true;
        notify();
    }

    public synchronized void consume() throws InterruptedException {
        while (!available) wait();
        System.out.println("Consumed: " + data);
        available = false;
        notify();
    }
}

public class Q10_1 {
    public static void main(String[] args) {
        DataBuffer buffer = new DataBuffer();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try { buffer.produce(i); Thread.sleep(500); } catch (InterruptedException e) {}
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try { buffer.consume(); Thread.sleep(800); } catch (InterruptedException e) {}
            }
        });

        producer.start();
        consumer.start();
    }
}