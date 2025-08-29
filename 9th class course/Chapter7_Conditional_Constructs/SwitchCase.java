package Chapter7_Conditional_Constructs;

import java.util.Scanner;

// This class demonstrates the switch-case statement.
// It's a useful alternative to a long if-else-if ladder when you are checking a variable against a set of fixed values.
public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Day of the Week ---");
        System.out.print("Enter a number from 1 to 7: ");
        int dayNumber = scanner.nextInt();

        String dayName;

        // The 'switch' statement evaluates the variable (dayNumber).
        switch (dayNumber) {
            // It then compares the value to each 'case'.
            case 1:
                dayName = "Sunday";
                break; // The 'break' statement is crucial. It exits the switch block.
            
            case 2:
                dayName = "Monday";
                break;

            case 3:
                dayName = "Tuesday";
                break;

            case 4:
                dayName = "Wednesday";
                break;

            case 5:
                dayName = "Thursday";
                break;

            case 6:
                dayName = "Friday";
                break;

            case 7:
                dayName = "Saturday";
                break;

            // The 'default' case runs if none of the other cases match.
            default:
                dayName = "Invalid day number";
                break;
        }

        System.out.println("The day is: " + dayName);
        
        scanner.close();
    }
}
