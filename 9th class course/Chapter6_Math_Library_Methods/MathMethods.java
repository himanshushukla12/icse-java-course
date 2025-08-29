package Chapter6_Math_Library_Methods;

// This class demonstrates some of the most useful methods from Java's built-in Math class.
// The Math class is part of the java.lang package, which is automatically available.
public class MathMethods {
    public static void main(String[] args) {
        double number1 = 81;
        double number2 = 4.3;
        int a = 10;
        int b = -15;

        System.out.println("--- Math Class Methods ---");

        // 1. Math.sqrt(x): Calculates the square root of a number.
        System.out.println("The square root of " + number1 + " is: " + Math.sqrt(number1));

        // 2. Math.pow(a, b): Calculates 'a' raised to the power of 'b'.
        System.out.println("3 to the power of 4 is: " + Math.pow(3, 4));

        // 3. Math.abs(x): Returns the absolute (positive) value of a number.
        System.out.println("The absolute value of " + b + " is: " + Math.abs(b));

        // 4. Math.max(a, b): Returns the larger of two numbers.
        System.out.println("The maximum of " + a + " and " + b + " is: " + Math.max(a, b));

        // 5. Math.min(a, b): Returns the smaller of two numbers.
        System.out.println("The minimum of " + a + " and " + b + " is: " + Math.min(a, b));

        // 6. Math.round(x): Rounds a decimal number to the nearest whole number.
        System.out.println(number2 + " rounded is: " + Math.round(number2)); // Rounds to 4

        // 7. Math.ceil(x): "Ceiling" - always rounds UP to the nearest whole number.
        System.out.println(number2 + " rounded UP (ceil) is: " + Math.ceil(number2)); // Rounds to 5.0

        // 8. Math.floor(x): "Floor" - always rounds DOWN to the nearest whole number.
        System.out.println(number2 + " rounded DOWN (floor) is: " + Math.floor(number2)); // Rounds to 4.0

        // 9. Math.random(): Returns a random double between 0.0 (inclusive) and 1.0 (exclusive).
        System.out.println("\nA random number between 0.0 and 1.0: " + Math.random());

        // To get a random whole number within a range (e.g., 1 to 10):
        int randomInt = (int)(Math.random() * 10) + 1;
        System.out.println("A random number between 1 and 10: " + randomInt);
    }
}
