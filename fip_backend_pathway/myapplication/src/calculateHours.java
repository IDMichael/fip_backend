// Define an interface with two methods
interface TimeCalculator {
    int getTotalHoursInDay();
    void displayHours();
}

// Implement the interface in a class
class HoursInDay implements TimeCalculator {
    // Implement method to return total hours in a day
    @Override
    public int getTotalHoursInDay() {
        return 24; // A standard day has 24 hours
    }

    // Implement method to display hours
    @Override
    public void displayHours() {
        int hours = getTotalHoursInDay(); // Ensure the method is used
        System.out.println("There are " + hours + " hours in a day.");
    }
}

// Main class to test the implementation
public class calculateHours {
    public static void main(String[] args) {
        TimeCalculator hours = new HoursInDay();
        System.out.println("Total hours in a day: " + hours.getTotalHoursInDay()); // Explicitly using the method
        hours.displayHours(); // Display the number of hours in a day
    }
}