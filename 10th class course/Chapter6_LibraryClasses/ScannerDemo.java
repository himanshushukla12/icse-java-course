
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = in.nextInt();

        // Consume the lingering newline character left by nextInt()
        // Without this, the next call to nextLine() would read an empty string
        in.nextLine(); 

        System.out.print("Enter your full name (which can include spaces): ");
        String name = in.nextLine();

        System.out.print("Enter your favorite word (no spaces): ");
        String word = in.next();


        System.out.println("\n--- Your Details ---");
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your favorite word is '" + word + "'.");
        
        in.close();
    }
}
