public class Time {
    private int hours;
    private int minutes;

    // Constructor
    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    // Method to add two Time objects
    public Time add(Time other) {
        int totalMinutes = this.minutes + other.minutes;
        int totalHours = this.hours + other.hours + totalMinutes / 60;
        totalMinutes = totalMinutes % 60;
        return new Time(totalHours, totalMinutes);
    }

    // Method to display time in HH:MM format
    public String toString() {
        return String.format("%02d:%02d", hours, minutes);
    }

    public static void main(String[] args) {
        Time time1 = new Time(2, 45);
        Time time2 = new Time(1, 30);
        Time result = time1.add(time2);

        System.out.println("Time 1: " + time1);
        System.out.println("Time 2: " + time2);
        System.out.println("Sum: " + result);
    }
}
