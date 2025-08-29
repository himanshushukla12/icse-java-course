package Chapter5_Input;

// To use the Scanner class, we must first import it from the java.util package.
import java.util.Scanner;

// This class demonstrates how to get input from the user.
public class ScannerInput {
    public static void main(String[] args) {
        // 1. Create a Scanner object.
        // 'System.in' tells the Scanner to read from the keyboard.
        Scanner scanner = new Scanner(System.in);

        // 2. Prompt the user for input.
        System.out.print("Please enter your name: ");

        // 3. Read the user's input.
        // The nextLine() method reads a full line of text.
        String name = scanner.nextLine();

        // Prompt for another input.
        System.out.print("Please enter your age: ");

        // The nextInt() method reads an integer.
        int age = scanner.nextInt();

        // Prompt for one more input.
        System.out.print("Please enter your average grade: ");

        // The nextDouble() method reads a double.
        double grade = scanner.nextDouble();

        // 4. Use the input in your program.
        System.out.println("\n--- User Information ---");
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your average grade is " + grade + ".");

        // 5. Close the scanner when you're done with it to free up resources.
        scanner.close();
    }
}
