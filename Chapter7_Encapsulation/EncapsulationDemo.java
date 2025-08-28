package Chapter7_Encapsulation;

// Chapter 7: Encapsulation
// Topic: Access Specifiers and Data Hiding

// This class demonstrates encapsulation.
// Data (name, age, email) is kept 'private' to protect it from outside access.
class Person {
    // Private data members: These can only be accessed within this class.
    private String name;
    private int age;
    private String email;

    // The constructor initializes the object.
    public Person(String name, int age, String email) {
        // It uses the public setters to ensure validation rules are applied upon creation.
        this.setName(name);
        this.setAge(age);
        this.setEmail(email);
    }

    // --- GETTERS (Accessor Methods) ---
    // Public 'getter' methods provide read-only access to the private data.

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getEmail() {
        return this.email;
    }

    // --- SETTERS (Mutator Methods) ---
    // Public 'setter' methods provide a controlled way to modify the private data.
    // They can include validation logic.

    public void setName(String name) {
        // Validation: Ensure the name is not null or just empty spaces.
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Error: Name cannot be empty.");
        }
    }

    public void setAge(int age) {
        // Validation: Ensure the age is within a reasonable range.
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            System.out.println("Error: Invalid age. Must be between 1 and 119.");
        }
    }

    public void setEmail(String email) {
        // Validation: Ensure the email contains an '@' symbol.
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Error: Invalid email format.");
        }
    }

    // A public method to display the person's information.
    public void displayInfo() {
        System.out.println("Name: " + this.name + ", Age: " + this.age + ", Email: " + this.email);
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        // Create a Person object. The constructor ensures initial data is valid.
        Person person = new Person("Alice", 30, "alice@example.com");

        System.out.println("=== Initial Information ===");
        person.displayInfo();

        // You cannot access private fields directly. This would cause a compile error.
        // person.age = -5; // ERROR!

        // Instead, you must use the public setter method, which contains validation.
        System.out.println("\n=== Attempting to set invalid age... ===");
        person.setAge(-5); // The error message from the setter will be displayed.

        System.out.println("\n=== Attempting to set a valid age... ===");
        person.setAge(31);

        System.out.println("\n=== Final Information ===");
        // The age was only updated when a valid value was provided.
        person.displayInfo();
        
        // Accessing data is done through public getter methods.
        System.out.println("\nGetting name via getter: " + person.getName());
    }
}
