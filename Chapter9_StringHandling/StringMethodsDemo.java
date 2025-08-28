package Chapter9_StringHandling;

// Chapter 9: String Handling
// Topic: String Class Methods

public class StringMethodsDemo {
    public static void main(String[] args) {
        String text = "  Hello, World! This is Java.  ";

        System.out.println("Original String: '" + text + "'");
        System.out.println("------------------------------------");

        // 1. length(): Returns the number of characters in the string.
        System.out.println("1. Length: " + text.length());

        // 2. charAt(index): Returns the character at a specific index.
        System.out.println("2. Character at index 8: " + text.charAt(8)); // 'W'

        // 3. substring(beginIndex, endIndex): Extracts a part of the string.
        System.out.println("3. Substring from index 7 to 12: " + text.substring(7, 12)); // "World"

        // 4. toUpperCase() / toLowerCase(): Changes the case of the string.
        System.out.println("4. Uppercase: " + text.toUpperCase());
        System.out.println("5. Lowercase: " + text.toLowerCase());

        // 6. indexOf(char) / lastIndexOf(char): Finds the index of a character.
        System.out.println("6. First index of 'o': " + text.indexOf('o')); // 6
        System.out.println("7. Last index of 'o': " + text.lastIndexOf('o')); // 10

        // 8. equals() / equalsIgnoreCase(): Compares two strings.
        String anotherText = "  hello, world! this is java.  ";
        System.out.println("8. equals('...'): " + text.equals(anotherText)); // false (case-sensitive)
        System.out.println("9. equalsIgnoreCase('...'): " + text.equalsIgnoreCase(anotherText)); // true

        // 10. startsWith(prefix) / endsWith(suffix): Checks the beginning or end of a string.
        System.out.println("10. startsWith('  Hello'): " + text.startsWith("  Hello")); // true
        System.out.println("11. endsWith('Java.  '): " + text.endsWith("Java.  ")); // true

        // 12. replace(oldChar, newChar): Replaces characters or substrings.
        System.out.println("12. replace 'Java' with 'Python': " + text.replace("Java", "Python"));

        // 13. trim(): Removes leading and trailing whitespace.
        System.out.println("13. trim(): '" + text.trim() + "'");

        // 14. split(delimiter): Splits the string into an array of substrings.
        String sentence = "This-is-a-sample-sentence";
        String[] words = sentence.split("-");
        System.out.println("14. split() by '-': ");
        for (String word : words) {
            System.out.println("   - " + word);
        }

        // 15. contains(sequence): Checks if the string contains a sequence of characters.
        System.out.println("15. contains('World'): " + text.contains("World")); // true

        // 16. isEmpty(): Checks if the string has a length of 0.
        String emptyStr = "";
        System.out.println("16. isEmpty() on an empty string: " + emptyStr.isEmpty()); // true
        System.out.println("17. isEmpty() on a non-empty string: " + text.isEmpty()); // false
    }
}
