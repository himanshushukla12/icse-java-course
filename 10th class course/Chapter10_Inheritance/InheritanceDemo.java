
// Superclass (Parent)
class Vehicle {
    String brand;
    int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
        System.out.println("Vehicle constructor called.");
    }

    public void start() {
        System.out.println("The vehicle is starting.");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

// Subclass (Child)
class Car extends Vehicle {
    int numberOfDoors;

    public Car(String brand, int year, int doors) {
        // Call the superclass constructor using super()
        // This must be the first statement in the constructor
        super(brand, year); 
        this.numberOfDoors = doors;
        System.out.println("Car constructor called.");
    }

    // This method overrides the start() method of the Vehicle class
    @Override
    public void start() {
        System.out.println("The car engine is starting with a key.");
    }

    // This is a new method specific to the Car class
    public void displayCarInfo() {
        super.displayInfo(); // Call the superclass's displayInfo method
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Another Subclass
class Bicycle extends Vehicle {
    boolean hasGear;

    public Bicycle(String brand, int year, boolean hasGear) {
        super(brand, year);
        this.hasGear = hasGear;
    }

    // This method also overrides the start() method of the Vehicle class
    @Override
    public void start() {
        System.out.println("The bicycle starts by pedaling.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("--- Creating a Car ---");
        Car myCar = new Car("Toyota", 2023, 4);
        myCar.start(); // Calls the overridden method in Car
        myCar.displayCarInfo();

        System.out.println("\n--- Creating a Bicycle ---");
        Bicycle myBicycle = new Bicycle("Trek", 2024, true);
        myBicycle.start(); // Calls the overridden method in Bicycle
        myBicycle.displayInfo(); // Calls the inherited method from Vehicle
    }
}
