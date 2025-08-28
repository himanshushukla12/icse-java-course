package Chapter3_ObjectsAndClasses;

// Chapter 3: Objects and Classes
// Topic: Class as an Object Factory

// The 'Car' class acts as a template or factory for creating car objects.
class Car {
    // Member variables defining the state of a car.
    String brand;
    String model;
    String color;
    int year;

    // Method to simulate starting the car's engine.
    void startEngine() {
        System.out.println(brand + " " + model + " engine started!");
    }

    // Method to display the specifications of the car.
    void displaySpecs() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }
}

// The main class demonstrates how the 'Car' class is used as a factory.
public class CarFactory {
    public static void main(String[] args) {
        // The 'Car' class is used here to "manufacture" or create multiple 'Car' objects.
        // Each object is a distinct instance, like different cars coming off an assembly line.
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        // Each car object has its own unique state (data).
        // Setting the state for the first car object.
        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.color = "Blue";
        car1.year = 2023;

        // Setting the state for the second car object.
        car2.brand = "Honda";
        car2.model = "Civic";
        car2.color = "Red";
        car2.year = 2022;

        // Setting the state for the third car object.
        car3.brand = "BMW";
        car3.model = "X5";
        car3.color = "Black";
        car3.year = 2024;

        // Displaying the information and behavior of each car object.
        System.out.println("=== Car 1 ===");
        car1.displaySpecs();
        car1.startEngine();

        System.out.println("\n=== Car 2 ===");
        car2.displaySpecs();
        car2.startEngine();

        System.out.println("\n=== Car 3 ===");
        car3.displaySpecs();
        car3.startEngine();
    }
}
