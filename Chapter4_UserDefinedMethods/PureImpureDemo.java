package Chapter4_UserDefinedMethods;

// Chapter 4: User-defined Methods
// Topic: Pure and Impure Methods

class Counter {
    // This is an instance variable. Its value represents the state of the object.
    private int count = 0;

    // --- PURE METHODS ---
    // A pure method does not change the state of the object.
    // For the same input, it always returns the same output.

    // This is a pure method. It doesn't use or change 'count'.
    // Calling square(5) will always return 25.
    int square(int number) {
        return number * number;
    }

    // This is also a pure method. It only works with its parameters.
    int add(int a, int b) {
        return a + b;
    }

    // --- IMPURE METHODS ---
    // An impure method changes the state of the object (modifies instance variables).
    // Calling it multiple times might produce different results or side effects.

    // This is an impure method because it changes the 'count' variable.
    void increment() {
        count++; // This line modifies the object's state.
        System.out.println("Count incremented to: " + count);
    }

    // This is also an impure method because it changes 'count'.
    void reset() {
        count = 0; // This line modifies the object's state.
        System.out.println("Count reset to: " + count);
    }

    // This method is considered PURE because it does not change the state.
    // It only reads the state. This is a common point of discussion, but in
    // a strict sense, if a method depends on mutable state, it's not pure.
    // However, for simplicity, methods that only read state are often treated as pure.
    int getCount() {
        return count;
    }
}

public class PureImpureDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Calling pure methods. The results are predictable.
        System.out.println("Square of 5: " + counter.square(5));
        System.out.println("Square of 5 again: " + counter.square(5));
        System.out.println("Add 3 + 7: " + counter.add(3, 7));

        // Calling impure methods. They change the state of the 'counter' object.
        System.out.println("\nInitial count: " + counter.getCount());
        counter.increment(); // count becomes 1
        counter.increment(); // count becomes 2
        counter.increment(); // count becomes 3
        System.out.println("Current count: " + counter.getCount());
        counter.reset();     // count becomes 0
        System.out.println("Final count: " + counter.getCount());
    }
}
