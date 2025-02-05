public class DayWeek {
    // Superclass
    class Day {
        String dayType;

        // Constructor
        public Day(String dayType) {
            this.dayType = dayType;
        }

        // Method to display day type
        public void displayDayType() {
            System.out.println("This is a " + dayType + " day.");
        }
    }

    // Enum for days of the week
    enum WeekDay {
        MONDAY("Weekday"),
        TUESDAY("Weekday"),
        WEDNESDAY("Weekday"),
        THURSDAY("Weekday"),
        FRIDAY("Weekday"),
        SATURDAY("Weekend"),
        SUNDAY("Weekend");

        private String dayType;

        // Constructor
        WeekDay(String dayType) {
            this.dayType = dayType;
        }

        // Method to get the day type
        public String getDayType() {
            return dayType;
        }
    }

    // Subclass (non-static)
    class WeekDayInfo extends Day {

        WeekDayInfo(String dayType) {
            super(dayType); // calling the superclass constructor
        }

        public void displayDayInfo() {
            System.out.println("Day type: " + dayType);
        }
    }

    // Main class
    public static void main(String[] args) {
        // Create an instance of DayWeek to instantiate non-static inner class
        DayWeek dayWeek = new DayWeek();

        // Displaying days of the week
        for (WeekDay day : WeekDay.values()) {
            System.out.println(day.name() + " - " + day.getDayType());

            // Creating an instance of the subclass with the day type
            WeekDayInfo dayInfo = dayWeek.new WeekDayInfo(day.getDayType());
            dayInfo.displayDayInfo(); // Calling method from subclass
        }
    }
}
