package Chapter8_Iterative_Constructs;

import java.util.Scanner;

// This class demonstrates the 'do-while' loop.
// A 'do-while' loop is similar to a 'while' loop, but it is guaranteed to execute at least once.
// The condition is checked at the end of the loop.
public class DoWhileLoop {
    public static void main(String[] args) {
        // --- Example 1: Simple Counter ---
        // This will behave just like a while loop.
        System.out.println("--- Counting from 1 to 5 ---");
        int i = 1;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i <= 5);

        // --- Example 2: Menu-driven program that repeats ---
        // A 'do-while' loop is excellent for menus where you want the menu to show at least once.
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Say Hello");
            System.out.println("2. Say Goodbye");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Hello, World!");
                    break;
                case 2:
                    System.out.println("Goodbye!");
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3); // The loop continues as long as the user does not choose to exit.

        scanner.close();
    }
}
