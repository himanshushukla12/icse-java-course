package Chapter3_ObjectsAndClasses;

// Chapter 3: Objects and Classes
// Topic: Fundamentals - Objects and Classes, Encapsulating State and Behaviour

// A class is a blueprint for creating objects. 
// Here, 'Student' is a class that defines the properties and behaviors of a student.
class Student {
    // Member Variables (State): These variables define the state of an object.
    // They hold the data associated with an object.
    String name; // Represents the student's name
    int age;     // Represents the student's age
    String grade;  // Represents the student's grade
    double marks;  // Represents the student's marks

    // Member Methods (Behaviour): These methods define the actions an object can perform.
    
    // This method displays the information of a student.
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Marks: " + marks);
    }

    // This method simulates the student studying.
    void study() {
        System.out.println(name + " is studying hard!");
    }

    // This method calculates and displays the student's percentage.
    void calculatePercentage() {
        double percentage = (marks / 500) * 100;
        System.out.println(name + "'s percentage: " + percentage + "%");
    }
}

// This is the main class to run the example.
public class StudentDemo {
    public static void main(String[] args) {
        // Creating Objects (Instances): An object is an instance of a class.
        // 'student1' and 'student2' are objects of the 'Student' class.
        Student student1 = new Student();
        Student student2 = new Student();

        // Setting the state of the 'student1' object by assigning values to its member variables.
        student1.name = "Alice";
        student1.age = 16;
        student1.grade = "10th";
        student1.marks = 450;

        // Setting the state of the 'student2' object.
        student2.name = "Bob";
        student2.age = 15;
        student2.grade = "10th";
        student2.marks = 380;

        // Calling the methods (behaviour) of the 'student1' object.
        System.out.println("=== Student 1 Information ===");
        student1.displayInfo();
        student1.study();
        student1.calculatePercentage();

        // Calling the methods of the 'student2' object.
        System.out.println("\n=== Student 2 Information ===");
        student2.displayInfo();
        student2.study();
        student2.calculatePercentage();
    }
}
