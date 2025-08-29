package Chapter4_Operators;

// This class demonstrates the basic arithmetic operators in Java.
public class ArithmeticOperators {
    public static void main(String[] args) {
        // Declare two integer variables for our calculations.
        int a = 27;
        int b = 5;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("--------------------");

        // 1. Addition (+)
        int sum = a + b;
        System.out.println("Addition (a + b): " + sum);

        // 2. Subtraction (-)
        int difference = a - b;
        System.out.println("Subtraction (a - b): " + difference);

        // 3. Multiplication (*)
        int product = a * b;
        System.out.println("Multiplication (a * b): " + product);

        // 4. Division (/)
        // When dividing two integers, the result is also an integer (the decimal part is dropped).
        int integerDivision = a / b;
        System.out.println("Integer Division (a / b): " + integerDivision);

        // To get a precise decimal result, at least one of the numbers must be a double.
        double doubleA = 27.0;
        double doubleDivision = doubleA / b;
        System.out.println("Double Division (doubleA / b): " + doubleDivision);

        // 5. Modulus (%)
        // This operator gives the remainder of a division.
        int remainder = a % b;
        System.out.println("Modulus/Remainder (a % b): " + remainder);
    }
}
