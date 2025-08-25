package lab_6;


class StoppableTask implements Runnable {
    private volatile boolean running = true;

    @Override
    public void run() {
        int i = 1;
        while (running && i <= 100) {
            System.out.println("Number: " + i);
            i++;
            try { Thread.sleep(200); } catch (InterruptedException e) {}
        }
        System.out.println("Thread stopped safely.");
    }

    public void stopTask() {
        running = false; 
    }
}

public class Q5_prog {
    public static void main(String[] args) throws InterruptedException {
        StoppableTask task = new StoppableTask();
        Thread t = new Thread(task);
        t.start();

        Thread.sleep(2000); 
        task.stopTask();    
    }
}