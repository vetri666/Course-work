import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Time> timeList = new ArrayList<>();
        LinkedList<Time> timeQueue = new LinkedList<>();
        boolean restart;

        do {
            restart = false; // reset restart flag

            try {
                // Input for time1
                System.out.print("Enter time1 (hour minute second): ");
                int hour = sc.nextInt();
                int minute = sc.nextInt();
                int second = sc.nextInt();
                Time time1 = new Time(hour, minute, second);
                timeList.add(time1);
                System.out.println("Time1: " + time1);
                System.out.println("Elapsed seconds in time1: " + time1.getElapsedSeconds());

                // Input for time2
                System.out.print("Enter time2 (elapsed time): ");
                long elapsedTime2 = sc.nextLong();
                Time time2 = new Time(elapsedTime2);
                timeQueue.add(time2);
                System.out.println("Time2: " + time2);
                System.out.println("Elapsed seconds in time2: " + time2.getElapsedSeconds());

                // Compare time1 and time2
                System.out.println("time1.compareTo(time2)? " + time1.compareTo(time2));

                // Clone time1 to time3
                Time time3 = (Time) time1.clone();
                System.out.println("time3 is created as a clone of time1");
                System.out.println("time1.compareTo(time3)? " + time1.compareTo(time3));

                // Display all times in the ArrayList
                System.out.println("\nStored Times (ArrayList):");
                for (Time t : timeList) {
                    t.displayTime();
                }

                // Display all times in the LinkedList
                System.out.println("\nStored Times (LinkedList):");
                for (Time t : timeQueue) {
                    t.displayTime();
                }

            } catch (IllegalArgumentException e) {
                System.out.println("Validation error: " + e.getMessage());
                restart = true;
            } catch (CloneNotSupportedException e) {
                System.out.println("Cloning error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
                restart = true;
            }

            if (restart) {
                System.out.println("Restarting the program due to invalid input...");
            }
        } while (restart);

        sc.close();
    }
}
