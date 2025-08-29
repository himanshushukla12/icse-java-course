package Chapter3_Values_And_DataTypes;

// This class demonstrates how Java converts data from one type to another.
public class TypeConversion {
    public static void main(String[] args) {
        // --- 1. Implicit Conversion (Widening Casting) ---
        // This happens automatically when converting a smaller data type to a larger one.
        // No data is lost.
        System.out.println("--- Implicit Conversion (Widening) ---");
        
        int myInt = 9;
        // Java automatically converts the int 'myInt' to a double.
        double myDouble = myInt; 

        System.out.println("Original int: " + myInt);
        System.out.println("Converted double: " + myDouble);

        // --- 2. Explicit Conversion (Narrowing Casting) ---
        // This must be done manually by the programmer.
        // It's used to convert a larger data type to a smaller one.
        // There is a risk of losing data.
        System.out.println("\n--- Explicit Conversion (Narrowing) ---");

        double anotherDouble = 9.78;
        // We must "cast" the double to an int by putting (int) in front.
        // The decimal part (0.78) is lost.
        int anotherInt = (int) anotherDouble;

        System.out.println("Original double: " + anotherDouble);
        System.out.println("Converted int: " + anotherInt);

        // Another example: converting a large number
        int bigInt = 257;
        // A byte can only hold values up to 127.
        // The conversion will result in data loss and an unexpected value.
        byte myByte = (byte) bigInt;
        System.out.println("\nOriginal int: " + bigInt);
        System.out.println("Converted byte (with data loss): " + myByte);
    }
}
