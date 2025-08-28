package Chapter3_ObjectsAndClasses;

// Chapter 3: Objects and Classes
// Topic: Real-life Example - Bank Account

// The 'BankAccount' class models a real-world bank account.
// It encapsulates the data (state) and operations (behaviour) of a bank account.
class BankAccount {
    // State (Member Variables): These represent the properties of a bank account.
    String accountHolder;
    long accountNumber;
    double balance;
    String accountType;

    // Behaviour (Member Methods): These represent the actions you can perform with a bank account.

    // Method to deposit money into the account.
    void deposit(double amount) {
        // Basic validation: ensure the deposit amount is positive.
        if (amount > 0) {
            balance += amount; // Add the amount to the current balance.
            System.out.println("Deposited: $" + amount);
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money from the account.
    void withdraw(double amount) {
        // Validation: ensure withdrawal amount is positive and there are sufficient funds.
        if (amount > 0 && amount <= balance) {
            balance -= amount; // Subtract the amount from the balance.
            System.out.println("Withdrawn: $" + amount);
            System.out.println("Remaining Balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds!");
        }
    }

    // Method to check the current balance.
    void checkBalance() {
        System.out.println("Account Balance: $" + balance);
    }

    // Method to display all account information.
    void accountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: $" + balance);
    }
}

// The main class to demonstrate the BankAccount object.
public class BankDemo {
    public static void main(String[] args) {
        // Create a new BankAccount object.
        BankAccount account = new BankAccount();

        // Set the initial state of the bank account.
        account.accountHolder = "John Doe";
        account.accountNumber = 1234567890L;
        account.balance = 1000.0;
        account.accountType = "Savings";

        // Demonstrate the behavior of the bank account object.
        System.out.println("=== Initial Account Information ===");
        account.accountInfo();

        System.out.println("\n=== Banking Operations ===");
        account.deposit(500);    // Deposit $500
        account.withdraw(200);   // Withdraw $200
        account.checkBalance();  // Check the balance
        account.withdraw(2000);  // Attempt to withdraw more money than available (this should fail).
    }
}
