package Chapter9_Nested_Loops;

// This class demonstrates a basic nested loop.
// A nested loop is a loop inside another loop.
public class NestedForLoop {
    public static void main(String[] args) {
        // The outer loop controls the rows.
        for (int i = 1; i <= 3; i++) {
            // The inner loop controls the columns.
            for (int j = 1; j <= 5; j++) {
                // The inner loop completes all its iterations for each single iteration of the outer loop.
                System.out.print(" (" + i + "," + j + ") ");
            }
            // This println is executed after the inner loop finishes, moving the cursor to the next line.
            System.out.println();
        }
    }
}
