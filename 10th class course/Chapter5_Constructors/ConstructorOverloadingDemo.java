package Chapter5_Constructors;

// Chapter 5: Constructors
// Topic: Types - Constructor Overloading

// Constructor overloading is having multiple constructors in a class with different parameter lists.
// This provides different ways to create an object.
class BankAccount {
    String accountHolder;
    long accountNumber;
    double balance;
    String accountType;

    // Constructor 1: Default (no-parameter) constructor.
    // Used when no information is provided.
    BankAccount() {
        System.out.println("Creating a default account...");
        this.accountHolder = "Unknown";
        this.accountNumber = 0;
        this.balance = 0.0;
        this.accountType = "Savings";
    }

    // Constructor 2: Takes the account holder's name.
    // Initializes with a default balance and account type.
    BankAccount(String name) {
        System.out.println("Creating an account for: " + name);
        this.accountHolder = name;
        this.accountNumber = generateAccountNumber(); // Generate a random account number.
        this.balance = 100.0; // Provide a minimum opening balance.
        this.accountType = "Savings";
    }

    // Constructor 3: Takes name and an initial balance.
    BankAccount(String name, double initialBalance) {
        System.out.println("Creating an account for: " + name + " with balance: $" + initialBalance);
        this.accountHolder = name;
        this.accountNumber = generateAccountNumber();
        this.balance = initialBalance;
        this.accountType = "Savings";
    }

    // Constructor 4: Takes all parameters for full customization.
    BankAccount(String name, double initialBalance, String type) {
        System.out.println("Creating a " + type + " account for: " + name);
        this.accountHolder = name;
        this.accountNumber = generateAccountNumber();
        this.balance = initialBalance;
        this.accountType = type;
    }

    // A helper method to generate a random account number.
    // It's 'private' because it's only used inside this class.
    private long generateAccountNumber() {
        return (long)(Math.random() * 9000000000L) + 1000000000L;
    }

    // Method to display account information.
    void displayAccountInfo() {
        System.out.println("--- Account Information ---");
        System.out.println("Account Holder: " + this.accountHolder);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Type: " + this.accountType);
        System.out.println("Balance: $" + this.balance);
    }
}

public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        // Create objects using the different overloaded constructors.

        System.out.println("1. Using the default constructor:");
        BankAccount account1 = new BankAccount();
        account1.displayAccountInfo();

        System.out.println("\n2. Using the constructor with a name:");
        BankAccount account2 = new BankAccount("Alice Johnson");
        account2.displayAccountInfo();

        System.out.println("\n3. Using the constructor with name and balance:");
        BankAccount account3 = new BankAccount("Bob Smith", 5000.0);
        account3.displayAccountInfo();

        System.out.println("\n4. Using the constructor with all parameters:");
        BankAccount account4 = new BankAccount("Carol Brown", 15000.0, "Current");
        account4.displayAccountInfo();
    }
}
