package lab_6;

class SharedData{
    private int data;
    private boolean available = false;

public synchronized void producer(int value) 
    throws InterruptedException  {
        while (available) {
            wait();
        }
    data = value;
    available = true;
    System.out.println("Produced: " + value);
    notify();
}

public synchronized int consumer() 
    throws InterruptedException{
        while (!available) {
            wait();
        }
        available = false;
        notify();
        System.out.println("Consumed: " + data);
        return data;
}}

public class Q4_prog {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();

        Thread producerThread = new Thread(() -> {
            int i = 1;
            while (true) {
                try {
                    sharedData.producer(i++);
                    Thread.sleep(200); 
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread consumerThread = new Thread(() -> {
            for (int i = 0; i <= 10; i++) {
                try {
                    sharedData.consumer();
                    Thread.sleep(120); 
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
