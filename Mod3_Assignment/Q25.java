package Mod3_Assignment;
import java.util.Date;
import java.util.Calendar;

public class Q25 {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("Current Date & Time: " + now);

        Calendar cal = Calendar.getInstance();
        System.out.println("Year: " + cal.get(Calendar.YEAR));
        System.out.println("Month: " + (cal.get(Calendar.MONTH) + 1)); // 0-based
        System.out.println("Day: " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("Hour: " + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute: " + cal.get(Calendar.MINUTE));
    }
}
