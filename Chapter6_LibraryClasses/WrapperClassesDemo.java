package Chapter6_LibraryClasses;

// Chapter 6: Library Classes
// Topic: Introduction to Wrapper Classes

// Wrapper classes "wrap" primitive data types into objects.
// This is useful because many Java structures (like collections) work with objects.
public class WrapperClassesDemo {
    public static void main(String[] args) {
        // --- Primitive vs. Wrapper Class ---
        System.out.println("=== Primitive vs. Wrapper Classes ===");
        
        // Primitives
        int primitiveInt = 42;
        double primitiveDouble = 3.14;
        
        // Corresponding Wrapper Objects
        // The old way: new Integer(42). The modern way: Integer.valueOf(42).
        Integer wrapperInt = Integer.valueOf(42);
        Double wrapperDouble = Double.valueOf(3.14);

        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapper Integer object: " + wrapperInt);
        
        // A key difference: wrapper objects can be 'null', primitives cannot.
        Integer nullableInt = null;
        System.out.println("A wrapper object can be null: " + nullableInt);
        // int primitiveNullable = null; // This would cause a compile-time error.

        // --- Useful Methods in Wrapper Classes ---
        System.out.println("\n=== Wrapper Class Utility Methods ===");

        // Integer wrapper methods
        Integer num = 255;
        System.out.println("Original number: " + num);
        System.out.println("Binary string: " + Integer.toBinaryString(num));
        System.out.println("Hexadecimal string: " + Integer.toHexString(num));
        System.out.println("Max possible int value: " + Integer.MAX_VALUE);
        System.out.println("Min possible int value: " + Integer.MIN_VALUE);

        // Double wrapper methods
        Double decimal = 123.456;
        System.out.println("\nOriginal decimal: " + decimal);
        System.out.println("Is it Not-a-Number (NaN)? " + Double.isNaN(decimal));
        System.out.println("Is it infinite? " + Double.isInfinite(decimal));
        
        // Character wrapper methods
        Character letter = 'g';
        System.out.println("\nOriginal character: '" + letter + "'");
        System.out.println("Is it a letter? " + Character.isLetter(letter));
        System.out.println("Is it a digit? " + Character.isDigit(letter));
        System.out.println("Is it uppercase? " + Character.isUpperCase(letter));
        System.out.println("Convert to uppercase: " + Character.toUpperCase(letter));

        // Boolean wrapper methods
        Boolean flag = true;
        System.out.println("\nOriginal boolean: " + flag);
        // Convert a string to a boolean
        System.out.println("Parsing 'false' string: " + Boolean.parseBoolean("false"));
        System.out.println("Parsing 'True' string: " + Boolean.parseBoolean("True")); // Case-insensitive
    }
}
