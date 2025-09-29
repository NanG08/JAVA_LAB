package Mod3_Assignment;

class Inventory {
    private int stock = 20;

    public void sellItem(String threadName) {
        synchronized (this) { // synchronized block
            if (stock > 0) {
                System.out.println(threadName + " sold 1 item. Stock left: " + --stock);
            } else {
                System.out.println(threadName + " cannot sell. Out of stock!");
            }
        }
    }
}

public class Q8 {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Runnable seller = () -> {
            for (int i = 0; i < 10; i++) {
                inventory.sellItem(Thread.currentThread().getName());
                try { Thread.sleep(100); } catch (InterruptedException e) {}
            }
        };

        new Thread(seller, "Seller-1").start();
        new Thread(seller, "Seller-2").start();
    }
}
