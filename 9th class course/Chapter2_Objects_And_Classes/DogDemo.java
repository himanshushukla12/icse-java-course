package Chapter2_Objects_And_Classes;

// This class is used to run the program and demonstrate the use of the 'Dog' class.
public class DogDemo {
    public static void main(String[] args) {
        // --- Creating Objects ---
        // An object is an instance of a class. Here, we create two 'Dog' objects from the 'Dog' blueprint.
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        // --- Setting the State of dog1 ---
        // We assign values to the instance variables of the 'dog1' object.
        dog1.breed = "Labrador";
        dog1.age = 5;
        dog1.color = "Golden";

        // --- Setting the State of dog2 ---
        // 'dog2' is a separate object with its own set of data.
        dog2.breed = "Poodle";
        dog2.age = 3;
        dog2.color = "White";

        // --- Calling Methods (Behavior) ---
        // We ask each object to perform actions by calling its methods.

        System.out.println("--- Dog 1's Information ---");
        dog1.displayInfo(); // Display all info for dog1.
        dog1.bark();        // Make dog1 bark.

        System.out.println("\n--- Dog 2's Information ---");
        dog2.displayInfo(); // Display all info for dog2.
        dog2.sleep();       // Make dog2 sleep.
    }
}
