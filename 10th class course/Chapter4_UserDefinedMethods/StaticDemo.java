package Chapter4_UserDefinedMethods;

// Chapter 4: User-defined Methods
// Topic: Static and Non-static Methods

class MathUtils {
    // --- STATIC MEMBERS ---
    // Static members belong to the class itself, not to any specific object.

    // Static variable: Shared by all objects of the class.
    static String className = "MathUtils";

    // Static method: Can be called directly on the class (e.g., MathUtils.calculateCircleArea()).
    // It cannot use non-static (instance) variables.
    static double calculateCircleArea(double radius) {
        // A static method can only access other static members directly.
        return 3.14159 * radius * radius;
    }

    static int findMax(int a, int b) {
        return (a > b) ? a : b;
    }

    static void showClassInfo() {
        System.out.println("This is a utility class named: " + className);
        // System.out.println(instanceName); // This would cause an error because a static method cannot access a non-static variable.
    }


    // --- NON-STATIC (INSTANCE) MEMBERS ---
    // Non-static members belong to a specific object (instance) of the class.

    // Non-static variable: Each object gets its own copy.
    String instanceName;

    // Non-static method: Must be called on an object (e.g., utils1.setInstanceName()).
    // It can access both static and non-static members.
    void setInstanceName(String name) {
        this.instanceName = name;
    }

    void showInstanceInfo() {
        System.out.println("This instance is named: " + instanceName);
        System.out.println("It belongs to the class: " + className); // Non-static methods can access static variables.
    }

    double calculateRectangleArea(double length, double width) {
        return length * width;
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        // --- CALLING STATIC METHODS ---
        // You don't need to create an object. You call them using the class name.
        System.out.println("=== Static Methods Demo ===");
        double circleArea = MathUtils.calculateCircleArea(5.0);
        System.out.println("Area of a circle with radius 5: " + circleArea);

        int maxValue = MathUtils.findMax(45, 78);
        System.out.println("Maximum of 45 and 78: " + maxValue);

        MathUtils.showClassInfo();


        // --- CALLING NON-STATIC METHODS ---
        // You MUST create an object first.
        System.out.println("\n=== Non-static Methods Demo ===");
        MathUtils utils1 = new MathUtils();
        MathUtils utils2 = new MathUtils();

        // Call non-static methods on the objects.
        utils1.setInstanceName("Calculator-1");
        utils2.setInstanceName("Calculator-2");

        utils1.showInstanceInfo();
        utils2.showInstanceInfo();

        double rectArea = utils1.calculateRectangleArea(10, 15);
        System.out.println("Area of a 10x15 rectangle: " + rectArea);
    }
}
