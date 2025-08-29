package Chapter5_Input;

// This class demonstrates the use of comments in Java.
// Comments are notes for humans to read; the Java compiler ignores them completely.

public class Comments { // The class name is Comments

    public static void main(String[] args) {
        // --- 1. Single-line comment ---
        // This is a single-line comment. It starts with // and goes to the end of the line.
        // It's useful for short explanations.

        // The following line prints a welcome message to the console.
        System.out.println("Hello, this program demonstrates comments!");


        // --- 2. Multi-line comment ---
        /*
           This is a multi-line comment.
           It starts with /* and ends with */
        /*
           It can span across multiple lines and is useful for longer descriptions
           or for temporarily disabling a block of code.
        */

        /*
        The code below is currently commented out, so it will not run.
        If you remove the /* and */ /*, it will be executed.
        
        int a = 10;
        int b = 20;
        System.out.println("This line is inside a comment block.");
        System.out.println("The sum is: " + (a + b));
        */

        System.out.println("The program has finished.");
    }
}
