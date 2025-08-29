package Chapter4_UserDefinedMethods;

// Chapter 4: User-defined Methods
// Topic: Types of Parameters

// This class demonstrates methods that accept parameters.
class MathOperations {
    // This method takes two integer parameters, 'a' and 'b'.
    // Parameters are like inputs that the method needs to work.
    void addNumbers(int a, int b) {
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
    }

    // This method takes three integer parameters to find the largest.
    void findLargest(int x, int y, int z) {
        int largest = x;
        if (y > largest) {
            largest = y;
        }
        if (z > largest) {
            largest = z;
        }
        System.out.println("Among " + x + ", " + y + ", " + z);
        System.out.println("Largest number is: " + largest);
    }

    // This method takes parameters of different data types: two doubles and a String.
    void calculateArea(double length, double width, String shape) {
        double area = length * width;
        System.out.println("Area of " + shape + ": " + area + " square units");
    }
}

public class ParameterDemo {
    public static void main(String[] args) {
        // Create an object of MathOperations.
        MathOperations math = new MathOperations();

        // Call the methods and pass arguments (the actual values for the parameters).
        // The values 15 and 25 are passed to the 'a' and 'b' parameters of addNumbers.
        math.addNumbers(15, 25);

        // Pass 45, 78, and 23 to the findLargest method.
        math.findLargest(45, 78, 23);

        // Pass two double values and a string to the calculateArea method.
        math.calculateArea(12.5, 8.0, "Rectangle");
    }
}
