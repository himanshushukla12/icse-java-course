package Chapter7_Encapsulation.company;

// Chapter 7: Encapsulation
// This file should be placed inside the 'company' directory.

// 'Manager' is a subclass of 'Employee'.
public class Manager extends Employee {

    public Manager(String name, double salary, String department, int id) {
        // Call the constructor of the parent class (Employee).
        super(name, salary, department, id);
    }
    
    public void giveRaise(double amount) {
        // A Manager can access the 'protected' salary of an Employee.
        this.salary += amount;
        System.out.println("Gave a raise to " + this.name + ". New salary: " + this.salary);
    }

    public void viewDepartment() {
        // A Manager can access the 'default' department because it's in the same package.
        System.out.println(this.name + " works in the " + this.department + " department.");
    }
}
