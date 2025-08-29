package Chapter8_Iterative_Constructs;

import java.util.Scanner;

// This class demonstrates the 'while' loop.
// A 'while' loop is used when you don't know the exact number of iterations,
// and the loop should continue as long as a certain condition is true.
public class WhileLoop {
    public static void main(String[] args) {
        // --- Example 1: Simple Counter ---
        System.out.println("--- Counting from 1 to 5 ---");
        int i = 1; // 1. Initialize the counter

        while (i <= 5) { // 2. Set the condition
            System.out.println("i = " + i);
            i++; // 3. Update the counter (IMPORTANT: to avoid an infinite loop)
        }

        // --- Example 2: User Input Validation ---
        // A 'while' loop is perfect for asking the user for input until they provide a valid one.
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        // The loop will continue as long as the number is not between 1 and 10.
        while (number < 1 || number > 10) {
            System.out.print("\nEnter a number between 1 and 10: ");
            number = scanner.nextInt();
        }

        System.out.println("Thank you! You entered a valid number: " + number);
        
        scanner.close();
    }
}
