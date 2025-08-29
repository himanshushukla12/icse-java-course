package Chapter5_Constructors;

// Chapter 5: Constructors
// Topic: Practical Example - Library System

// This class represents a book in a library.
class Book {
    String title;
    String author;
    String isbn;
    double price;
    boolean isAvailable;

    // Constructor 1: Default constructor
    // Initializes a book with placeholder information.
    Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.isbn = "000-0000000000";
        this.price = 0.0;
        this.isAvailable = true;
        System.out.println("A default book record has been created.");
    }

    // Constructor 2: Takes title and author.
    // Useful for creating a book when not all details are known yet.
    Book(String bookTitle, String bookAuthor) {
        this.title = bookTitle;
        this.author = bookAuthor;
        this.isbn = generateISBN(); // Automatically generate an ISBN.
        this.price = 19.99; // Assign a default price.
        this.isAvailable = true;
        System.out.println("New book created: '" + this.title + "' by " + this.author);
    }

    // Constructor 3: Takes all details for a complete record.
    Book(String bookTitle, String bookAuthor, String bookISBN, double bookPrice) {
        this.title = bookTitle;
        this.author = bookAuthor;
        this.isbn = bookISBN;
        this.price = bookPrice;
        this.isAvailable = true;
        System.out.println("A complete record for book '" + this.title + "' has been created.");
    }

    // A private helper method to generate a placeholder ISBN.
    private String generateISBN() {
        return "978-" + (long)(Math.random() * 10000000000L);
    }

    // Method to display all information about the book.
    void displayBookInfo() {
        System.out.println("--- Book Information ---");
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Price: $" + this.price);
        System.out.println("Available: " + (this.isAvailable ? "Yes" : "No"));
    }

    // Method to handle borrowing a book.
    void borrowBook() {
        if (this.isAvailable) {
            this.isAvailable = false;
            System.out.println("Book '" + this.title + "' has been successfully borrowed.");
        } else {
            System.out.println("Sorry, the book '" + this.title + "' is currently not available.");
        }
    }

    // Method to handle returning a book.
    void returnBook() {
        if (!this.isAvailable) {
            this.isAvailable = true;
            System.out.println("Book '" + this.title + "' has been successfully returned.");
        } else {
            System.out.println("This book '" + this.title + "' was not borrowed from here.");
        }
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        System.out.println("=== Welcome to the Library Management System ===\n");

        // Creating book objects using the different constructors.
        Book book1 = new Book(); // Uses the default constructor.
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee"); // Uses the constructor with title and author.
        Book book3 = new Book("1984", "George Orwell", "978-0451524935", 13.99); // Uses the full constructor.

        System.out.println("\n--- Book 1 Details ---");
        book1.displayBookInfo();

        System.out.println("\n--- Book 2 Details ---");
        book2.displayBookInfo();

        System.out.println("\n--- Book 3 Details ---");
        book3.displayBookInfo();

        System.out.println("\n=== Library Operations Demo ===");
        book2.borrowBook(); // Borrow book 2
        book2.displayBookInfo(); // Check its status

        book2.returnBook(); // Return book 2
        book2.displayBookInfo(); // Check its status again
    }
}
