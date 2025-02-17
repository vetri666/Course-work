// Child class that extends Time and demonstrates polymorphism
class ExtendedTime extends Time {
    private String timeType;

    // Constructor to initialize extended time with additional type
    public ExtendedTime(int hour, int minute, int second, String timeType) throws InvalidTimeException {
        super(hour, minute, second); // Call parent class constructor
        this.timeType = timeType;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + timeType + ")"; // Override toString to add extra info
    }
}
