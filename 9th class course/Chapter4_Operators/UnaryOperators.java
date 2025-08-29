package Chapter4_Operators;

// This class demonstrates unary operators, which work on a single operand.
public class UnaryOperators {
    public static void main(String[] args) {
        int number = 10;
        System.out.println("Original number: " + number);
        System.out.println("--------------------");

        // --- 1. Unary Plus (+) and Minus (-) ---
        // These indicate the sign of a number.
        int positiveNumber = +number;
        int negativeNumber = -number;
        System.out.println("Unary Plus (+number): " + positiveNumber);
        System.out.println("Unary Minus (-number): " + negativeNumber);

        // --- 2. Increment (++) and Decrement (--) Operators ---
        // These increase or decrease a value by 1.

        // a) Post-increment (number++): The value is used first, then incremented.
        System.out.println("\n--- Post-increment (number++) ---");
        System.out.println("Value used in statement: " + (number++)); // Prints 10
        System.out.println("Value after statement: " + number);      // Now number is 11

        // b) Pre-increment (++number): The value is incremented first, then used.
        number = 10; // Reset number
        System.out.println("\n--- Pre-increment (++number) ---");
        System.out.println("Value used in statement: " + (++number)); // Prints 11
        System.out.println("Value after statement: " + number);      // number is 11

        // c) Post-decrement (number--): The value is used first, then decremented.
        number = 10; // Reset number
        System.out.println("\n--- Post-decrement (number--) ---");
        System.out.println("Value used in statement: " + (number--)); // Prints 10
        System.out.println("Value after statement: " + number);      // Now number is 9

        // d) Pre-decrement (--number): The value is decremented first, then used.
        number = 10; // Reset number
        System.out.println("\n--- Pre-decrement (--number) ---");
        System.out.println("Value used in statement: " + (--number)); // Prints 9
        System.out.println("Value after statement: " + number);      // number is 9
    }
}
