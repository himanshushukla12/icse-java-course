package Chapter4_Operators;

// This class demonstrates relational and logical operators.
public class RelationalLogicalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 10;

        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("---------------------------------");

        // --- Relational Operators ---
        // These operators compare two values and return a boolean (true or false).
        System.out.println("--- Relational Operators ---");
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b));  // Greater than
        System.out.println("a < b: " + (a < b));  // Less than
        System.out.println("a >= c: " + (a >= c)); // Greater than or equal to
        System.out.println("a <= c: " + (a <= c)); // Less than or equal to

        // --- Logical Operators ---
        // These operators combine multiple boolean expressions.
        System.out.println("\n--- Logical Operators ---");
        
        boolean condition1 = true;
        boolean condition2 = false;

        // 1. AND (&&): Returns true only if BOTH conditions are true.
        System.out.println("condition1 && condition2: " + (condition1 && condition2));
        System.out.println("(a < b) && (a == c): " + ((a < b) && (a == c))); // (true && true) is true

        // 2. OR (||): Returns true if AT LEAST ONE condition is true.
        System.out.println("condition1 || condition2: " + (condition1 || condition2));
        System.out.println("(a > b) || (a == c): " + ((a > b) || (a == c))); // (false || true) is true

        // 3. NOT (!): Reverses the boolean value.
        System.out.println("!condition1: " + (!condition1)); // !true is false
        System.out.println("!(a > b): " + !(a > b)); // !false is true
    }
}
