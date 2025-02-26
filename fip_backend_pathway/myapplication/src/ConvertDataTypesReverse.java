public class ConvertDataTypesReverse {
    public static void main(String[] args) {
        try {
            // Program 1: Convert Numbers to Strings and Back to Numbers
            int number = 8274;
            String numberAsString = String.valueOf(number); // Convert number to string
            System.out.println("Number as String: " + numberAsString);

            int convertedNumber = Integer.parseInt(numberAsString); // Convert string back to number
            System.out.println("String back to Number: " + convertedNumber);

            // Program 2: Reverse a String
            String original = "hello world";
            String reversed = new StringBuilder(original).reverse().toString(); // Reverse the string
            System.out.println("Original: " + original);
            System.out.println("Reversed: " + reversed);
        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid number format.");
        }
    }
}