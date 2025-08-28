package Chapter7_Encapsulation;

import Chapter7_Encapsulation.company.Employee;
import Chapter7_Encapsulation.company.Manager;

// Chapter 7: Encapsulation
// This file should be placed in the parent directory of 'company'.

public class AccessSpecifierDemo {
    public static void main(String[] args) {
        System.out.println("--- Creating an Employee ---");
        Employee emp = new Employee("John Doe", 50000, "IT", 101);

        // --- Accessing Employee members ---
        // 'name' is public, so it can be accessed from anywhere.
        System.out.println("Public member 'name': " + emp.name);

        // The following lines would cause COMPILE ERRORS if uncommented,
        // because we are outside the 'company' package.
        // System.out.println(emp.salary);     // ERROR: 'salary' is protected.
        // System.out.println(emp.department); // ERROR: 'department' has default access.
        // System.out.println(emp.employeeId); // ERROR: 'employeeId' is private.

        // We must use the public getter method to access private data.
        System.out.println("Accessing private 'employeeId' via public getter: " + emp.getEmployeeId());
        
        emp.displayInfo();


        System.out.println("\n--- Creating a Manager ---");
        Manager mgr = new Manager("Jane Smith", 80000, "Management", 201);
        
        // Accessing public member inherited from Employee.
        System.out.println("Manager's public name: " + mgr.name);

        // The manager can use its own methods.
        mgr.giveRaise(5000);
        mgr.viewDepartment(); // This works because Manager is in the same package as Employee.
        
        mgr.displayInfo();
    }
}
