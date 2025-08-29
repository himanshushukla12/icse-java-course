# Complete Java Class 10th Notes 📚

Welcome to your comprehensive Java learning guide! This document covers all essential concepts with easy explanations, practical examples, and code demonstrations.

---

## Table of Contents
1. [Chapter 3: Objects and Classes](#chapter-3-objects-and-classes)
2. [Chapter 4: User-defined Methods](#chapter-4-user-defined-methods)
3. [Chapter 5: Constructors](#chapter-5-constructors)
4. [Chapter 6: Library Classes](#chapter-6-library-classes)
5. [Chapter 7: Encapsulation](#chapter-7-encapsulation)
6. [Chapter 8: Arrays](#chapter-8-arrays)
7. [Chapter 9: String Handling](#chapter-9-string-handling)

---

### Java Operator Precedence Chart

This chart lists Java operators from highest to lowest precedence. Operators on the same line have equal precedence.

| Precedence | Operator                  | Description                               | Associativity |
| :--------: | :------------------------ | :---------------------------------------- | :-----------: |
| 15         | `()` `[]` `.`             | Parentheses, Array Subscript, Member Access | L → R         |
| 14         | `++` `--` `+` `-` `!` `~` | Unary, Logical NOT, Bitwise NOT           | R → L         |
| 13         | `*` `/` `%`               | Multiplicative                            | L → R         |
| 12         | `+` `-`                   | Additive                                  | L → R         |
| 11         | `<<` `>>` `>>>`           | Bitwise Shift                             | L → R         |
| 10         | `<` `<=` `>` `>=` `instanceof` | Relational                                | L → R         |
| 9          | `==` `!=`                 | Equality                                  | L → R         |
| 8          | `&`                       | Bitwise AND                               | L → R         |
| 7          | `^`                       | Bitwise XOR                               | L → R         |
| 6          | `|`                       | Bitwise OR                                | L → R         |
| 5          | `&&`                      | Logical AND                               | L → R         |
| 4          | `||`                      | Logical OR                                | L → R         |
| 3          | `?:`                      | Ternary Conditional                       | R → L         |
| 2          | `=` `+=` `-=` `*=` `/=` `%=` | Assignment                                | R → L         |

---

## Chapter 3: Objects and Classes

### 🎯 What are Objects and Classes?

**Class**: Think of a class as a blueprint or template. Like a blueprint for a house, it defines what the house will have (rooms, doors, windows) but it's not the actual house.

**Object**: An object is the actual thing created from the blueprint. It's like the real house built from the blueprint.

### 📖 Key Concepts

#### 1. Objects Encapsulating State and Behaviour
- **State**: What the object has (attributes/properties)
- **Behaviour**: What the object can do (methods/functions)

#### 2. Class Members
- **Member Variables**: Store data (state)
- **Member Methods**: Define actions (behaviour)

### 💻 Practical Example: Student Class

```java
// Class definition - This is our blueprint
class Student {
    // Member Variables (State)
    String name;
    int age;
    String grade;
    double marks;
    
    // Member Methods (Behaviour)
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Marks: " + marks);
    }
    
    void study() {
        System.out.println(name + " is studying hard!");
    }
    
    void calculatePercentage() {
        double percentage = (marks / 500) * 100;
        System.out.println(name + "'s percentage: " + percentage + "%");
    }
}

// Main class to test our Student class
public class StudentDemo {
    public static void main(String[] args) {
        // Creating objects (instances) from the class
        Student student1 = new Student();
        Student student2 = new Student();
        
        // Setting state for student1
        student1.name = "Alice";
        student1.age = 16;
        student1.grade = "10th";
        student1.marks = 450;
        
        // Setting state for student2
        student2.name = "Bob";
        student2.age = 15;
        student2.grade = "10th";
        student2.marks = 380;
        
        // Using behaviour (calling methods)
        System.out.println("=== Student 1 Information ===");
        student1.displayInfo();
        student1.study();
        student1.calculatePercentage();
        
        System.out.println("\n=== Student 2 Information ===");
        student2.displayInfo();
        student2.study();
        student2.calculatePercentage();
    }
}
```

**Sample Output:**
```
=== Student 1 Information ===
Name: Alice
Age: 16
Grade: 10th
Marks: 450.0
Alice is studying hard!
Alice's percentage: 90.0%

=== Student 2 Information ===
Name: Bob
Age: 15
Grade: 10th
Marks: 380.0
Bob is studying hard!
Bob's percentage: 76.0%
```

### 🏭 Class as Object Factory

```java
class Car {
    String brand;
    String model;
    String color;
    int year;
    
    void startEngine() {
        System.out.println(brand + " " + model + " engine started!");
    }
    
    void displaySpecs() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }
}

public class CarFactory {
    public static void main(String[] args) {
        // Class acting as a factory - creating multiple objects
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        
        // Each object is unique with its own state
        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.color = "Blue";
        car1.year = 2023;
        
        car2.brand = "Honda";
        car2.model = "Civic";
        car2.color = "Red";
        car2.year = 2022;
        
        car3.brand = "BMW";
        car3.model = "X5";
        car3.color = "Black";
        car3.year = 2024;
        
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
```

**Sample Output:**
```
=== Car 1 ===
Brand: Toyota
Model: Camry
Color: Blue
Year: 2023
Toyota Camry engine started!

=== Car 2 ===
Brand: Honda
Model: Civic
Color: Red
Year: 2022
Honda Civic engine started!

=== Car 3 ===
Brand: BMW
Model: X5
Color: Black
Year: 2024
BMW X5 engine started!
```

### 🔍 Real-life Example: Bank Account

```java
class BankAccount {
    // State (Member Variables)
    String accountHolder;
    long accountNumber;
    double balance;
    String accountType;
    
    // Behaviour (Member Methods)
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("Remaining Balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds!");
        }
    }
    
    void checkBalance() {
        System.out.println("Account Balance: $" + balance);
    }
    
    void accountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: $" + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        // Creating a bank account object
        BankAccount account = new BankAccount();
        
        // Setting initial state
        account.accountHolder = "John Doe";
        account.accountNumber = 1234567890L;
        account.balance = 1000.0;
        account.accountType = "Savings";
        
        // Demonstrating behaviour
        System.out.println("=== Initial Account Information ===");
        account.accountInfo();
        
        System.out.println("\n=== Banking Operations ===");
        account.deposit(500);
        account.withdraw(200);
        account.checkBalance();
        account.withdraw(2000); // This should fail
    }
}
```

**Sample Output:**
```
=== Initial Account Information ===
Account Holder: John Doe
Account Number: 1234567890
Account Type: Savings
Current Balance: $1000.0

=== Banking Operations ===
Deposited: $500.0
New Balance: $1500.0
Withdrawn: $200.0
Remaining Balance: $1300.0
Account Balance: $1300.0
Invalid withdrawal amount or insufficient funds!
```

---

## Chapter 4: User-defined Methods

### 🎯 What are Methods?

Methods are like mini-programs inside a class that perform specific tasks. Think of them as recipes that tell the computer exactly what to do step by step.

### 📖 Method Structure

```java
accessSpecifier returnType methodName(parameterType parameterName) {
    // Method body
    return value; // if return type is not void
}
```

### 💻 Types of Parameters

#### 1. No Parameters

```java
class Calculator {
    void welcomeMessage() {
        System.out.println("Welcome to Calculator!");
        System.out.println("Ready to perform calculations.");
    }
    
    void showCurrentTime() {
        java.util.Date date = new java.util.Date();
        System.out.println("Current time: " + date);
    }
}

public class NoParameterDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.welcomeMessage();
        calc.showCurrentTime();
    }
}
```

**Sample Output:**
```
Welcome to Calculator!
Ready to perform calculations.
Current time: Fri Aug 29 10:30:45 IST 2025
```

#### 2. With Parameters

```java
class MathOperations {
    // Method with two parameters
    void addNumbers(int a, int b) {
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
    }
    
    // Method with three parameters
    void findLargest(int x, int y, int z) {
        int largest = x;
        if (y > largest) largest = y;
        if (z > largest) largest = z;
        
        System.out.println("Among " + x + ", " + y + ", " + z);
        System.out.println("Largest number is: " + largest);
    }
    
    // Method with different parameter types
    void calculateArea(double length, double width, String shape) {
        double area = length * width;
        System.out.println("Area of " + shape + ": " + area + " square units");
    }
}

public class ParameterDemo {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        
        math.addNumbers(15, 25);
        math.findLargest(45, 78, 23);
        math.calculateArea(12.5, 8.0, "Rectangle");
    }
}
```

**Sample Output:**
```
15 + 25 = 40
Among 45, 78, 23
Largest number is: 78
Area of Rectangle: 100.0 square units
```

### 🔄 Using the return Statement

#### Methods that Return Values

```java
class Calculator {
    // Method returning int
    int add(int a, int b) {
        return a + b;
    }
    
    // Method returning double
    double calculatePercentage(double marks, double totalMarks) {
        return (marks / totalMarks) * 100;
    }
    
    // Method returning boolean
    boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    // Method returning String
    String getGrade(double percentage) {
        if (percentage >= 90) return "A+";
        else if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else return "F";
    }
    
    // Method with multiple return statements
    String checkAge(int age) {
        if (age < 13) {
            return "Child";
        } else if (age < 20) {
            return "Teenager";
        } else if (age < 60) {
            return "Adult";
        } else {
            return "Senior";
        }
    }
}

public class ReturnDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        // Using returned values
        int sum = calc.add(45, 35);
        System.out.println("Sum: " + sum);
        
        double percentage = calc.calculatePercentage(425, 500);
        System.out.println("Percentage: " + percentage + "%");
        
        boolean isEvenNumber = calc.isEven(24);
        System.out.println("Is 24 even? " + isEvenNumber);
        
        String grade = calc.getGrade(percentage);
        System.out.println("Grade: " + grade);
        
        String ageCategory = calc.checkAge(16);
        System.out.println("Age category: " + ageCategory);
        
        // Chaining method calls
        System.out.println("Grade for 90%: " + calc.getGrade(90));
    }
}
```

**Sample Output:**
```
Sum: 80
Percentage: 85.0%
Is 24 even? true
Grade: A
Age category: Teenager
Grade for 90%: A+
```

### 🧪 Pure vs Impure Methods

#### Pure Methods
Pure methods don't change the object's state and return the same result for the same input.

#### Impure Methods
Impure methods can change the object's state.

```java
class Counter {
    private int count = 0;
    
    // Pure Method - doesn't change state, always returns same result for same input
    int square(int number) {
        return number * number;
    }
    
    // Pure Method - doesn't change object state
    int add(int a, int b) {
        return a + b;
    }
    
    // Impure Method - changes object state
    void increment() {
        count++;
        System.out.println("Count incremented to: " + count);
    }
    
    // Impure Method - changes object state
    void reset() {
        count = 0;
        System.out.println("Count reset to: " + count);
    }
    
    // Pure Method - doesn't change state, just returns current value
    int getCount() {
        return count;
    }
}

public class PureImpureDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();
        
        // Pure methods - same input, same output
        System.out.println("Square of 5: " + counter.square(5));
        System.out.println("Square of 5 again: " + counter.square(5));
        System.out.println("Add 3 + 7: " + counter.add(3, 7));
        
        // Impure methods - change object state
        System.out.println("\nInitial count: " + counter.getCount());
        counter.increment();
        counter.increment();
        counter.increment();
        System.out.println("Current count: " + counter.getCount());
        counter.reset();
        System.out.println("Final count: " + counter.getCount());
    }
}
```

**Sample Output:**
```
Square of 5: 25
Square of 5 again: 25
Add 3 + 7: 10

Initial count: 0
Count incremented to: 1
Count incremented to: 2
Count incremented to: 3
Current count: 3
Count reset to: 0
Final count: 0
```

### ⚡ Static vs Non-static Methods

#### Static Methods
- Belong to the class, not to any specific object
- Can be called without creating an object
- Cannot access non-static variables directly

#### Non-static Methods
- Belong to objects of the class
- Need an object to be called
- Can access both static and non-static variables

```java
class MathUtils {
    // Static variable
    static String className = "MathUtils";
    
    // Non-static variable
    String instanceName;
    
    // Static method - belongs to class
    static double calculateCircleArea(double radius) {
        return 3.14159 * radius * radius;
    }
    
    static int findMax(int a, int b) {
        return (a > b) ? a : b;
    }
    
    static void showClassInfo() {
        System.out.println("Class: " + className);
        // System.out.println(instanceName); // This would cause error!
    }
    
    // Non-static method - belongs to object
    void setInstanceName(String name) {
        this.instanceName = name;
    }
    
    void showInstanceInfo() {
        System.out.println("Instance: " + instanceName);
        System.out.println("Class: " + className); // Can access static variables
    }
    
    double calculateRectangleArea(double length, double width) {
        return length * width;
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        // Calling static methods - no object needed
        System.out.println("=== Static Methods ===");
        double circleArea = MathUtils.calculateCircleArea(5.0);
        System.out.println("Circle area: " + circleArea);
        
        int maxValue = MathUtils.findMax(45, 78);
        System.out.println("Maximum: " + maxValue);
        
        MathUtils.showClassInfo();
        
        // Creating objects for non-static methods
        System.out.println("\n=== Non-static Methods ===");
        MathUtils utils1 = new MathUtils();
        MathUtils utils2 = new MathUtils();
        
        utils1.setInstanceName("Calculator-1");
        utils2.setInstanceName("Calculator-2");
        
        utils1.showInstanceInfo();
        utils2.showInstanceInfo();
        
        double rectArea = utils1.calculateRectangleArea(10, 15);
        System.out.println("Rectangle area: " + rectArea);
    }
}
```

**Sample Output:**
```
=== Static Methods ===
Circle area: 78.53975
Maximum: 78
Class: MathUtils

=== Non-static Methods ===
Instance: Calculator-1
Class: MathUtils
Instance: Calculator-2
Class: MathUtils
Rectangle area: 150.0
```

### 🔄 Method Overloading (Polymorphism)

Method overloading allows multiple methods with the same name but different parameters.

```java
class Calculator {
    // Overloaded add methods
    
    // Method 1: Two integers
    int add(int a, int b) {
        System.out.println("Adding two integers");
        return a + b;
    }
    
    // Method 2: Three integers
    int add(int a, int b, int c) {
        System.out.println("Adding three integers");
        return a + b + c;
    }
    
    // Method 3: Two doubles
    double add(double a, double b) {
        System.out.println("Adding two doubles");
        return a + b;
    }
    
    // Method 4: String concatenation
    String add(String a, String b) {
        System.out.println("Concatenating two strings");
        return a + b;
    }
    
    // Overloaded area methods
    
    // Circle area
    double area(double radius) {
        System.out.println("Calculating circle area");
        return 3.14159 * radius * radius;
    }
    
    // Rectangle area
    double area(double length, double width) {
        System.out.println("Calculating rectangle area");
        return length * width;
    }
    
    // Triangle area
    double area(double base, double height, String shape) {
        if (shape.equals("triangle")) {
            System.out.println("Calculating triangle area");
            return 0.5 * base * height;
        }
        return 0;
    }
}

public class OverloadingDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("=== Method Overloading Examples ===");
        
        // Different add methods based on parameters
        System.out.println("Result: " + calc.add(10, 20));
        System.out.println("Result: " + calc.add(10, 20, 30));
        System.out.println("Result: " + calc.add(10.5, 20.3));
        System.out.println("Result: " + calc.add("Hello", "World"));
        
        System.out.println("\n=== Area Calculations ===");
        
        // Different area methods
        System.out.println("Circle area: " + calc.area(5.0));
        System.out.println("Rectangle area: " + calc.area(10.0, 15.0));
        System.out.println("Triangle area: " + calc.area(8.0, 6.0, "triangle"));
    }
}
```

**Sample Output:**
```
=== Method Overloading Examples ===
Adding two integers
Result: 30
Adding three integers
Result: 60
Adding two doubles
Result: 30.8
Concatenating two strings
Result: HelloWorld

=== Area Calculations ===
Calculating circle area
Circle area: 78.53975
Calculating rectangle area
Rectangle area: 150.0
Calculating triangle area
Triangle area: 24.0
```

---

## Chapter 5: Constructors

### 🎯 What is a Constructor?

A constructor is a special method that is automatically called when an object is created. Think of it as the "birth certificate" of an object - it sets up the initial state.

### 📖 Constructor Characteristics

1. **Same name as class**
2. **No return type** (not even void)
3. **Automatically called** when object is created
4. **Used to initialize** object state

### 💻 Basic Constructor Example

```java
class Student {
    String name;
    int age;
    String grade;
    
    // Constructor
    Student() {
        System.out.println("A new student object is created!");
        name = "Unknown";
        age = 0;
        grade = "Not Assigned";
    }
    
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        System.out.println("Creating student objects...");
        
        Student student1 = new Student(); // Constructor is called
        Student student2 = new Student(); // Constructor is called again
        
        System.out.println("\nStudent 1 Info:");
        student1.displayInfo();
        
        System.out.println("\nStudent 2 Info:");
        student2.displayInfo();
    }
}
```

**Sample Output:**
```
Creating student objects...
A new student object is created!
A new student object is created!

Student 1 Info:
Name: Unknown
Age: 0
Grade: Not Assigned

Student 2 Info:
Name: Unknown
Age: 0
Grade: Not Assigned
```

### 🔄 Parameterized Constructor

```java
class Car {
    String brand;
    String model;
    int year;
    double price;
    
    // Parameterized constructor
    Car(String b, String m, int y, double p) {
        System.out.println("Creating a new car...");
        brand = b;
        model = m;
        year = y;
        price = p;
    }
    
    void displaySpecs() {
        System.out.println("=== Car Specifications ===");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }
    
    void startEngine() {
        System.out.println(brand + " " + model + " is starting...");
    }
}

public class ParameterizedConstructorDemo {
    public static void main(String[] args) {
        // Creating objects with different values
        Car car1 = new Car("Toyota", "Camry", 2023, 28000.0);
        Car car2 = new Car("BMW", "X5", 2024, 65000.0);
        Car car3 = new Car("Honda", "Civic", 2022, 23000.0);
        
        System.out.println("\n=== Car 1 ===");
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
```

**Sample Output:**
```
Creating a new car...
Creating a new car...
Creating a new car...

=== Car 1 ===
=== Car Specifications ===
Brand: Toyota
Model: Camry
Year: 2023
Price: $28000.0
Toyota Camry is starting...

=== Car 2 ===
=== Car Specifications ===
Brand: BMW
Model: X5
Year: 2024
Price: $65000.0
BMW X5 is starting...

=== Car 3 ===
=== Car Specifications ===
Brand: Honda
Model: Civic
Year: 2022
Price: $23000.0
Honda Civic is starting...
```

### 🔄 Constructor Overloading

Like methods, constructors can also be overloaded with different parameters.

```java
class BankAccount {
    String accountHolder;
    long accountNumber;
    double balance;
    String accountType;
    
    // Default constructor
    BankAccount() {
        System.out.println("Creating account with default values...");
        accountHolder = "Unknown";
        accountNumber = 0;
        balance = 0.0;
        accountType = "Savings";
    }
    
    // Constructor with account holder name
    BankAccount(String name) {
        System.out.println("Creating account for: " + name);
        accountHolder = name;
        accountNumber = generateAccountNumber();
        balance = 100.0; // Minimum balance
        accountType = "Savings";
    }
    
    // Constructor with name and initial balance
    BankAccount(String name, double initialBalance) {
        System.out.println("Creating account for: " + name + " with balance: $" + initialBalance);
        accountHolder = name;
        accountNumber = generateAccountNumber();
        balance = initialBalance;
        accountType = "Savings";
    }
    
    // Constructor with all parameters
    BankAccount(String name, double initialBalance, String type) {
        System.out.println("Creating " + type + " account for: " + name);
        accountHolder = name;
        accountNumber = generateAccountNumber();
        balance = initialBalance;
        accountType = type;
    }
    
    // Helper method to generate account number
    private long generateAccountNumber() {
        return (long)(Math.random() * 9000000000L) + 1000000000L;
    }
    
    void displayAccountInfo() {
        System.out.println("=== Account Information ===");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: $" + balance);
    }
}

public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        // Using different constructors
        
        System.out.println("1. Default constructor:");
        BankAccount account1 = new BankAccount();
        account1.displayAccountInfo();
        
        System.out.println("\n2. Constructor with name:");
        BankAccount account2 = new BankAccount("Alice Johnson");
        account2.displayAccountInfo();
        
        System.out.println("\n3. Constructor with name and balance:");
        BankAccount account3 = new BankAccount("Bob Smith", 5000.0);
        account3.displayAccountInfo();
        
        System.out.println("\n4. Constructor with all parameters:");
        BankAccount account4 = new BankAccount("Carol Brown", 15000.0, "Current");
        account4.displayAccountInfo();
    }
}
```

**Sample Output:**
```
1. Default constructor:
Creating account with default values...
=== Account Information ===
Account Holder: Unknown
Account Number: 0
Account Type: Savings
Balance: $0.0

2. Constructor with name:
Creating account for: Alice Johnson
=== Account Information ===
Account Holder: Alice Johnson
Account Number: 7845632109
Account Type: Savings
Balance: $100.0

3. Constructor with name and balance:
Creating account for: Bob Smith with balance: $5000.0
=== Account Information ===
Account Holder: Bob Smith
Account Number: 3421567890
Account Type: Savings
Balance: $5000.0

4. Constructor with all parameters:
Creating Current account for: Carol Brown
=== Account Information ===
Account Holder: Carol Brown
Account Number: 9876543210
Account Type: Current
Balance: $15000.0
```

### ⚖️ Constructor vs Method Differences

```java
class Example {
    String name;
    int value;
    
    // Constructor - no return type, same name as class
    Example(String n, int v) {
        System.out.println("Constructor called");
        name = n;
        value = v;
        // No return statement
    }
    
    // Method - has return type, can have any name
    void setValues(String n, int v) {
        System.out.println("Method called");
        name = n;
        value = v;
        // No return value (void)
    }
    
    // Method with return type
    String getInfo() {
        return "Name: " + name + ", Value: " + value;
    }
    
    // Method can be called multiple times
    void displayMessage() {
        System.out.println("This method can be called anytime!");
    }
}

public class ConstructorVsMethodDemo {
    public static void main(String[] args) {
        // Constructor is called automatically when object is created
        Example obj = new Example("Initial", 100);
        
        System.out.println("After constructor: " + obj.getInfo());
        
        // Methods can be called multiple times
        obj.displayMessage();
        obj.displayMessage();
        
        // Methods can change object state
        obj.setValues("Updated", 200);
        System.out.println("After method: " + obj.getInfo());
        
        // Constructor cannot be called again for same object
        // obj.Example("Test", 300); // This would cause error!
    }
}
```

**Sample Output:**
```
Constructor called
After constructor: Name: Initial, Value: 100
This method can be called anytime!
This method can be called anytime!
Method called
After method: Name: Updated, Value: 200
```

### 🏗️ Practical Example: Building a Library System

```java
class Book {
    String title;
    String author;
    String isbn;
    double price;
    boolean isAvailable;
    
    // Default constructor
    Book() {
        title = "Unknown Title";
        author = "Unknown Author";
        isbn = "000-0000000000";
        price = 0.0;
        isAvailable = true;
        System.out.println("Default book created");
    }
    
    // Constructor with title and author
    Book(String bookTitle, String bookAuthor) {
        title = bookTitle;
        author = bookAuthor;
        isbn = generateISBN();
        price = 19.99; // Default price
        isAvailable = true;
        System.out.println("Book created: " + title + " by " + author);
    }
    
    // Full constructor
    Book(String bookTitle, String bookAuthor, String bookISBN, double bookPrice) {
        title = bookTitle;
        author = bookAuthor;
        isbn = bookISBN;
        price = bookPrice;
        isAvailable = true;
        System.out.println("Complete book created: " + title);
    }
    
    private String generateISBN() {
        return "978-" + (int)(Math.random() * 1000000000);
    }
    
    void displayBookInfo() {
        System.out.println("=== Book Information ===");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Price: $" + price);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }
    
    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book '" + title + "' has been borrowed.");
        } else {
            System.out.println("Book '" + title + "' is not available.");
        }
    }
    
    void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book '" + title + "' has been returned.");
        } else {
            System.out.println("Book '" + title + "' was not borrowed.");
        }
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        System.out.println("=== Library Management System ===\n");
        
        // Creating books using different constructors
        Book book1 = new Book();
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("1984", "George Orwell", "978-0451524935", 13.99);
        
        System.out.println("\n=== Book 1 (Default) ===");
        book1.displayBookInfo();
        
        System.out.println("\n=== Book 2 (Title & Author) ===");
        book2.displayBookInfo();
        
        System.out.println("\n=== Book 3 (Complete Info) ===");
        book3.displayBookInfo();
        
        System.out.println("\n=== Library Operations ===");
        book2.borrowBook();
        book2.displayBookInfo();
        
        book2.returnBook();
        book2.displayBookInfo();
    }
}
```

**Sample Output:**
```
=== Library Management System ===

Default book created
Book created: To Kill a Mockingbird by Harper Lee
Complete book created: 1984

=== Book 1 (Default) ===
=== Book Information ===
Title: Unknown Title
Author: Unknown Author
ISBN: 000-0000000000
Price: $0.0
Available: Yes

=== Book 2 (Title & Author) ===
=== Book Information ===
Title: To Kill a Mockingbird
Author: Harper Lee
ISBN: 978-456789123
Price: $19.99
Available: Yes

=== Book 3 (Complete Info) ===
=== Book Information ===
Title: 1984
Author: George Orwell
ISBN: 978-0451524935
Price: $13.99
Available: Yes

=== Library Operations ===
Book 'To Kill a Mockingbird' has been borrowed.
=== Book Information ===
Title: To Kill a Mockingbird
Author: Harper Lee
ISBN: 978-456789123
Price: $19.99
Available: No
Book 'To Kill a Mockingbird' has been returned.
=== Book Information ===
Title: To Kill a Mockingbird
Author: Harper Lee
ISBN: 978-456789123
Price: $19.99
Available: Yes
```

---

## Chapter 6: Library Classes

### 🎯 Revisiting Data Types in Java

Java has two main categories of data types:

#### Primitive Data Types
- **byte**: 8-bit integer (-128 to 127)
- **short**: 16-bit integer (-32,768 to 32,767)
- **int**: 32-bit integer (-2,147,483,648 to 2,147,483,647)
- **long**: 64-bit integer
- **float**: 32-bit floating point
- **double**: 64-bit floating point
- **char**: 16-bit Unicode character
- **boolean**: true or false

#### Reference Data Types
- Classes, Interfaces, Arrays

### 💻 Primitive Data Types Example

```java
public class DataTypesDemo {
    public static void main(String[] args) {
        // Primitive data types
        byte smallNumber = 127;
        short mediumNumber = 32000;
        int regularNumber = 2000000;
        long bigNumber = 9000000000L;
        
        float floatNumber = 3.14f;
        double doubleNumber = 3.14159265359;
        
        char singleCharacter = 'A';
        boolean isJavaFun = true;
        
        System.out.println("=== Primitive Data Types ===");
        System.out.println("byte: " + smallNumber);
        System.out.println("short: " + mediumNumber);
        System.out.println("int: " + regularNumber);
        System.out.println("long: " + bigNumber);
        System.out.println("float: " + floatNumber);
        System.out.println("double: " + doubleNumber);
        System.out.println("char: " + singleCharacter);
        System.out.println("boolean: " + isJavaFun);
        
        // Showing memory usage
        System.out.println("\n=== Memory Information ===");
        System.out.println("byte uses: 8 bits");
        System.out.println("short uses: 16 bits");
        System.out.println("int uses: 32 bits");
        System.out.println("long uses: 64 bits");
        System.out.println("float uses: 32 bits");
        System.out.println("double uses: 64 bits");
        System.out.println("char uses: 16 bits");
        System.out.println("boolean uses: 1 bit");
    }
}
```

**Sample Output:**
```
=== Primitive Data Types ===
byte: 127
short: 32000
int: 2000000
long: 9000000000
float: 3.14
double: 3.14159265359
char: A
boolean: true

=== Memory Information ===
byte uses: 8 bits
short uses: 16 bits
int uses: 32 bits
long uses: 64 bits
float uses: 32 bits
double uses: 64 bits
char uses: 16 bits
boolean uses: 1 bit
```

### 📦 Introduction to Wrapper Classes

Wrapper classes are object versions of primitive data types. They provide additional functionality and allow primitives to be used where objects are required.

#### Why Use Wrapper Classes?
1. **Collections**: ArrayList, HashMap, etc. can only store objects, not primitives
2. **Null values**: Primitives can't be null, but wrapper objects can
3. **Utility methods**: Wrapper classes provide useful methods for conversion, parsing, etc.

### 💻 Wrapper Classes Example

```java
public class WrapperClassesDemo {
    public static void main(String[] args) {
        // Primitive vs Wrapper Classes
        System.out.println("=== Primitive vs Wrapper Classes ===");
        
        // Primitives
        int primitiveInt = 42;
        double primitiveDouble = 3.14;
        boolean primitiveBoolean = true;
        char primitiveChar = 'A';
        
        // Wrapper Objects
        Integer wrapperInt = new Integer(42);  // or Integer.valueOf(42)
        Double wrapperDouble = new Double(3.14);
        Boolean wrapperBoolean = new Boolean(true);
        Character wrapperChar = new Character('A');
        
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapper Integer: " + wrapperInt);
        
        // Wrapper classes can be null
        Integer nullableInt = null;
        System.out.println("Nullable Integer: " + nullableInt);
        
        // int primitiveNullable = null; // This would cause error!
        
        System.out.println("\n=== Wrapper Class Methods ===");
        
        // Integer wrapper methods
        Integer num = 255;
        System.out.println("Original number: " + num);
        System.out.println("Binary representation: " + Integer.toBinaryString(num));
        System.out.println("Hex representation: " + Integer.toHexString(num));
        System.out.println("Octal representation: " + Integer.toOctalString(num));
        System.out.println("Max int value: " + Integer.MAX_VALUE);
        System.out.println("Min int value: " + Integer.MIN_VALUE);
        
        // Double wrapper methods
        Double decimal = 123.456;
        System.out.println("\nOriginal decimal: " + decimal);
        System.out.println("Is infinite? " + Double.isInfinite(decimal));
        System.out.println("Is NaN? " + Double.isNaN(decimal));
        System.out.println("Max double value: " + Double.MAX_VALUE);
        System.out.println("Min double value: " + Double.MIN_VALUE);
        
        // Character wrapper methods
        Character letter = 'g';
        System.out.println("\nOriginal character: " + letter);
        System.out.println("Is letter? " + Character.isLetter(letter));
        System.out.println("Is digit? " + Character.isDigit(letter));
        System.out.println("Is uppercase? " + Character.isUpperCase(letter));
        System.out.println("To uppercase: " + Character.toUpperCase(letter));
        System.out.println("Is whitespace? " + Character.isWhitespace(letter));
        
        // Boolean wrapper methods
        Boolean flag = true;
        System.out.println("\nOriginal boolean: " + flag);
        System.out.println("Boolean to string: " + Boolean.toString(flag));
        System.out.println("Parse 'false': " + Boolean.parseBoolean("false"));
        System.out.println("Parse 'true': " + Boolean.parseBoolean("true"));
    }
}
```

**Sample Output:**
```
=== Primitive vs Wrapper Classes ===
Primitive int: 42
Wrapper Integer: 42
Nullable Integer: null

=== Wrapper Class Methods ===
Original number: 255
Binary representation: 11111111
Hex representation: ff
Octal representation: 377
Max int value: 2147483647
Min int value: -2147483648

Original decimal: 123.456
Is infinite? false
Is NaN? false
Max double value: 1.7976931348623157E308
Min double value: 4.9E-324

Original character: g
Is letter? true
Is digit? false
Is uppercase? false
To uppercase: G
Is whitespace? false

Original boolean: true
Boolean to string: true
Parse 'false': false
Parse 'true': true
```

### 🔄 Autoboxing and Unboxing

**Autoboxing**: Automatic conversion from primitive to wrapper object
**Unboxing**: Automatic conversion from wrapper object to primitive

```java
import java.util.ArrayList;

public class AutoboxingDemo {
    public static void main(String[] args) {
        System.out.println("=== Autoboxing Examples ===");
        
        // Autoboxing - primitive to wrapper
        Integer autoBoxedInt = 100;  // int 100 becomes Integer(100)
        Double autoBoxedDouble = 25.5;  // double 25.5 becomes Double(25.5)
        Boolean autoBoxedBoolean = true;  // boolean true becomes Boolean(true)
        
        System.out.println("Autoboxed Integer: " + autoBoxedInt);
        System.out.println("Autoboxed Double: " + autoBoxedDouble);
        System.out.println("Autoboxed Boolean: " + autoBoxedBoolean);
        
        System.out.println("\n=== Unboxing Examples ===");
        
        // Unboxing - wrapper to primitive
        Integer wrapperNum = new Integer(200);
        int primitiveNum = wrapperNum;  // Integer becomes int
        
        Double wrapperDecimal = new Double(50.75);
        double primitiveDecimal = wrapperDecimal;  // Double becomes double
        
        System.out.println("Unboxed int: " + primitiveNum);
        System.out.println("Unboxed double: " + primitiveDecimal);
        
        System.out.println("\n=== Autoboxing with Collections ===");
        
        // ArrayList can only store objects, not primitives
        ArrayList<Integer> numberList = new ArrayList<>();
        
        // Autoboxing happens automatically when adding primitives
        numberList.add(10);    // int 10 becomes Integer(10)
        numberList.add(20);    // int 20 becomes Integer(20)
        numberList.add(30);    // int 30 becomes Integer(30)
        
        System.out.println("ArrayList contents: " + numberList);
        
        // Unboxing happens when retrieving
        int firstNumber = numberList.get(0);  // Integer becomes int
        int secondNumber = numberList.get(1); // Integer becomes int
        
        System.out.println("First number (unboxed): " + firstNumber);
        System.out.println("Second number (unboxed): " + secondNumber);
        
        // Autoboxing in method calls
        printInteger(50);  // int 50 is autoboxed to Integer
        int result = addTwoIntegers(Integer.valueOf(15), Integer.valueOf(25));
        System.out.println("Addition result: " + result);
        
        System.out.println("\n=== Performance Consideration ===");
        
        // Direct primitive operations (faster)
        int a = 1000;
        int b = 2000;
        int sum1 = a + b;
        System.out.println("Primitive addition: " + sum1);
        
        // Wrapper operations (slower due to boxing/unboxing)
        Integer x = 1000;  // Autoboxing
        Integer y = 2000;  // Autoboxing
        Integer sum2 = x + y;  // Unboxing, addition, then autoboxing
        System.out.println("Wrapper addition: " + sum2);
    }
    
    // Method that accepts Integer wrapper
    static void printInteger(Integer num) {
        System.out.println("Received Integer: " + num);
    }
    
    // Method that returns primitive but accepts wrappers
    static int addTwoIntegers(Integer a, Integer b) {
        return a + b;  // Unboxing happens automatically
    }
}
```

**Sample Output:**
```
=== Autoboxing Examples ===
Autoboxed Integer: 100
Autoboxed Double: 25.5
Autoboxed Boolean: true

=== Unboxing Examples ===
Unboxed int: 200
Unboxed double: 50.75

=== Autoboxing with Collections ===
ArrayList contents: [10, 20, 30]
First number (unboxed): 10
Second number (unboxed): 20
Received Integer: 50
Addition result: 40

=== Performance Consideration ===
Primitive addition: 3000
Wrapper addition: 3000
```

### 🛠️ Practical Wrapper Class Methods

```java
public class WrapperMethodsDemo {
    public static void main(String[] args) {
        System.out.println("=== String to Number Conversion ===");
        
        // Parsing strings to numbers
        String intString = "123";
        String doubleString = "45.67";
        String booleanString = "true";
        
        int parsedInt = Integer.parseInt(intString);
        double parsedDouble = Double.parseDouble(doubleString);
        boolean parsedBoolean = Boolean.parseBoolean(booleanString);
        
        System.out.println("Parsed int: " + parsedInt);
        System.out.println("Parsed double: " + parsedDouble);
        System.out.println("Parsed boolean: " + parsedBoolean);
        
        // Using valueOf methods
        Integer valueOfInt = Integer.valueOf("456");
        Double valueOfDouble = Double.valueOf("78.90");
        
        System.out.println("valueOf int: " + valueOfInt);
        System.out.println("valueOf double: " + valueOfDouble);
        
        System.out.println("\n=== Number to String Conversion ===");
        
        int number = 789;
        double decimal = 12.34;
        boolean flag = false;
        
        String intToString = Integer.toString(number);
        String doubleToString = Double.toString(decimal);
        String booleanToString = Boolean.toString(flag);
        
        System.out.println("Int to string: " + intToString);
        System.out.println("Double to string: " + doubleToString);
        System.out.println("Boolean to string: " + booleanToString);
        
        System.out.println("\n=== Comparison Methods ===");
        
        Integer num1 = 100;
        Integer num2 = 200;
        Integer num3 = 100;
        
        System.out.println("num1.equals(num2): " + num1.equals(num2));
        System.out.println("num1.equals(num3): " + num1.equals(num3));
        System.out.println("Integer.compare(num1, num2): " + Integer.compare(num1, num2));
        System.out.println("num1.compareTo(num2): " + num1.compareTo(num2));
        
        System.out.println("\n=== Utility Methods ===");
        
        // Integer utility methods
        System.out.println("Max of 50, 75: " + Integer.max(50, 75));
        System.out.println("Min of 50, 75: " + Integer.min(50, 75));
        System.out.println("Sum of 25, 35: " + Integer.sum(25, 35));
        
        // Double utility methods
        System.out.println("Max of 12.5, 8.9: " + Double.max(12.5, 8.9));
        System.out.println("Min of 12.5, 8.9: " + Double.min(12.5, 8.9));
        System.out.println("Sum of 5.5, 3.3: " + Double.sum(5.5, 3.3));
        
        // Character utility methods
        char ch = '5';
        System.out.println("Character '5' is digit: " + Character.isDigit(ch));
        System.out.println("Character '5' numeric value: " + Character.getNumericValue(ch));
        
        System.out.println("\n=== Error Handling ===");
        
        try {
            // This will cause NumberFormatException
            int invalidNumber = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Error: Cannot convert 'abc' to integer");
        }
        
        try {
            // This will cause NumberFormatException
            double invalidDouble = Double.parseDouble("xyz");
        } catch (NumberFormatException e) {
            System.out.println("Error: Cannot convert 'xyz' to double");
        }
    }
}
```

**Sample Output:**
```
=== String to Number Conversion ===
Parsed int: 123
Parsed double: 45.67
Parsed boolean: true
valueOf int: 456
valueOf double: 78.9

=== Number to String Conversion ===
Int to string: 789
Double to string: 12.34
Boolean to string: false

=== Comparison Methods ===
num1.equals(num2): false
num1.equals(num3): true
Integer.compare(num1, num2): -1
num1.compareTo(num2): -1

=== Utility Methods ===
Max of 50, 75: 75
Min of 50, 75: 50
Sum of 25, 35: 60
Max of 12.5, 8.9: 12.5
Min of 12.5, 8.9: 8.9
Sum of 5.5, 3.3: 8.8
Character '5' is digit: true
Character '5' numeric value: 5

=== Error Handling ===
Error: Cannot convert 'abc' to integer
Error: Cannot convert 'xyz' to double
```

### 🏪 Practical Example: Shopping Cart with Wrapper Classes

```java
import java.util.ArrayList;

class Product {
    String name;
    Double price;
    Integer quantity;
    Boolean inStock;
    
    Product(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.inStock = quantity > 0;
    }
    
    void displayProduct() {
        System.out.println("Product: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("In Stock: " + inStock);
        System.out.println("---");
    }
    
    Boolean updateStock(Integer newQuantity) {
        if (newQuantity >= 0) {
            quantity = newQuantity;
            inStock = quantity > 0;
            return true;
        }
        return false;
    }
    
    Double calculateTotal() {
        return price * quantity;
    }
}

class ShoppingCart {
    ArrayList<Product> products;
    
    ShoppingCart() {
        products = new ArrayList<>();
    }
    
    void addProduct(String name, String priceStr, String quantityStr) {
        try {
            Double price = Double.parseDouble(priceStr);
            Integer quantity = Integer.parseInt(quantityStr);
            
            Product product = new Product(name, price, quantity);
            products.add(product);
            System.out.println("Added: " + name + " to cart");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid price or quantity format");
        }
    }
    
    void displayCart() {
        System.out.println("=== Shopping Cart ===");
        if (products.isEmpty()) {
            System.out.println("Cart is empty");
            return;
        }
        
        for (Product product : products) {
            product.displayProduct();
        }
    }
    
    Double calculateTotalBill() {
        Double total = 0.0;
        for (Product product : products) {
            total += product.calculateTotal();
        }
        return total;
    }
    
    void generateBill() {
        System.out.println("=== BILL ===");
        Double subtotal = 0.0;
        
        for (Product product : products) {
            Double productTotal = product.calculateTotal();
            System.out.println(product.name + " x" + product.quantity + 
                             " = $" + productTotal);
            subtotal += productTotal;
        }
        
        Double tax = subtotal * 0.08; // 8% tax
        Double total = subtotal + tax;
        
        System.out.println("---");
        System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
        System.out.println("Tax (8%): $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", total));
    }
}

public class ShoppingCartDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        
        System.out.println("=== Adding Products to Cart ===");
        cart.addProduct("Laptop", "999.99", "1");
        cart.addProduct("Mouse", "25.50", "2");
        cart.addProduct("Keyboard", "75.00", "1");
        cart.addProduct("Monitor", "299.99", "1");
        
        // Try to add invalid product
        cart.addProduct("Invalid Item", "abc", "xyz");
        
        System.out.println("\n");
        cart.displayCart();
        
        System.out.println("\nTotal Bill: $" + 
                         String.format("%.2f", cart.calculateTotalBill()));
        
        System.out.println("\n");
        cart.generateBill();
        
        // Demonstrate wrapper class methods
        System.out.println("\n=== Wrapper Class Demonstrations ===");
        Integer totalItems = 0;
        Double averagePrice = 0.0;
        
        for (Product product : cart.products) {
            totalItems += product.quantity;
            averagePrice += product.price;
        }
        
        averagePrice = averagePrice / cart.products.size();
        
        System.out.println("Total items in cart: " + totalItems);
        System.out.println("Average price: $" + String.format("%.2f", averagePrice));
        System.out.println("Most expensive item: $" + 
                         cart.products.stream()
                             .mapToDouble(p -> p.price)
                             .max().orElse(0.0));
    }
}
```

**Sample Output:**
```
=== Adding Products to Cart ===
Added: Laptop to cart
Added: Mouse to cart
Added: Keyboard to cart
Added: Monitor to cart
Error: Invalid price or quantity format

=== Shopping Cart ===
Product: Laptop
Price: $999.99
Quantity: 1
In Stock: true
---
Product: Mouse
Price: $25.5
Quantity: 2
In Stock: true
---
Product: Keyboard
Price: $75.0
Quantity: 1
In Stock: true
---
Product: Monitor
Price: $299.99
Quantity: 1
In Stock: true
---

Total Bill: $1426.48

=== BILL ===
Laptop x1 = $999.99
Mouse x2 = $51.0
Keyboard x1 = $75.0
Monitor x1 = $299.99
---
Subtotal: $1425.98
Tax (8%): $114.08
Total: $1540.06

=== Wrapper Class Demonstrations ===
Total items in cart: 5
Average price: $350.12
Most expensive item: $999.99
```

---

## Chapter 7: Encapsulation

### 🎯 What is Encapsulation?

Encapsulation is the practice of bundling data (variables) and the methods that operate on that data into a single unit (a class). It's like a protective capsule that hides the internal details and only exposes what's necessary.

**Key Goals:**
1. **Data Hiding**: Protect data from unauthorized access.
2. **Control**: Control how data is accessed and modified.
3. **Flexibility**: Change internal implementation without affecting other parts of the code.

### 🔐 Access Specifiers

Access specifiers control the visibility of classes, variables, and methods.

| Specifier  | Visibility                               |
|------------|------------------------------------------|
| `public`   | Accessible from anywhere                 |
| `protected`| Accessible within the same package and by subclasses |
| `default`  | Accessible only within the same package  |
| `private`  | Accessible only within the same class    |

### 💻 Access Specifiers Example

```java
// In a file named Employee.java
package company;

public class Employee {
    // public: accessible everywhere
    public String name;
    
    // protected: accessible in company package and subclasses
    protected double salary;
    
    // default: accessible only in company package
    String department;
    
    // private: accessible only within Employee class
    private int employeeId;
    
    public Employee(String name, double salary, String department, int id) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.employeeId = id;
    }
    
    // public method to access private data
    public int getEmployeeId() {
        return employeeId;
    }
    
    // public method to display info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("Employee ID: " + getEmployeeId());
    }
}

// In a file named Manager.java (in the same package)
package company;

public class Manager extends Employee {
    public Manager(String name, double salary, String department, int id) {
        super(name, salary, department, id);
    }
    
    public void giveRaise(double amount) {
        // Can access protected 'salary'
        salary += amount;
        System.out.println("Salary increased to: " + salary);
    }
}

// In a file named Main.java (in a different package)
package main;
import company.Employee;
import company.Manager;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 50000, "IT", 101);
        
        // Accessing public member
        System.out.println("Employee Name: " + emp.name);
        
        // Cannot access protected, default, or private members directly
        // System.out.println(emp.salary); // Error
        // System.out.println(emp.department); // Error
        // System.out.println(emp.employeeId); // Error
        
        // Accessing private data via public method
        System.out.println("Employee ID: " + emp.getEmployeeId());
        
        Manager mgr = new Manager("Jane Smith", 80000, "Management", 201);
        mgr.giveRaise(5000);
        mgr.displayInfo();
    }
}
```

**Sample Output:**
```
Employee Name: John Doe
Employee ID: 101
Salary increased to: 85000.0
Name: Jane Smith
Salary: 85000.0
Department: Management
Employee ID: 201
```

### 🌐 Scope of Variables

#### 1. Instance Variables
- Declared inside a class but outside any method
- Each object has its own copy
- Scope is the entire lifetime of the object

#### 2. Class (Static) Variables
- Declared with the `static` keyword
- Shared among all objects of the class
- Scope is the entire lifetime of the program

#### 3. Local Variables
- Declared inside a method or block
- Scope is limited to that method or block

### 💻 Scope Example

```java
class ScopeExample {
    // Instance variable
    String instanceVar = "I am an instance variable";
    
    // Class (static) variable
    static String staticVar = "I am a static variable";
    
    void myMethod(String paramVar) {
        // Local variable
        String localVar = "I am a local variable";
        
        System.out.println("--- Inside myMethod ---");
        System.out.println(instanceVar); // Accessible
        System.out.println(staticVar);   // Accessible
        System.out.println(paramVar);    // Accessible
        System.out.println(localVar);    // Accessible
        
        if (true) {
            // Block-level local variable
            String blockVar = "I am a block variable";
            System.out.println(blockVar); // Accessible
        }
        
        // System.out.println(blockVar); // Error: Not accessible here
    }
    
    void anotherMethod() {
        System.out.println("--- Inside anotherMethod ---");
        System.out.println(instanceVar); // Accessible
        System.out.println(staticVar);   // Accessible
        // System.out.println(paramVar); // Error: Not accessible here
        // System.out.println(localVar); // Error: Not accessible here
    }
}

public class ScopeDemo {
    public static void main(String[] args) {
        ScopeExample obj1 = new ScopeExample();
        ScopeExample obj2 = new ScopeExample();
        
        System.out.println("=== Accessing Variables ===");
        
        // Accessing static variable
        System.out.println(ScopeExample.staticVar);
        
        // Accessing instance variables
        System.out.println("Obj1: " + obj1.instanceVar);
        System.out.println("Obj2: " + obj2.instanceVar);
        
        // Modifying variables
        obj1.instanceVar = "Modified instance for obj1";
        ScopeExample.staticVar = "Modified static variable";
        
        System.out.println("\n=== After Modification ===");
        System.out.println("Obj1: " + obj1.instanceVar);
        System.out.println("Obj2: " + obj2.instanceVar); // Unchanged
        System.out.println("Static: " + ScopeExample.staticVar); // Changed for all
        
        System.out.println("\n=== Method Scopes ===");
        obj1.myMethod("I am a parameter");
        obj1.anotherMethod();
    }
}
```

**Sample Output:**
```
=== Accessing Variables ===
I am a static variable
Obj1: I am an instance variable
Obj2: I am an instance variable

=== After Modification ===
Obj1: Modified instance for obj1
Obj2: I am an instance variable
Static: Modified static variable

=== Method Scopes ===
--- Inside myMethod ---
Modified instance for obj1
Modified static variable
I am a parameter
I am a local variable
I am a block variable
--- Inside anotherMethod ---
Modified instance for obj1
Modified static variable
```

### 캡슐 Practical Example: Encapsulated Person Class

```java
class Person {
    // Private data - hidden from outside
    private String name;
    private int age;
    private String email;
    
    public Person(String name, int age, String email) {
        this.name = name;
        // Use setter for validation
        setAge(age);
        setEmail(email);
    }
    
    // Public getter for name
    public String getName() {
        return name;
    }
    
    // Public setter for name
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Error: Name cannot be empty.");
        }
    }
    
    // Public getter for age
    public int getAge() {
        return age;
    }
    
    // Public setter for age with validation
    public void setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            System.out.println("Error: Invalid age. Must be between 1 and 119.");
        }
    }
    
    // Public getter for email
    public String getEmail() {
        return email;
    }
    
    // Public setter for email with validation
    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Error: Invalid email format.");
        }
    }
    
    // Public method to display info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        // Creating a person object
        Person person = new Person("Alice", 30, "alice@example.com");
        
        System.out.println("=== Initial Information ===");
        person.displayInfo();
        
        // Accessing data via public getters
        System.out.println("\nGetting name: " + person.getName());
        
        // Modifying data via public setters
        System.out.println("\n=== Modifying Information ===");
        person.setAge(31);
        person.setEmail("new.alice@example.com");
        person.displayInfo();
        
        // Trying to set invalid data
        System.out.println("\n=== Trying Invalid Updates ===");
        person.setAge(-5); // This will fail
        person.setEmail("invalid-email"); // This will fail
        person.setName(""); // This will fail
        
        // Display info again to show data was not changed
        System.out.println("\nFinal Information:");
        person.displayInfo();
    }
}
```

**Sample Output:**
```
=== Initial Information ===
Name: Alice
Age: 30
Email: alice@example.com

Getting name: Alice

=== Modifying Information ===
Name: Alice
Age: 31
Email: new.alice@example.com

=== Trying Invalid Updates ===
Error: Invalid age. Must be between 1 and 119.
Error: Invalid email format.
Error: Name cannot be empty.

Final Information:
Name: Alice
Age: 31
Email: new.alice@example.com
```

---

## Chapter 8: Arrays

### 🎯 What are Arrays?

An array is a collection of similar data types stored in contiguous memory locations. Think of it as a numbered list of items.

### 📖 Array Declaration and Initialization

#### Single-Dimensional Arrays

```java
public class SingleDimArrayDemo {
    public static void main(String[] args) {
        // Declaration
        int[] numbers;
        
        // Initialization (Method 1: with size)
        numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        
        System.out.println("=== Array initialized with size ===");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        
        // Initialization (Method 2: with values)
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};
        
        System.out.println("\n=== Array initialized with values ===");
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
        
        // Accessing elements
        System.out.println("\nFirst fruit: " + fruits[0]);
        System.out.println("Last fruit: " + fruits[fruits.length - 1]);
        
        // Modifying an element
        fruits[1] = "Blueberry";
        System.out.println("Modified second fruit: " + fruits[1]);
    }
}
```

**Sample Output:**
```
=== Array initialized with size ===
Element at index 0: 10
Element at index 1: 20
Element at index 2: 30
Element at index 3: 40
Element at index 4: 50

=== Array initialized with values ===
Fruit: Apple
Fruit: Banana
Fruit: Cherry
Fruit: Date

First fruit: Apple
Last fruit: Date
Modified second fruit: Blueberry
```

#### Double-Dimensional Arrays (2D Arrays)

A 2D array is an array of arrays, like a grid or a table.

```java
public class DoubleDimArrayDemo {
    public static void main(String[] args) {
        // Declaration and initialization
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("=== 2D Array (Matrix) ===");
        
        // Accessing and printing elements
        for (int i = 0; i < matrix.length; i++) { // Loop through rows
            for (int j = 0; j < matrix[i].length; j++) { // Loop through columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // New line for each row
        }
        
        // Accessing a specific element
        System.out.println("\nElement at row 1, column 2: " + matrix[1][2]);
        
        // Modifying an element
        matrix[0][0] = 99;
        System.out.println("Modified element at row 0, column 0: " + matrix[0][0]);
        
        // Jagged array (rows with different lengths)
        int[][] jaggedArray = {
            {1, 2},
            {3, 4, 5},
            {6, 7, 8, 9}
        };
        
        System.out.println("\n=== Jagged 2D Array ===");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

**Sample Output:**
```
=== 2D Array (Matrix) ===
1 2 3 
4 5 6 
7 8 9 

Element at row 1, column 2: 6
Modified element at row 0, column 0: 99

=== Jagged 2D Array ===
1 2 
3 4 5 
6 7 8 9 
```

### 🔍 Array Operations and Algorithms

#### Searching: Linear Search

```java
public class LinearSearchDemo {
    public static void main(String[] args) {
        int[] numbers = {45, 23, 67, 89, 12, 56, 78};
        int target = 12;
        
        int index = linearSearch(numbers, target);
        
        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
        
        target = 99;
        index = linearSearch(numbers, target);
        
        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
    
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return index if found
            }
        }
        return -1; // Return -1 if not found
    }
}
```

**Sample Output:**
```
Element 12 found at index: 4
Element 99 not found in the array.
```

#### Sorting: Bubble Sort

```java
import java.util.Arrays;

public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Original array: " + Arrays.toString(numbers));
        
        bubbleSort(numbers);
        
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
```

**Sample Output:**
```
Original array: [64, 34, 25, 12, 22, 11, 90]
Sorted array: [11, 12, 22, 25, 34, 64, 90]
```

---

## Chapter 9: String Handling

### 🎯 Introduction to Strings

A `String` in Java is an object that represents a sequence of characters. Strings are immutable, meaning once created, their value cannot be changed.

### 📖 String Class Methods

```java
public class StringMethodsDemo {
    public static void main(String[] args) {
        String text = "  Hello, World! This is Java.  ";
        
        System.out.println("Original String: '" + text + "'");
        
        // length()
        System.out.println("1. Length: " + text.length());
        
        // charAt()
        System.out.println("2. Character at index 8: " + text.charAt(8));
        
        // substring()
        System.out.println("3. Substring from index 9 to 14: " + text.substring(9, 14));
        
        // toUpperCase() and toLowerCase()
        System.out.println("4. Uppercase: " + text.toUpperCase());
        System.out.println("5. Lowercase: " + text.toLowerCase());
        
        // indexOf() and lastIndexOf()
        System.out.println("6. Index of 'o': " + text.indexOf('o'));
        System.out.println("7. Last index of 'o': " + text.lastIndexOf('o'));
        
        // equals() and equalsIgnoreCase()
        String anotherText = "  hello, world! this is java.  ";
        System.out.println("8. equals(): " + text.equals(anotherText));
        System.out.println("9. equalsIgnoreCase(): " + text.equalsIgnoreCase(anotherText));
        
        // startsWith() and endsWith()
        System.out.println("10. startsWith('  Hello'): " + text.startsWith("  Hello"));
        System.out.println("11. endsWith('Java.  '): " + text.endsWith("Java.  "));
        
        // replace()
        System.out.println("12. replace 'Java' with 'Python': " + text.replace("Java", "Python"));
        
        // trim()
        System.out.println("13. trim(): '" + text.trim() + "'");
        
        // split()
        String sentence = "This is a sample sentence.";
        String[] words = sentence.split(" ");
        System.out.println("14. split(): ");
        for (String word : words) {
            System.out.println("   - " + word);
        }
        
        // contains()
        System.out.println("15. contains('World'): " + text.contains("World"));
        
        // isEmpty()
        String emptyStr = "";
        System.out.println("16. isEmpty(): " + emptyStr.isEmpty());
    }
}
```

**Sample Output:**
```
Original String: '  Hello, World! This is Java.  '
1. Length: 31
2. Character at index 8: W
3. Substring from index 9 to 14: orld!
4. Uppercase:   HELLO, WORLD! THIS IS JAVA.  
5. Lowercase:   hello, world! this is java.  
6. Index of 'o': 6
7. Last index of 'o': 10
8. equals(): false
9. equalsIgnoreCase(): true
10. startsWith('  Hello'): true
11. endsWith('Java.  '): true
12. replace 'Java' with 'Python':   Hello, World! This is Python.  
13. trim(): 'Hello, World! This is Java.'
14. split(): 
   - This
   - is
   - a
   - sample
   - sentence.
15. contains('World'): true
16. isEmpty(): true
```

### ⛓️ String Arrays

An array of strings is a collection of string objects.

```java
public class StringArrayDemo {
    public static void main(String[] args) {
        // Creating a string array
        String[] studentNames = {"Alice", "Bob", "Charlie", "David", "Eve"};
        
        System.out.println("=== List of Students ===");
        for (String name : studentNames) {
            System.out.println("- " + name);
        }
        
        // Finding the longest name
        String longestName = "";
        for (String name : studentNames) {
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }
        System.out.println("\nLongest name is: " + longestName);
        
        // Counting names that start with 'A'
        int count = 0;
        for (String name : studentNames) {
            if (name.startsWith("A")) {
                count++;
            }
        }
        System.out.println("Number of names starting with 'A': " + count);
        
        // Creating a sentence from the array
        String sentence = String.join(", ", studentNames);
        System.out.println("\nJoined sentence: " + sentence);
    }
}
```

**Sample Output:**
```
=== List of Students ===
- Alice
- Bob
- Charlie
- David
- Eve

Longest name is: Charlie
Number of names starting with 'A': 1

Joined sentence: Alice, Bob, Charlie, David, Eve
```

---