package Chapter6_LibraryClasses;

// Chapter 6: Library Classes
// Topic: Practical Wrapper Class Methods

public class WrapperMethodsDemo {
    public static void main(String[] args) {
        // --- 1. Converting Strings to Numbers ---
        // This is very common when reading input from users or files.
        System.out.println("=== String to Number Conversion ===");
        
        String intString = "123";
        String doubleString = "45.67";

        // Use parseInt() and parseDouble() to convert strings to primitives.
        int parsedInt = Integer.parseInt(intString);
        double parsedDouble = Double.parseDouble(doubleString);
        
        System.out.println("Parsed int: " + (parsedInt + 1)); // Proving it's a number
        System.out.println("Parsed double: " + (parsedDouble / 2)); // Proving it's a number

        // What happens with an invalid string?
        try {
            Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Error caught: " + e.getMessage());
        }

        // --- 2. Converting Numbers to Strings ---
        System.out.println("\n=== Number to String Conversion ===");
        
        int number = 789;
        String numberAsString = Integer.toString(number);
        System.out.println("Number converted to string: \"" + numberAsString + "\"");

        // --- 3. Comparison Methods ---
        System.out.println("\n=== Comparison Methods ===");
        
        Integer num1 = 100;
        Integer num2 = 200;
        Integer num3 = 100;

        // .equals() checks if the values are the same.
        System.out.println("num1.equals(num2): " + num1.equals(num2)); // false
        System.out.println("num1.equals(num3): " + num1.equals(num3)); // true

        // .compareTo() returns:
        // a negative value if num1 < num2
        // 0 if num1 == num2
        // a positive value if num1 > num2
        System.out.println("num1.compareTo(num2): " + num1.compareTo(num2)); // negative
        System.out.println("num2.compareTo(num1): " + num2.compareTo(num1)); // positive
        System.out.println("num1.compareTo(num3): " + num1.compareTo(num3)); // 0

        // --- 4. Utility Methods ---
        System.out.println("\n=== Utility Methods ===");
        
        // Finding max/min/sum
        System.out.println("Max of 50, 75: " + Integer.max(50, 75));
        System.out.println("Min of 50, 75: " + Integer.min(50, 75));
        System.out.println("Sum of 25, 35: " + Integer.sum(25, 35));

        // Character utilities
        char ch1 = 'A';
        char ch2 = '5';
        char ch3 = ' ';
        System.out.println("Is 'A' a letter? " + Character.isLetter(ch1));
        System.out.println("Is '5' a digit? " + Character.isDigit(ch2));
        System.out.println("Is ' ' whitespace? " + Character.isWhitespace(ch3));
    }
}
