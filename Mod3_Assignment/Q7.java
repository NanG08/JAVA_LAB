package Mod3_Assignment;

class TicketBooking {
    private int tickets = 10;

    public synchronized void bookTicket(String user) {
        if (tickets > 0) {
            System.out.println(user + " booked ticket. Tickets left: " + --tickets);
        } else {
            System.out.println(user + " failed to book. Tickets sold out!");
        }
    }
}

public class Q7 {
    public static void main(String[] args) {
        TicketBooking booking = new TicketBooking();

        Runnable user = () -> {
            for (int i = 0; i < 5; i++) {
                booking.bookTicket(Thread.currentThread().getName());
                try { Thread.sleep(200); } catch (InterruptedException e) {}
            }
        };

        Thread t1 = new Thread(user, "User-1");
        Thread t2 = new Thread(user, "User-2");
        Thread t3 = new Thread(user, "User-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
