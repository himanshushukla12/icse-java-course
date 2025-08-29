package Chapter8_Iterative_Constructs;

// This class demonstrates the 'break' and 'continue' jump statements inside loops.
public class JumpStatements {
    public static void main(String[] args) {
        // --- 1. The 'break' statement ---
        // 'break' is used to exit a loop immediately, regardless of the loop's condition.
        System.out.println("--- 'break' statement example ---");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Found 5, breaking the loop!");
                break; // The loop stops here.
            }
            System.out.println("i = " + i);
        }

        // --- 2. The 'continue' statement ---
        // 'continue' is used to skip the current iteration of the loop and move to the next one.
        System.out.println("\n--- 'continue' statement example (skipping even numbers) ---");
        for (int j = 1; j <= 10; j++) {
            // If the number is even...
            if (j % 2 == 0) {
                continue; // ...skip this iteration and go to the next value of j.
            }
            // This line will only be reached for odd numbers.
            System.out.println("j = " + j);
        }
    }
}
