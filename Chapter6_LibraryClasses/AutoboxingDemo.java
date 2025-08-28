package Chapter6_LibraryClasses;

// Chapter 6: Library Classes
// Topic: Autoboxing and Unboxing

import java.util.ArrayList;
import java.util.List;

public class AutoboxingDemo {
    public static void main(String[] args) {
        // --- AUTOBOXING ---
        // Autoboxing is the automatic conversion that the Java compiler makes
        // from a primitive type to its corresponding wrapper class.
        System.out.println("=== Autoboxing (Primitive -> Wrapper) ===");
        
        // The compiler automatically converts the 'int' 100 to an 'Integer' object.
        Integer autoBoxedInt = 100; 
        // This is equivalent to: Integer autoBoxedInt = Integer.valueOf(100);
        
        Double autoBoxedDouble = 25.5; // double -> Double
        Boolean autoBoxedBoolean = true; // boolean -> Boolean

        System.out.println("Autoboxed Integer: " + autoBoxedInt);
        System.out.println("Autoboxed Double: " + autoBoxedDouble);
        System.out.println("Autoboxed Boolean: " + autoBoxedBoolean);

        // --- UNBOXING ---
        // Unboxing is the reverse: converting an object of a wrapper type to its primitive value.
        System.out.println("\n=== Unboxing (Wrapper -> Primitive) ===");

        Integer wrapperNum = Integer.valueOf(200);
        // The compiler automatically extracts the int value from the Integer object.
        int primitiveNum = wrapperNum; 
        // This is equivalent to: int primitiveNum = wrapperNum.intValue();

        System.out.println("Unboxed int: " + primitiveNum);

        // --- AUTOBOXING IN COLLECTIONS ---
        // This is a very common use case. Collections like ArrayList can only store objects.
        System.out.println("\n=== Autoboxing with Collections ===");
        
        List<Integer> numberList = new ArrayList<>();
        
        // Autoboxing happens automatically when adding primitives to the list.
        numberList.add(10); // int 10 is autoboxed to Integer(10)
        numberList.add(20); // int 20 is autoboxed to Integer(20)
        
        System.out.println("ArrayList contents: " + numberList);
        
        // Unboxing happens automatically when retrieving and assigning to a primitive.
        int firstNumber = numberList.get(0); // Integer(10) is unboxed to int 10
        System.out.println("First number (unboxed): " + firstNumber);

        // --- AUTOBOXING IN EXPRESSIONS ---
        System.out.println("\n=== Autoboxing in Expressions ===");
        Integer a = 5;
        Integer b = 10;
        // For the addition to work, 'a' and 'b' are unboxed to ints,
        // the addition is performed, and the result is autoboxed back to an Integer.
        Integer sum = a + b; 
        System.out.println("Sum of two Integers: " + sum);
    }
}
