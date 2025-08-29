package Chapter3_Values_And_DataTypes;

// This class demonstrates the 8 primitive data types in Java.
public class DataTypes {
    public static void main(String[] args) {
        // Primitive data types are the most basic building blocks for data.

        // 1. byte: for very small whole numbers (-128 to 127)
        byte myByte = 100;
        System.out.println("byte: " + myByte);

        // 2. short: for small whole numbers (-32,768 to 32,767)
        short myShort = 5000;
        System.out.println("short: " + myShort);

        // 3. int: the most common type for whole numbers
        int myInt = 100000;
        System.out.println("int: " + myInt);

        // 4. long: for very large whole numbers (requires 'L' at the end)
        long myLong = 15000000000L;
        System.out.println("long: " + myLong);

        // 5. float: for decimal numbers (requires 'f' at the end)
        float myFloat = 5.75f;
        System.out.println("float: " + myFloat);

        // 6. double: the most common type for decimal numbers (more precise than float)
        double myDouble = 19.99;
        System.out.println("double: " + myDouble);

        // 7. char: for a single character (must be in single quotes)
        char myChar = 'A';
        System.out.println("char: " + myChar);

        // 8. boolean: for true or false values
        boolean isJavaFun = true;
        System.out.println("boolean: " + isJavaFun);
    }
}
