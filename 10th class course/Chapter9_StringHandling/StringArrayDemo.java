package Chapter9_StringHandling;

// Chapter 9: String Handling
// Topic: String Arrays

public class StringArrayDemo {
    public static void main(String[] args) {
        // A String array is an array that holds multiple String objects.
        String[] studentNames = {"Alice", "Bob", "Charlie", "David", "Eve"};

        System.out.println("=== List of Students ===");
        // Looping through the array to print each name.
        for (String name : studentNames) {
            System.out.println("- " + name);
        }

        // --- Common Operations on String Arrays ---

        // 1. Finding the longest name in the array.
        String longestName = ""; // Start with an empty string.
        for (String name : studentNames) {
            // If the current name's length is greater than the longest found so far...
            if (name.length() > longestName.length()) {
                longestName = name; // ...update the longestName.
            }
        }
        System.out.println("\nThe longest name is: " + longestName);

        // 2. Counting names that meet a certain condition (e.g., start with 'C').
        int count = 0;
        for (String name : studentNames) {
            if (name.startsWith("C")) {
                count++;
            }
        }
        System.out.println("Number of names starting with 'C': " + count);

        // 3. Creating a single string by joining array elements.
        // The String.join() method is perfect for this.
        String sentence = String.join(", ", studentNames);
        System.out.println("\nJoined sentence: " + sentence);
        
        String fileList = String.join(";", "file1.txt", "file2.txt", "file3.txt");
        System.out.println("File list: " + fileList);
    }
}
