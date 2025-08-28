# Class 10 Java - Complete Notes and Code Examples

Welcome to the complete repository for the Class 10 Java curriculum. This project provides comprehensive notes and practical, commented code examples for all major topics, structured to make learning easy and effective.

## 📚 Course Notes

For a detailed explanation of all concepts, please refer to the main notes file. This document covers the theory behind each chapter in an easy-to-understand format with sample code snippets and outputs.

*   **[Full Course Notes (Java10thNotes.md)](Java10thNotes.md)**

## 💻 Code Examples

All code examples are organized by chapter. Each Java file is heavily commented to explain the concepts and logic step-by-step. Click on the file names below to see the code.

### Chapter 3: Objects and Classes
*   [`StudentDemo.java`](Chapter3_ObjectsAndClasses/StudentDemo.java) - Demonstrates basic object and class creation.
*   [`CarFactory.java`](Chapter3_ObjectsAndClasses/CarFactory.java) - Shows how a class acts as an object factory.
*   [`BankDemo.java`](Chapter3_ObjectsAndClasses/BankDemo.java) - A real-world example of a bank account.

### Chapter 4: User-defined Methods
*   [`NoParameterDemo.java`](Chapter4_UserDefinedMethods/NoParameterDemo.java) - Methods without parameters.
*   [`ParameterDemo.java`](Chapter4_UserDefinedMethods/ParameterDemo.java) - Methods with parameters.
*   [`ReturnDemo.java`](Chapter4_UserDefinedMethods/ReturnDemo.java) - Methods that return values.
*   [`PureImpureDemo.java`](Chapter4_UserDefinedMethods/PureImpureDemo.java) - Explains pure and impure methods.
*   [`StaticDemo.java`](Chapter4_UserDefinedMethods/StaticDemo.java) - Static vs. non-static members.
*   [`OverloadingDemo.java`](Chapter4_UserDefinedMethods/OverloadingDemo.java) - Demonstrates method overloading.

### Chapter 5: Constructors
*   [`ConstructorDemo.java`](Chapter5_Constructors/ConstructorDemo.java) - Basic constructor usage.
*   [`ParameterizedConstructorDemo.java`](Chapter5_Constructors/ParameterizedConstructorDemo.java) - Constructors with parameters.
*   [`ConstructorOverloadingDemo.java`](Chapter5_Constructors/ConstructorOverloadingDemo.java) - Overloading constructors.
*   [`ConstructorVsMethodDemo.java`](Chapter5_Constructors/ConstructorVsMethodDemo.java) - Key differences between constructors and methods.
*   [`LibraryDemo.java`](Chapter5_Constructors/LibraryDemo.java) - A practical example of a library system.

### Chapter 6: Library Classes
*   [`DataTypesDemo.java`](Chapter6_LibraryClasses/DataTypesDemo.java) - A review of primitive data types.
*   [`WrapperClassesDemo.java`](Chapter6_LibraryClasses/WrapperClassesDemo.java) - Introduction to wrapper classes.
*   [`AutoboxingDemo.java`](Chapter6_LibraryClasses/AutoboxingDemo.java) - Autoboxing and unboxing concepts.
*   [`WrapperMethodsDemo.java`](Chapter6_LibraryClasses/WrapperMethodsDemo.java) - Useful methods of wrapper classes.
*   [`ShoppingCartDemo.java`](Chapter6_LibraryClasses/ShoppingCartDemo.java) - A practical example using wrapper classes.

### Chapter 7: Encapsulation
*   [`EncapsulationDemo.java`](Chapter7_Encapsulation/EncapsulationDemo.java) - Demonstrates data hiding with getters and setters.
*   [`ScopeDemo.java`](Chapter7_Encapsulation/ScopeDemo.java) - Explains instance, class, and local variable scopes.
*   [`AccessSpecifierDemo.java`](Chapter7_Encapsulation/AccessSpecifierDemo.java) - Shows how `public`, `protected`, `default`, and `private` work.
    *   [`company/Employee.java`](Chapter7_Encapsulation/company/Employee.java)
    *   [`company/Manager.java`](Chapter7_Encapsulation/company/Manager.java)

### Chapter 8: Arrays
*   [`SingleDimArrayDemo.java`](Chapter8_Arrays/SingleDimArrayDemo.java) - Working with single-dimensional arrays.
*   [`DoubleDimArrayDemo.java`](Chapter8_Arrays/DoubleDimArrayDemo.java) - Working with 2D arrays (matrices and jagged arrays).
*   [`LinearSearchDemo.java`](Chapter8_Arrays/LinearSearchDemo.java) - Implementing the linear search algorithm.
*   [`BubbleSortDemo.java`](Chapter8_Arrays/BubbleSortDemo.java) - Implementing the bubble sort algorithm.

### Chapter 9: String Handling
*   [`StringMethodsDemo.java`](Chapter9_StringHandling/StringMethodsDemo.java) - A comprehensive showcase of common `String` class methods.
*   [`StringArrayDemo.java`](Chapter9_StringHandling/StringArrayDemo.java) - Demonstrates how to work with arrays of strings.

---

## 🚀 How to Run the Code

To compile and run these Java files, you need to have the **Java Development Kit (JDK)** installed on your computer.

### Prerequisites

*   [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) (version 8 or higher recommended).

### Instructions

You can run the files from your terminal (like Command Prompt, PowerShell, or Git Bash).

1.  **Open a terminal** and navigate to the root directory of this project (`e:\JAVA 10th`).

2.  **Compile the Java file**. You need to include the chapter directory in the path.
    *   **Syntax**: `javac <ChapterDirectory>\<FileName>.java`
    *   **Example**: To compile `StudentDemo.java` from Chapter 3, use the command:
        ```sh
        javac Chapter3_ObjectsAndClasses\StudentDemo.java
        ```

3.  **Run the compiled code**. When running, use the full package name (directory and file name without the `.java` extension).
    *   **Syntax**: `java <ChapterDirectory>.<FileName>`
    *   **Example**: To run the `StudentDemo` program, use the command:
        ```sh
        java Chapter3_ObjectsAndClasses.StudentDemo
        ```

#### Example for Chapter 7 (with packages)

The `AccessSpecifierDemo` in Chapter 7 depends on files in the `company` sub-package. You need to compile all related files.

1.  **Compile**:
    ```sh
    javac Chapter7_Encapsulation\AccessSpecifierDemo.java Chapter7_Encapsulation\company\Employee.java Chapter7_Encapsulation\company\Manager.java
    ```

2.  **Run**:
    ```sh
    java Chapter7_Encapsulation.AccessSpecifierDemo
    ```

---
This project is designed to be a one-stop resource for your Class 10 Java studies. Happy coding!
