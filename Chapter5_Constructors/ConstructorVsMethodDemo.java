package Chapter5_Constructors;

// Chapter 5: Constructors
// Topic: Comparison - Differences between Constructors and Methods

class Example {
    String name;
    int value;

    // --- CONSTRUCTOR ---
    // 1. Name is the same as the class name ('Example').
    // 2. No return type, not even 'void'.
    // 3. Called automatically when an object is created using 'new'.
    // 4. Main purpose is to initialize the object's state.
    Example(String n, int v) {
        System.out.println("CONSTRUCTOR: Initializing a new Example object.");
        this.name = n;
        this.value = v;
        // No 'return' statement here.
    }

    // --- METHOD ---
    // 1. Can have any valid name (e.g., 'setValues').
    // 2. Must have a return type ('void' if it returns nothing).
    // 3. Called explicitly on an object (e.g., obj.setValues(...)).
    // 4. Main purpose is to define the behavior or actions of an object.
    void setValues(String n, int v) {
        System.out.println("METHOD: Updating the state of an existing object.");
        this.name = n;
        this.value = v;
    }

    // Another method, this one returns a value.
    String getInfo() {
        return "Name: " + this.name + ", Value: " + this.value;
    }

    // A method can be called as many times as needed.
    void displayMessage() {
        System.out.println("This is a regular method call.");
    }
}

public class ConstructorVsMethodDemo {
    public static void main(String[] args) {
        // The constructor is called automatically right here.
        Example obj = new Example("Initial", 100);

        System.out.println("After creation: " + obj.getInfo());

        // Methods are called explicitly whenever needed.
        obj.displayMessage();
        obj.displayMessage();

        // We can call a method to change the object's state after it has been created.
        obj.setValues("Updated", 200);
        System.out.println("After method call: " + obj.getInfo());

        // You CANNOT call a constructor on an existing object.
        // The following line would cause a compile-time error.
        // obj.Example("Test", 300); // ERROR: Constructors can only be called with 'new'.
    }
}
