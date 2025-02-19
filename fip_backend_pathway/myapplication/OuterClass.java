// Outer class
public class OuterClass {

    // Private instance variable
    private String outerField = "Outer class field";

    // Constructor for OuterClass
    public OuterClass() {
        System.out.println("OuterClass constructor called");
    }

    // Nested Static Class
    static class StaticNestedClass {
        // Static nested class does not have access to instance variables of the outer class
        public void display() {
            System.out.println("This is a static nested class.");
        }
    }

    // Inner (Non-static) Class
    class InnerClass {
        // Inner class can access both static and instance variables of the outer class
        public void showMessage() {
            System.out.println("This is an inner class, and it can access outer class field: " + outerField);
        }
    }

    // Method to demonstrate access to the nested classes
    public void accessNestedClasses() {
        // Accessing static nested class
        StaticNestedClass staticNested = new StaticNestedClass();
        staticNested.display();

        // Accessing inner class
        InnerClass inner = new InnerClass();
        inner.showMessage();
    }

    // Anonymous class
    public void anonymousClassExample() {
        // Creating an anonymous class that implements the Runnable interface
        Runnable anonymousRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is an anonymous class running...");
            }
        };
        anonymousRunnable.run();  // Call the run method
    }

    // Main method
    public static void main(String[] args) {
        // Create an instance of the outer class
        OuterClass outerClass = new OuterClass();

        // Access nested classes
        outerClass.accessNestedClasses();

        // Demonstrate anonymous class
        outerClass.anonymousClassExample();
    }
}
