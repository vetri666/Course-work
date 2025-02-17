public class Time extends AbstractTime implements Cloneable, Comparable<Time> {
    private long elapsedTime; // stores elapsed time since midnight, Jan 1, 1970

    // Constructors
    public Time() {
        this.elapsedTime = System.currentTimeMillis() / 1000;
    }

    public Time(int hour, int minute, int second) throws IllegalArgumentException {
        if (hour < 0 || minute < 0 || second < 0 ) {
            throw new IllegalArgumentException("Invalid time format: ensure 0 ≤ minute  and 0 ≤ second .");
        }
        this.elapsedTime = (hour * 3600) + (minute * 60) + second;
    }

    public Time(long elapsedTime) throws IllegalArgumentException {
        if (elapsedTime < 0) {
            throw new IllegalArgumentException("Elapsed time cannot be negative.");
        }
        this.elapsedTime = elapsedTime;
    }

    // Getters
    public int getHour() {
        return (int) ((elapsedTime / 3600) % 24);
    }

    public int getMinute() {
        return (int) ((elapsedTime / 60) % 60);
    }

    public int getSecond() {
        return (int) (elapsedTime % 60);
    }

    public long getElapsedSeconds() {
        return elapsedTime;
    }

    // toString method
    @Override
    public String toString() {
        return getHour() + " hours " + getMinute() + " minutes " + getSecond() + " seconds";
    }

    // compareTo method
    @Override
    public int compareTo(Time other) {
        return (int) (this.elapsedTime - other.elapsedTime);
    }

    // clone method
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Abstract method implementation
    @Override
    public void displayTime() {
        System.out.println(this);
    }
}
