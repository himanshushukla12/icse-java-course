package Chapter5_Constructors;

// Chapter 5: Constructors
// Topic: Types - Parameterized Constructor

// A parameterized constructor is a constructor that accepts arguments.
class Car {
    String brand;
    String model;
    int year;
    double price;

    // This is a parameterized constructor.
    // It takes four arguments to initialize the state of the Car object.
    Car(String b, String m, int y, double p) {
        System.out.println("Creating a new car with given specifications...");
        // 'this.brand' refers to the instance variable, while 'b' is the local parameter.
        // Using 'this' helps to avoid confusion if parameter names are the same as instance variable names.
        this.brand = b;
        this.model = m;
        this.year = y;
        this.price = p;
    }

    // Method to display the car's specifications.
    void displaySpecs() {
        System.out.println("=== Car Specifications ===");
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
        System.out.println("Price: $" + this.price);
    }

    // Method to simulate starting the engine.
    void startEngine() {
        System.out.println(this.brand + " " + this.model + " is starting...");
    }
}

public class ParameterizedConstructorDemo {
    public static void main(String[] args) {
        // Create objects by passing arguments directly to the constructor.
        // This makes the code cleaner and ensures objects are created with initial data.
        Car car1 = new Car("Toyota", "Camry", 2023, 28000.0);
        Car car2 = new Car("BMW", "X5", 2024, 65000.0);
        Car car3 = new Car("Honda", "Civic", 2022, 23000.0);

        System.out.println("\n--- Car 1 ---");
        car1.displaySpecs();
        car1.startEngine();

        System.out.println("\n--- Car 2 ---");
        car2.displaySpecs();
        car2.startEngine();

        System.out.println("\n--- Car 3 ---");
        car3.displaySpecs();
        car3.startEngine();
    }
}
