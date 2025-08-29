# Class 9 Java - Complete Notes and Code Examples

Welcome to the complete repository for the Class 9 Java curriculum. This project provides comprehensive notes and practical, commented code examples for all major topics, structured to make learning easy and effective.

---

## 📚 Course Notes & Code Examples

Below are the notes for each chapter, along with links to the commented Java code examples. Click on the file names to see the code.

### Chapter 1: Object-Oriented Programming (OOP) Concepts

This chapter is theoretical and introduces the fundamental ideas behind programming.

*   **1.1 Introduction to Programming Languages**:
    *   **Low-Level Languages**: Machine Language (0s and 1s) and Assembly Language (mnemonics). Hard for humans to read.
    *   **High-Level Languages**: Like Java, Python, C++. Use English-like words, making them easier for humans to write and understand.

*   **1.2 Procedure-Oriented Programming (POP)**:
    *   Focuses on procedures or functions (a sequence of steps).
    *   Data and functions are separate. Data is often global and can be accessed by any function, which can be risky.
    *   Example: C, Pascal.

*   **1.3 Object-Oriented Programming (OOP)**:
    *   Focuses on **objects**, which bundle data and the functions that operate on that data.
    *   This is the modern approach used by Java. It improves security and organization.

*   **1.4 Difference between POP and OOP**:

| Feature      | Procedure-Oriented (POP)          | Object-Oriented (OOP)             |
| :----------- | :-------------------------------- | :-------------------------------- |
| **Focus**    | On functions/procedures           | On objects                        |
| **Data**     | Data is separate from functions   | Data and functions are bundled    |
| **Security** | Less secure; data is exposed      | More secure; data is hidden       |
| **Approach** | Top-down                          | Bottom-up                         |
| **Example**  | C, Fortran                        | Java, C++, Python                 |

*   **1.5 Principles of OOP**:
    *   **Encapsulation**: Wrapping data and methods into a single unit (a class). Like a capsule.
    *   **Abstraction**: Hiding complex details and showing only essential features. A car driver knows how to use the steering wheel but doesn't need to know how the engine works.
    *   **Inheritance**: A new class can inherit properties from an existing class. This promotes code reuse.
    *   **Polymorphism**: An object can take many forms. A `+` operator can add numbers or concatenate strings.

*   **1.7 History of Java**:
    *   Created by James Gosling at Sun Microsystems in 1995.
    *   Originally called "Oak".
    *   Motto: "Write Once, Run Anywhere" (WORA).

*   **1.9 Java Compilation**:
    *   **JDK (Java Development Kit)**: The toolset for compiling and running Java code.
    *   **JVM (Java Virtual Machine)**: An abstract machine that runs Java bytecode. It's why Java can run on any platform (Windows, Mac, etc.).
    *   **Process**: `MyCode.java` -> (Compiler) -> `MyCode.class` (Bytecode) -> (JVM) -> Runs on your machine.

*   **1.10 Introduction to BlueJ**:
    *   An IDE (Integrated Development Environment) designed for beginners to learn Java. It provides a simple interface to write and run code.

---

### Chapter 2: Elementary Concept of Objects and Classes

This chapter introduces the basic building blocks of OOP in Java.

*   **2.2 Objects**:
    *   An object is a real-world entity (like a pen, car, or dog) that has a **state** (data/properties) and **behavior** (methods/actions).
    *   **Example**: A `Dog` object has a state (color, breed, age) and behavior (bark, eat, sleep).

*   **2.3 Class**:
    *   A class is a **blueprint** or template for creating objects.
    *   The `Dog` class defines what every dog object will have.

*   **Code Examples**:
    *   [`Dog.java`](Chapter2_Objects_And_Classes/Dog.java) - The blueprint for a Dog object.
    *   [`DogDemo.java`](Chapter2_Objects_And_Classes/DogDemo.java) - Creating and using Dog objects.

---

### Chapter 3: Values and Data Types

This chapter covers the fundamental data that Java can work with.

*   **3.3 Tokens**: The smallest elements of a program (keywords, identifiers, literals, etc.).
*   **3.4 Data Types**:
    *   **Primitive Types**: Basic types built into Java.
        *   `byte`, `short`, `int`, `long` (for whole numbers).
        *   `float`, `double` (for decimal numbers).
        *   `char` (for a single character, e.g., 'A').
        *   `boolean` (for `true` or `false`).
    *   **Non-Primitive (Reference) Types**: Objects, Arrays, and Strings.

*   **3.5 Variables**: A named memory location that stores a value (e.g., `int age = 14;`).
*   **3.6 Constants**: A variable whose value cannot be changed, declared with the `final` keyword (e.g., `final double PI = 3.14;`).
*   **3.7 Type Conversion**:
    *   **Implicit (Widening)**: Converting a smaller type to a larger type (e.g., `int` to `double`). Done automatically.
    *   **Explicit (Narrowing)**: Converting a larger type to a smaller type (e.g., `double` to `int`). Requires a manual "cast" and may lose data.

*   **Code Examples**:
    *   [`DataTypes.java`](Chapter3_Values_And_DataTypes/DataTypes.java) - Demonstrates all primitive data types.
    *   [`TypeConversion.java`](Chapter3_Values_And_DataTypes/TypeConversion.java) - Shows implicit and explicit type casting.

---

### Chapter 4: Operators in Java

Operators are special symbols that perform operations on variables and values.

