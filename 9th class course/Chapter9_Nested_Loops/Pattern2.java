package Chapter9_Nested_Loops;

// This class uses a nested loop to print a pattern of numbers.
public class Pattern2 {
    public static void main(String[] args) {
        int rows = 5;

        System.out.println("--- Number Triangle Pattern ---");

        // Outer loop for rows.
        for (int i = 1; i <= rows; i++) {
            // Inner loop for columns.
            // It prints numbers from 1 up to the current row number 'i'.
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to the next line.
            System.out.println();
        }
    }
}
