// Parent Class: Sametime
import java.util.*;

public class Sametime implements Comparable<Sametime>, Cloneable {
    private long elapsedTime;

    // Default constructor for current time
    public Sametime() {
        this.elapsedTime = System.currentTimeMillis() / 1000; // Current time in seconds since epoch
    }

    // Constructor with elapsed time in seconds
    public Sametime(long elapsedTime) {
        if (elapsedTime < 0) {
            throw new IllegalArgumentException("Elapsed time cannot be negative.");
        }
        this.elapsedTime = elapsedTime;
    }

    // Constructor with hours, minutes, and seconds
    public Sametime(int hours, int minutes, int seconds) {
        if (hours < 0 || minutes < 0 || minutes >= 60 || seconds < 0 || seconds >= 60) {
            throw new IllegalArgumentException("Invalid time input.");
        }
        this.elapsedTime = hours * 3600 + minutes * 60 + seconds;
    }

    // Get the hour of the time
    public int getHour() {
        return (int) (elapsedTime / 3600) % 24;
    }

    // Get the minute of the time
    public int getMinute() {
        return (int) (elapsedTime / 60) % 60;
    }

    // Get the second of the time
    public int getSecond() {
        return (int) elapsedTime % 60;
    }

    // Get the total elapsed seconds
    public long getSeconds() {
        return elapsedTime;
    }

    // String representation of the time (hh:mm:ss)
    @Override
    public String toString() {
        int hours = (int) (elapsedTime / 3600) % 24;
        int minutes = (int) (elapsedTime / 60) % 60;
        int seconds = (int) elapsedTime % 60;
        return String.format("%d hours %d minutes %d seconds", hours, minutes, seconds);
    }

    // Compare this time with another time
    @Override
    public int compareTo(Sametime other) {
        return (int) (this.elapsedTime - other.elapsedTime);
    }

    // Clone this Sametime object
    @Override
    protected Sametime clone() throws CloneNotSupportedException {
        return (Sametime) super.clone();
    }
}
