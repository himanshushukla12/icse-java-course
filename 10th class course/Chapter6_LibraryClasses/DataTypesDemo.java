package Chapter6_LibraryClasses;

// Chapter 6: Library Classes
// Topic: Revisiting Data Types in Java

public class DataTypesDemo {
    public static void main(String[] args) {
        // Primitive data types are the most basic data types in Java.
        // They are not objects and store simple values.

        // Integer types
        byte smallNumber = 127;         // 8-bit: -128 to 127
        short mediumNumber = 32000;     // 16-bit: -32,768 to 32,767
        int regularNumber = 2000000;    // 32-bit: -2.1 billion to 2.1 billion
        long bigNumber = 9000000000L;   // 64-bit: very large range (note the 'L' suffix)

        // Floating-point types (for decimal numbers)
        float floatNumber = 3.14f;       // 32-bit: less precise (note the 'f' suffix)
        double doubleNumber = 3.14159265359; // 64-bit: more precise, default for decimals

        // Other types
        char singleCharacter = 'A';     // 16-bit: stores a single character
        boolean isJavaFun = true;       // 1-bit: stores either true or false

        System.out.println("=== Primitive Data Types in Action ===");
        System.out.println("byte: " + smallNumber);
        System.out.println("short: " + mediumNumber);
        System.out.println("int: " + regularNumber);
        System.out.println("long: " + bigNumber);
        System.out.println("float: " + floatNumber);
        System.out.println("double: " + doubleNumber);
        System.out.println("char: " + singleCharacter);
        System.out.println("boolean: " + isJavaFun);

        // Each primitive type has a fixed size in memory.
        System.out.println("\n=== Memory Size of Primitive Types ===");
        System.out.println("byte uses: " + Byte.SIZE + " bits");
        System.out.println("short uses: " + Short.SIZE + " bits");
        System.out.println("int uses: " + Integer.SIZE + " bits");
        System.out.println("long uses: " + Long.SIZE + " bits");
        System.out.println("float uses: " + Float.SIZE + " bits");
        System.out.println("double uses: " + Double.SIZE + " bits");
        System.out.println("char uses: " + Character.SIZE + " bits");
        // boolean size is not precisely defined, but it represents 1 bit of information.
    }
}
