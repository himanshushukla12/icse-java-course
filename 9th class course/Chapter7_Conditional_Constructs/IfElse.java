package Chapter7_Conditional_Constructs;

import java.util.Scanner;

// This class demonstrates the if-else and if-else-if statements.
public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- 1. Simple if-else statement ---
        System.out.println("--- Age Check ---");
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // The 'if' statement checks a condition.
        if (age >= 18) {
            // This block runs if the condition (age >= 18) is true.
            System.out.println("You are eligible to vote.");
        } else {
            // This block runs if the condition is false.
            System.out.println("You are not eligible to vote yet.");
        }

        // --- 2. if-else-if ladder ---
        // This is used to check multiple conditions in sequence.
        System.out.println("\n--- Grade Calculator ---");
        System.out.print("Enter your score (0-100): ");
        int score = scanner.nextInt();

        if (score >= 90) {
            // This runs if score is 90 or more.
            System.out.println("Grade: A");
        } else if (score >= 80) {
            // This runs if the first condition was false, but this one is true.
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            // This runs if none of the above conditions were true.
            System.out.println("Grade: F");
        }
        
        scanner.close();
    }
}
