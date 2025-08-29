package Chapter4_UserDefinedMethods;

// Chapter 4: User-defined Methods
// Topic: Method Overloading (Polymorphism)

// Method overloading is a feature that allows a class to have more than one method
// with the same name, as long as their parameter lists are different.
class Calculator {

    // --- Overloaded 'add' methods ---

    // Method 1: Adds two integers.
    int add(int a, int b) {
        System.out.println("Called add(int, int)");
        return a + b;
    }

    // Method 2: Adds three integers. (Different number of parameters)
    int add(int a, int b, int c) {
        System.out.println("Called add(int, int, int)");
        return a + b + c;
    }

    // Method 3: Adds two doubles. (Different data types of parameters)
    double add(double a, double b) {
        System.out.println("Called add(double, double)");
        return a + b;
    }

    // Method 4: Concatenates two strings. (Different data types)
    String add(String a, String b) {
        System.out.println("Called add(String, String)");
        return a + b;
    }

    // --- Overloaded 'area' methods ---

    // Calculates the area of a circle.
    double area(double radius) {
        System.out.println("Calculating circle area");
        return 3.14159 * radius * radius;
    }

    // Calculates the area of a rectangle.
    double area(double length, double width) {
        System.out.println("Calculating rectangle area");
        return length * width;
    }

    // Calculates the area of a triangle.
    // The third parameter (String) is used to differentiate it from the rectangle area method.
    double area(double base, double height, String shape) {
        if (shape.equalsIgnoreCase("triangle")) {
            System.out.println("Calculating triangle area");
            return 0.5 * base * height;
        }
        return 0;
    }
}

public class OverloadingDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("=== Method Overloading Examples ===");

        // Java decides which 'add' method to call based on the arguments provided.
        System.out.println("Result: " + calc.add(10, 20));
        System.out.println("Result: " + calc.add(10, 20, 30));
        System.out.println("Result: " + calc.add(10.5, 20.3));
        System.out.println("Result: " + calc.add("Hello, ", "World!"));

        System.out.println("\n=== Area Calculation Examples ===");

        // Calling the overloaded 'area' methods.
        System.out.println("Circle area: " + calc.area(5.0));
        System.out.println("Rectangle area: " + calc.area(10.0, 15.0));
        System.out.println("Triangle area: " + calc.area(8.0, 6.0, "triangle"));
    }
}
