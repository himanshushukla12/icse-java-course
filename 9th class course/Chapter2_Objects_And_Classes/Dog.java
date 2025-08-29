package Chapter2_Objects_And_Classes;

// This is the blueprint for creating 'Dog' objects.
// A class defines the properties (state) and actions (behavior) that all objects of this type will have.
public class Dog {
    // --- STATE (Instance Variables) ---
    // These variables store the data for each individual Dog object.
    String breed;
    int age;
    String color;

    // --- BEHAVIOR (Methods) ---
    // These methods define the actions that a Dog object can perform.

    // A method to make the dog bark.
    void bark() {
        System.out.println(breed + " is barking!");
    }

    // A method to make the dog sleep.
    void sleep() {
        System.out.println(color + " " + breed + " is sleeping.");
    }

    // A method to display all information about the dog.
    void displayInfo() {
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age + " years");
        System.out.println("Color: " + color);
    }
}
