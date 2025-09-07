
public class TernaryOperatorDemo {
    public static void main(String[] args) {
        int marks = 85;
        String result;

        // Using if-else
        if (marks >= 40) {
            result = "Pass";
        } else {
            result = "Fail";
        }
        System.out.println("Result (using if-else): " + result);

        // Using ternary operator
        result = (marks >= 40) ? "Pass" : "Fail";
        System.out.println("Result (using ternary operator): " + result);

        // Another example
        int number = -5;
        String type = (number >= 0) ? "Positive" : "Negative";
        System.out.println("The number is: " + type);
    }
}
