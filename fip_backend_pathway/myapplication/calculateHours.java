// Define an interface with two methods
interface TimeCalculator {
    int getTotalHoursInDay();
    void displayHours();
}

// Implement the interface in a class
class HoursInDay implements TimeCalculator {
    // Implement method to return total hours in a day
    public int getTotalHoursInDay() {
        return 24; // A standard day has 24 hours
    }

    // Implement method to display hours
    @Override
    public void displayHours() {
        System.out.println("There are " + getTotalHoursInDay() + " hours in a day.");
    }
}

// Main class to test the implementation
public class calculateHours {
    public static void main(String[] args) {
        HoursInDay hours = new HoursInDay();
        hours.displayHours(); // Display the number of hours in a day
    }
}
