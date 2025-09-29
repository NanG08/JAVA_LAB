package Mod3_Assignment;

class FileDownloader implements Runnable {
    private volatile boolean running = true;

    public void stop() {
        running = false;
    }

    public void run() {
        int chunk = 1;
        while (running) {
            System.out.println("Downloading chunk " + chunk++);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
        System.out.println("Download stopped.");
    }
}

public class Q11 {
    public static void main(String[] args) throws InterruptedException {
        FileDownloader downloader = new FileDownloader();
        Thread downloadThread = new Thread(downloader);
        downloadThread.start();

        Thread.sleep(3000); 
        downloader.stop();  
    }
}

