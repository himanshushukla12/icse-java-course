package Chapter8_Arrays;

// Chapter 8: Arrays
// Topic: Single and Double Dimensional Arrays

public class SingleDimArrayDemo {
    public static void main(String[] args) {
        // --- SINGLE-DIMENSIONAL ARRAYS ---

        // Method 1: Declare and then initialize an array.
        // This creates an integer array that can hold 5 elements.
        int[] numbers = new int[5];

        // Assign values to the array elements using their index.
        // Array indices start at 0.
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        // numbers[5] = 60; // This would cause an ArrayIndexOutOfBoundsException.

        System.out.println("=== Array initialized with size ===");
        // The 'length' property gives the size of the array.
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Method 2: Declare and initialize with values at the same time.
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};

        System.out.println("\n=== Array initialized with values ===");
        // Using an enhanced for loop (or for-each loop) to iterate through the array.
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // Accessing a specific element.
        System.out.println("\nThe first fruit is: " + fruits[0]);

        // Modifying an element.
        System.out.println("Changing 'Banana' to 'Blueberry'...");
        fruits[1] = "Blueberry";
        System.out.println("The second fruit is now: " + fruits[1]);
    }
}
