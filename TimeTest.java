import java.util.ArrayList;
import java.util.Scanner;

public class TimeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Time> timeList = new ArrayList<>();

        try {
            // Input for time1
            System.out.print("Enter time1 (hour minute second): ");
            int hour1 = sc.nextInt();
            int minute1 = sc.nextInt();
            int second1 = sc.nextInt();

            // Create time1 object and add to the list
            Time time1 = new Time(hour1, minute1, second1);
            timeList.add(time1);

            // Display time1 details
            System.out.println(time1.toString());
            System.out.println("Elapsed seconds in time1: " + time1.getElapsedSeconds());

            // Input for time2
            System.out.print("Enter time2 (elapsed time in seconds): ");
            long time2Seconds = sc.nextLong();

            // Create time2 object and add to the list
            Time time2 = new Time(time2Seconds);
            timeList.add(time2);

            // Display time2 details
            System.out.println(time2.toString());
            System.out.println("Elapsed seconds in time2: " + time2.getElapsedSeconds());

            // Compare time1 and time2
            System.out.println("time1.compareTo(time2)? " + time1.compareTo(time2));

            // Clone time1 and compare with original
            Time time3 = (Time) time1.clone();
            System.out.println("time3 is created as a clone of time1");
            System.out.println("time1.compareTo(time3)? " + time1.compareTo(time3));

        } catch (InvalidTimeException | CloneNotSupportedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
