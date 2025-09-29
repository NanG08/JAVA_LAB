/* Write a Java program where a daemon thread continuously writes 
"Auto-Save in progress..." every 3 seconds, while the main thread performs a file processing task. */
package Mod3_Assignment;

public class Q6 {
    public static void main(String[] args) {
        // Daemon thread: Auto-save every 3 seconds
        Thread autoSaveThread = new Thread(() -> {
            try {
                while (true) {
                    System.out.println("Auto-Save in progress...");
                    Thread.sleep(3000); 
                }
            } catch (InterruptedException e) {
                System.out.println("Auto-save interrupted");
            }
        });

        autoSaveThread.setDaemon(true); 
        autoSaveThread.start();
        System.out.println("File processing started...");
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Processing file chunk " + i);
                Thread.sleep(2000); 
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("File processing completed!");
    }
}
