package Chapter8_Arrays;

// Chapter 8: Arrays
// Topic: Searching and Sorting - Linear Search

public class LinearSearchDemo {

    // The linearSearch method takes an integer array and a target value to find.
    // It returns the index of the target if found, otherwise it returns -1.
    public static int linearSearch(int[] arr, int target) {
        // Loop through each element of the array from the beginning to the end.
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element is equal to the target value.
            if (arr[i] == target) {
                // If found, return the current index 'i'.
                return i;
            }
        }
        // If the loop finishes without finding the target, it means the element is not in the array.
        // Return -1 to indicate that the element was not found.
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {45, 23, 67, 89, 12, 56, 78};
        
        // --- Test Case 1: Element is present ---
        int target1 = 12;
        int index1 = linearSearch(numbers, target1);

        if (index1 != -1) {
            System.out.println("Element " + target1 + " was found at index: " + index1);
        } else {
            System.out.println("Element " + target1 + " was not found in the array.");
        }

        // --- Test Case 2: Element is not present ---
        int target2 = 99;
        int index2 = linearSearch(numbers, target2);

        if (index2 != -1) {
            System.out.println("Element " + target2 + " was found at index: " + index2);
        } else {
            System.out.println("Element " + target2 + " was not found in the array.");
        }
    }
}
