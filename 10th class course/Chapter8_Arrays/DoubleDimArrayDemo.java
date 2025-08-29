package Chapter8_Arrays;

// Chapter 8: Arrays
// Topic: Double Dimensional Arrays (2D Arrays)

public class DoubleDimArrayDemo {
    public static void main(String[] args) {
        // A 2D array is an array of arrays. It's like a grid or a table with rows and columns.

        // --- REGULAR 2D ARRAY ---
        // Declaration and initialization of a 3x3 matrix.
        int[][] matrix = {
            {1, 2, 3},  // Row 0
            {4, 5, 6},  // Row 1
            {7, 8, 9}   // Row 2
        };

        System.out.println("=== 2D Array (Matrix) ===");
        // To iterate through a 2D array, you need nested loops.
        // The outer loop iterates through the rows.
        for (int i = 0; i < matrix.length; i++) {
            // The inner loop iterates through the columns of the current row.
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t"); // Use print and a tab for formatting.
            }
            System.out.println(); // Move to the next line after each row.
        }

        // Accessing a specific element: matrix[row][column]
        System.out.println("\nElement at row 1, column 2 is: " + matrix[1][2]); // Should be 6

        // Modifying an element.
        matrix[0][0] = 99;
        System.out.println("Modified element at row 0, column 0 is now: " + matrix[0][0]);


        // --- JAGGED ARRAY ---
        // A jagged array is a 2D array where each row can have a different number of columns.
        int[][] jaggedArray = {
            {1, 2},
            {3, 4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("\n=== Jagged 2D Array ===");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
