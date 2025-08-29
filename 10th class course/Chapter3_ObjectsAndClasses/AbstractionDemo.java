package Chapter3_ObjectsAndClasses;

// Chapter 3: Objects and Classes
// Topic: Abstraction

// Abstraction is the concept of hiding complex implementation details
// and showing only the essential features of the object.
// In Java, abstraction is achieved using abstract classes and interfaces.

// 1. ABSTRACT CLASS
// An abstract class cannot be instantiated (you can't create an object of Shape).
// It acts as a blueprint for other classes.
abstract class Shape {
    String color;

    // An abstract method has no body. It must be implemented by any subclass.
    // It defines a feature that is essential for a shape but is implemented differently.
    abstract void draw();

    // An abstract class can have concrete (non-abstract) methods.
    // This method is common to all shapes and can be used directly.
    public void displayColor() {
        System.out.println("Color: " + color);
    }
}

// 2. CONCRETE CLASSES
// These classes extend the abstract class and provide implementations for the abstract methods.

// The Rectangle class provides a specific implementation for the draw() method.
class Rectangle extends Shape {
    Rectangle(String color) {
        this.color = color;
    }

    @Override // Annotation to indicate we are overriding a parent method.
    void draw() {
        // This is the specific implementation for drawing a rectangle.
        System.out.println("Drawing a rectangle.");
    }
}

// The Circle class provides its own specific implementation for the draw() method.
class Circle extends Shape {
    Circle(String color) {
        this.color = color;
    }

    @Override
    void draw() {
        // This is the specific implementation for drawing a circle.
        System.out.println("Drawing a circle.");
    }
}


public class AbstractionDemo {
    public static void main(String[] args) {
        // You cannot create an object of the abstract class Shape.
        // Shape myShape = new Shape(); // This would cause a compile-time error.

        // We create objects of the concrete classes.
        Shape shape1 = new Rectangle("Red");
        Shape shape2 = new Circle("Blue");

        // We are using the 'Shape' reference to interact with the objects.
        // We don't need to know the specific details of how a rectangle or circle is drawn.
        // We just call the draw() method, and the correct implementation is executed.
        // This is abstraction in action.
        
        System.out.println("--- Rectangle ---");
        shape1.draw(); // Calls the draw() method from the Rectangle class.
        shape1.displayColor(); // Calls the concrete method from the Shape class.

        System.out.println("\n--- Circle ---");
        shape2.draw(); // Calls the draw() method from the Circle class.
        shape2.displayColor(); // Calls the concrete method from the Shape class.
    }
}
