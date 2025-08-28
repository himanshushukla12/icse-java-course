package Chapter8_Arrays;

// Chapter 8: Arrays
// Topic: Searching and Sorting - Bubble Sort

import java.util.Arrays;

public class BubbleSortDemo {

    // The bubbleSort method sorts an integer array in ascending order.
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Outer loop for passes. The algorithm needs n-1 passes.
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // Inner loop for comparisons and swaps.
            // It "bubbles" the largest element to the end of the array in each pass.
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements.
                if (arr[j] > arr[j + 1]) {
                    // If the left element is greater than the right, swap them.
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // Mark that a swap happened in this pass.
                }
            }
            // OPTIMIZATION: If no swaps occurred in a pass, the array is already sorted.
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array: " + Arrays.toString(numbers));

        // Call the bubbleSort method to sort the array.
        bubbleSort(numbers);

        System.out.println("Sorted array:   " + Arrays.toString(numbers));
    }
}
