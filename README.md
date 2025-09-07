# Java Course for Class 9 & 10

This repository contains the complete Java course material, including notes and code examples, for students in Class 9 and Class 10.

## 📂 Directory Structure

*   **[9th class course](./9th%20class%20course/README.md)**: Contains all notes and examples for the Class 9 curriculum.
*   **[10th class course](./10th%20class%20course/README.md)**: Contains all notes and examples for the Class 10 curriculum.

Please navigate to the respective directories to find the course material relevant to you. Each directory has its own `README.md` with a detailed list of topics and code files.

---

## 🚀 Getting Started: How to Run the Code on Windows

To compile and run the Java files in this project, you need to have the Java Development Kit (JDK) installed and configured on your system.

### 1. How to Install the Java Development Kit (JDK)

The JDK is a software development environment used for developing Java applications.

1.  **Download the JDK**:
    *   Go to the official Oracle Java download page: [Oracle JDK Downloads](https://www.oracle.com/java/technologies/downloads/).
    *   Select a version (JDK 11, 17, or a newer LTS version is recommended).
    *   Choose the "Windows" tab and download the "x64 Installer".

2.  **Install the JDK**:
    *   Run the downloaded `.exe` file.
    *   Follow the on-screen instructions. It's best to keep the default installation path (usually `C:\Program Files\Java\jdk-xx`).

3.  **Configure Environment Variables**:
    *   This step is crucial for running Java commands from any terminal window.
    *   **Find the JDK Path**: Navigate to where you installed Java (e.g., `C:\Program Files\Java\jdk-17.0.2`). Copy the path to the `bin` folder inside it (e.g., `C:\Program Files\Java\jdk-17.0.2\bin`).
    *   **Open System Properties**:
        *   Press `Windows Key + R`, type `sysdm.cpl`, and press Enter.
        *   Go to the "Advanced" tab and click "Environment Variables...".
    *   **Edit the `Path` Variable**:
        *   Under "System variables", find and select the `Path` variable, then click "Edit...".
        *   Click "New" and paste the path to your JDK's `bin` folder.
        *   Click "OK" on all windows to save the changes.

4.  **Verify the Installation**:
    *   Open a **new** Command Prompt or PowerShell terminal.
    *   Type the following commands and press Enter:
        ```sh
        java -version
        javac -version
        ```
    *   If the installation was successful, you will see the installed Java and javac versions printed.

### 2. How to Compile and Run the Java Files

Once the JDK is installed, you can compile and run the example files from the terminal.

1.  **Open a Terminal**: Open PowerShell or Command Prompt.

2.  **Navigate to the Project Directory**: Use the `cd` command to go to the root of this project.
    ```sh
    cd "icse-java-course"
    ```

3.  **Compile a Java File**:
    *   Use the `javac` command. You must provide the full path to the `.java` file.
    *   **Syntax**: `javac "CourseFolder\ChapterFolder\FileName.java"`
    *   **Example (for a Class 9 file)**:
        *Note: Some files depend on others, so you may need to compile them together.*
        ```sh
        javac "9th class course\Chapter2_Objects_And_Classes\Dog.java" "9th class course\Chapter2_Objects_And_Classes\DogDemo.java"
        ```
    *   This will create `.class` files in the same directory.

4.  **Run the Compiled Program**:
    *   Use the `java` command. You need to specify the "fully qualified name" of the class (e.g., `Package.ClassName`).
    *   **Syntax**: `java CourseFolder.ChapterFolder.MainClassName`
    *   **Example (for the Class 9 file)**:
        ```sh
        java "9th class course.Chapter2_Objects_And_Classes.DogDemo"
        ```
    *   **Important**: Do not add `.java` or `.class` at the end of the command when running.

#### Another Example (for a Class 10 file)

*   **Compile**:
    ```sh
    javac "10th class course\Chapter3_ObjectsAndClasses\StudentDemo.java"
    ```
*   **Run**:
    ```sh
    java "10th class course.Chapter3_ObjectsAndClasses.StudentDemo"
    ```

---

Happy learning and happy coding!
