package Chapter7_Encapsulation;

// Chapter 7: Encapsulation
// Topic: Scope of Variables

class ScopeExample {
    // 1. INSTANCE VARIABLE (or Member Variable)
    // - Declared inside a class but outside any method.
    // - Its scope is the entire lifetime of the object.
    // - Each object has its own copy of this variable.
    String instanceVar = "I am an instance variable";

    // 2. CLASS VARIABLE (or Static Variable)
    // - Declared with the 'static' keyword.
    // - Its scope is the entire lifetime of the program.
    // - It is shared among all objects of the class. There is only one copy.
    static String staticVar = "I am a static variable";

    void myMethod(String paramVar) { // 'paramVar' is also a local variable to this method.
        // 3. LOCAL VARIABLE
        // - Declared inside a method or a block of code.
        // - Its scope is limited to the method or block where it is declared.
        String localVar = "I am a local variable";

        System.out.println("\n--- Inside myMethod ---");
        System.out.println("Can access instanceVar: " + instanceVar);
        System.out.println("Can access staticVar: " + staticVar);
        System.out.println("Can access parameter paramVar: " + paramVar);
        System.out.println("Can access localVar: " + localVar);

        if (true) {
            // This is a block-level local variable.
            String blockVar = "I am a block-scoped variable";
            System.out.println("Can access blockVar inside its block: " + blockVar);
        }
        // System.out.println(blockVar); // ERROR: blockVar is out of scope here.
    }

    void anotherMethod() {
        System.out.println("\n--- Inside anotherMethod ---");
        System.out.println("Can access instanceVar: " + instanceVar);
        System.out.println("Can access staticVar: " + staticVar);
        // System.out.println(localVar); // ERROR: localVar from myMethod is out of scope here.
    }
}

public class ScopeDemo {
    public static void main(String[] args) {
        System.out.println("--- In main method ---");

        // You can access static variables directly using the class name.
        System.out.println("Accessing staticVar from main: " + ScopeExample.staticVar);

        // To access instance variables, you need to create an object.
        ScopeExample obj1 = new ScopeExample();
        ScopeExample obj2 = new ScopeExample();

        System.out.println("obj1's instanceVar: " + obj1.instanceVar);
        System.out.println("obj2's instanceVar: " + obj2.instanceVar);

        // Modifying the instance variable for obj1 does not affect obj2.
        obj1.instanceVar = "Modified for obj1";
        System.out.println("\nAfter modification:");
        System.out.println("obj1's instanceVar: " + obj1.instanceVar);
        System.out.println("obj2's instanceVar: " + obj2.instanceVar);

        // Modifying the static variable affects all references to it.
        ScopeExample.staticVar = "Modified static variable";
        System.out.println("obj1's view of staticVar: " + ScopeExample.staticVar);
        System.out.println("obj2's view of staticVar: " + ScopeExample.staticVar);

        // Calling methods to see variable scope in action.
        obj1.myMethod("I am a parameter");
        obj1.anotherMethod();
    }
}
