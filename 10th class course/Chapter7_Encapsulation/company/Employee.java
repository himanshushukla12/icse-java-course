package Chapter7_Encapsulation.company;

// Chapter 7: Encapsulation
// This file should be placed inside the 'company' directory.

public class Employee {
    // public: Accessible from anywhere in the project.
    public String name;
    
    // protected: Accessible within the 'company' package and by any subclass, even if in a different package.
    protected double salary;
    
    // default (no keyword): Accessible only within the 'company' package.
    String department;
    
    // private: Accessible only within this 'Employee' class.
    private int employeeId;
    
    public Employee(String name, double salary, String department, int id) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.employeeId = id;
    }
    
    // A public method is needed to access the private 'employeeId' from outside the class.
    public int getEmployeeId() {
        return this.employeeId;
    }
    
    // A public method to display information.
    public void displayInfo() {
        System.out.println("--- Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary); // Accessible here
        System.out.println("Department: " + department); // Accessible here
        System.out.println("Employee ID: " + getEmployeeId()); // Accessed via its getter
    }
}
