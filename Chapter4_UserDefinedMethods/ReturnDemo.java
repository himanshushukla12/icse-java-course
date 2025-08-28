package Chapter4_UserDefinedMethods;

// Chapter 4: User-defined Methods
// Topic: Using the 'return' statement

// This class demonstrates methods that return a value.
class Calculator {
    // This method returns an 'int' value.
    // The 'return' keyword sends a value back to where the method was called.
    int add(int a, int b) {
        return a + b; // The sum of a and b is returned.
    }

    // This method returns a 'double' value.
    double calculatePercentage(double marks, double totalMarks) {
        return (marks / totalMarks) * 100;
    }

    // This method returns a 'boolean' value (true or false).
    boolean isEven(int number) {
        return number % 2 == 0; // The result of the comparison is returned.
    }

    // This method returns a 'String' value.
    String getGrade(double percentage) {
        if (percentage >= 90) return "A+";
        else if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else return "F";
    }

    // A method can have multiple return statements, but only one will be executed.
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

        // Call the 'add' method and store the returned value in the 'sum' variable.
        int sum = calc.add(45, 35);
        System.out.println("Sum: " + sum);

        // Call 'calculatePercentage' and store the result.
        double percentage = calc.calculatePercentage(425, 500);
        System.out.println("Percentage: " + percentage + "%");

        // Call 'isEven' and store the boolean result.
        boolean isEvenNumber = calc.isEven(24);
        System.out.println("Is 24 even? " + isEvenNumber);

        // Call 'getGrade' and store the string result.
        String grade = calc.getGrade(percentage);
        System.out.println("Grade: " + grade);

        // Call 'checkAge'.
        String ageCategory = calc.checkAge(16);
        System.out.println("Age category: " + ageCategory);

        // You can also use the returned value directly without storing it.
        System.out.println("Grade for 90%: " + calc.getGrade(90));
    }
}
