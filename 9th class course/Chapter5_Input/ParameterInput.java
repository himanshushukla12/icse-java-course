package Chapter5_Input;

// This class demonstrates how to pass input to methods using parameters.
public class ParameterInput {

    // This is a method that takes two integers as parameters (inputs).
    // 'a' and 'b' are local variables that hold the values passed to the method.
    public static void addNumbers(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }

    // This method takes a String parameter.
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "! Welcome.");
    }

    public static void main(String[] args) {
        // --- Calling the methods and passing arguments ---
        // The values 10 and 20 are called "arguments".
        // They are passed to the 'a' and 'b' parameters of the addNumbers method.
        addNumbers(10, 20);

        // Call the method again with different arguments.
        addNumbers(150, 75);

        // Call the greetUser method with a String argument.
        greetUser("Alice");
        greetUser("Bob");
    }
}
