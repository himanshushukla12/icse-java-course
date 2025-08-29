package Chapter9_Nested_Loops;

// This class uses a nested loop to print a simple right-angled triangle pattern.
public class Pattern1 {
    public static void main(String[] args) {
        int rows = 5; // Define the number of rows for the triangle.

        System.out.println("--- Right-Angled Triangle Pattern ---");

        // The outer loop iterates through each row.
        for (int i = 1; i <= rows; i++) {
            // The inner loop prints the stars for the current row.
            // The number of stars to print is equal to the current row number 'i'.
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after printing all stars for the current row.
            System.out.println();
        }
    }
}
