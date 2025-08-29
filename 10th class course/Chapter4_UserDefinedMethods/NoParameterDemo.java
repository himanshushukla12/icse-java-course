package Chapter4_UserDefinedMethods;

// Chapter 4: User-defined Methods
// Topic: Defining a Method - No Parameters

// This class demonstrates methods that do not take any parameters.
class Calculator {
    // This method prints a welcome message. It doesn't need any input to do its job.
    void welcomeMessage() {
        System.out.println("Welcome to Calculator!");
        System.out.println("Ready to perform calculations.");
    }

    // This method shows the current system time. It gets the time from the system itself.
    void showCurrentTime() {
        // java.util.Date is a built-in Java class to get date and time.
        java.util.Date date = new java.util.Date();
        System.out.println("Current time: " + date);
    }
}

public class NoParameterDemo {
    public static void main(String[] args) {
        // Create an object of the Calculator class to use its methods.
        Calculator calc = new Calculator();

        // Call the methods. Notice no arguments are passed in the parentheses.
        calc.welcomeMessage();
        calc.showCurrentTime();
    }
}
