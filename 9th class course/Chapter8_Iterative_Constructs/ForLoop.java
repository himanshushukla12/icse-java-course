package Chapter8_Iterative_Constructs;

// This class demonstrates the 'for' loop.
// A 'for' loop is used when you know exactly how many times you want to repeat a block of code.
public class ForLoop {
    public static void main(String[] args) {
        // The 'for' loop has three parts inside the parentheses, separated by semicolons:
        // 1. Initialization: `int i = 1` - A counter variable is declared and initialized. This runs only once.
        // 2. Condition: `i <= 10` - The loop continues as long as this condition is true.
        // 3. Iteration: `i++` - The counter variable is updated after each loop iteration.

        System.out.println("--- Counting from 1 to 10 ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("\n--- Multiplication Table of 5 ---");
        int number = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        System.out.println("\n--- Counting Downwards ---");
        for (int i = 10; i >= 1; i--) {
            System.out.println("i = " + i);
        }
    }
}