*   **4.3 Types of Operators**:
    *   **Arithmetic**: `+`, `-`, `*`, `/`, `%` (modulus/remainder).
    *   **Relational**: `==`, `!=`, `>`, `<`, `>=`, `<=` (used for comparison, result in a boolean).
    *   **Logical**: `&&` (AND), `||` (OR), `!` (NOT) (combine boolean expressions).
    *   **Unary**: `++` (increment), `--` (decrement).
    *   **Assignment**: `=`, `+=`, `-=`, `*=`, `/=`.

*   **4.4 Precedence**: The order in which operators are evaluated (e.g., `*` and `/` before `+` and `-`).

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

*   **Code Examples**:
    *   [`ArithmeticOperators.java`](Chapter4_Operators/ArithmeticOperators.java)
    *   [`RelationalLogicalOperators.java`](Chapter4_Operators/RelationalLogicalOperators.java)
    *   [`UnaryOperators.java`](Chapter4_Operators/UnaryOperators.java)

---

### Chapter 5: Input in Java

How to get input from the user.

*   **5.3 Packages**: A way to group related classes (e.g., `java.util`).
*   **5.5 Input using `Scanner` Class**:
    *   The most common way to get user input.
    *   You must import it: `import java.util.Scanner;`.
*   **5.7 Types of Errors**:
    *   **Syntax Error**: A mistake in the code's structure (like a missing semicolon). The code won't compile.
    *   **Runtime Error**: An error that happens while the program is running (like dividing by zero).
    *   **Logical Error**: The code runs, but produces the wrong result.
*   **5.8 Comments**: Notes in the code that are ignored by the compiler.
    *   `// Single-line comment`
    *   `/* Multi-line comment */`

*   **Code Examples**:
    *   [`ScannerInput.java`](Chapter5_Input/ScannerInput.java) - Reading user input.
    *   [`ParameterInput.java`](Chapter5_Input/ParameterInput.java) - Passing data to methods.
    *   [`Comments.java`](Chapter5_Input/Comments.java) - How to use comments.

---

### Chapter 6: Mathematical Library Methods

Using pre-built math functions from Java's `Math` class.

*   All methods in the `Math` class are `static`, so you call them directly on the class (e.g., `Math.sqrt()`).
*   **Common Functions**:
    *   `Math.sqrt(x)`: Square root.
    *   `Math.pow(a, b)`: `a` raised to the power of `b`.
    *   `Math.abs(x)`: Absolute (positive) value.
    *   `Math.max(a, b)` / `Math.min(a, b)`: Finds the larger or smaller of two numbers.
    *   `Math.random()`: Generates a random double between 0.0 and 1.0.

*   **Code Example**:
    *   [`MathMethods.java`](Chapter6_Math_Library_Methods/MathMethods.java)

---

### Chapter 7: Conditional Constructs in Java

Making decisions in your code.

*   **`if-else` statement**: Executes a block of code if a condition is true, and another block if it's false.
*   **`if-else if-else` ladder**: Used to check multiple conditions in sequence.
*   **`switch-case` statement**: An alternative to the `if-else if` ladder, useful for checking a variable against a list of fixed values.

*   **Code Examples**:
    *   [`IfElse.java`](Chapter7_Conditional_Constructs/IfElse.java)
    *   [`SwitchCase.java`](Chapter7_Conditional_Constructs/SwitchCase.java)
    *   [`MenuDriven.java`](Chapter7_Conditional_Constructs/MenuDriven.java) - A practical program using `switch`.

---

### Chapter 8: Iterative Constructs in Java

Repeating actions using loops.

*   **8.2 `for` loop**: Used when you know the number of iterations in advance.
*   **8.3 `while` loop**: Used when the number of iterations is not known; the loop continues as long as a condition is true.
*   **8.4 `do-while` loop**: Similar to a `while` loop, but it always executes at least once.
*   **8.6 Jump Statements**:
    *   `break`: Immediately exits a loop.
    *   `continue`: Skips the current iteration and proceeds to the next one.

*   **Code Examples**:
    *   [`ForLoop.java`](Chapter8_Iterative_Constructs/ForLoop.java)
    *   [`WhileLoop.java`](Chapter8_Iterative_Constructs/WhileLoop.java)
    *   [`DoWhileLoop.java`](Chapter8_Iterative_Constructs/DoWhileLoop.java)
    *   [`JumpStatements.java`](Chapter8_Iterative_Constructs/JumpStatements.java)

---

### Chapter 9: Nested for Loops

Placing one loop inside another. Useful for creating patterns or working with 2D data.

*   The inner loop completes all its iterations for every single iteration of the outer loop.

*   **Code Examples**:
    *   [`NestedForLoop.java`](Chapter9_Nested_Loops/NestedForLoop.java) - Basic nested loop for a grid.
    *   [`Pattern1.java`](Chapter9_Nested_Loops/Pattern1.java) - Printing a simple triangle pattern.
    *   [`Pattern2.java`](Chapter9_Nested_Loops/Pattern2.java) - Printing a number pattern.

---

### Chapter 10: Ethical Issues in Computing

This chapter is theoretical and covers responsible computing.

*   **10.1 Computing Ethics**: Moral principles that guide the use of computers.
*   **10.2 Intellectual Property Rights (IPR)**: Protecting creations of the mind, like software and music (e.g., Copyright, Patents).
*   **10.7 Software Piracy**: The illegal copying, distribution, or use of software.
*   **10.8 Cybercrime**: Criminal activities carried out using computers and the internet.
*   **10.9 Hacking**: Gaining unauthorized access to a computer system.
*   **10.11 Netiquette**: "Network etiquette" - the rules of polite online behavior.

---
This project is designed to be a one-stop resource for your Class 9 Java studies. Happy coding!
