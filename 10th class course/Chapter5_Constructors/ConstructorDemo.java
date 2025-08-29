package Chapter5_Constructors;

// Chapter 5: Constructors
// Topic: Basics - Introduction to Constructors

// A constructor is a special method that is called when an object is created.
// It's used to initialize the object's state.
class Student {
    String name;
    int age;
    String grade;

    // This is the constructor.
    // 1. It has the same name as the class ('Student').
    // 2. It has no return type (not even void).
    Student() {
        // This code runs automatically whenever a new 'Student' object is created.
        System.out.println("A new student object is being created!");
        
        // It's common to initialize member variables to default values here.
        name = "Unknown";
        age = 0;
        grade = "Not Assigned";
    }

    // A regular method to display the student's information.
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        System.out.println("Preparing to create student objects...");

        // When this line is executed, the 'Student()' constructor is automatically called.
        Student student1 = new Student(); 
        
        // The constructor is called again for this new object.
        Student student2 = new Student(); 

        System.out.println("\n--- Student 1 Info ---");
        // The object's data has been initialized by the constructor.
        student1.displayInfo();

        System.out.println("\n--- Student 2 Info ---");
        student2.displayInfo();
    }
}
