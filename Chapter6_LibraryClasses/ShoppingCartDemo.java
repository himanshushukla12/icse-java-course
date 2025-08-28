package Chapter6_LibraryClasses;

// Chapter 6: Library Classes
// Topic: Practical Example - Shopping Cart with Wrapper Classes

import java.util.ArrayList;
import java.util.List;

// The Product class uses Wrapper classes for its fields.
// This allows them to hold 'null' values if needed and use utility methods.
class Product {
    String name;
    Double price;    // Using Double allows for null price if not set.
    Integer quantity; // Using Integer allows for null quantity.
    Boolean inStock;  // Using Boolean allows for null status.

    Product(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        // The 'inStock' status is determined by the quantity.
        this.inStock = (quantity != null && quantity > 0);
    }

    void displayProduct() {
        System.out.println("Product: " + this.name);
        System.out.println("  Price: $" + this.price);
        System.out.println("  Quantity: " + this.quantity);
        System.out.println("  In Stock: " + this.inStock);
        System.out.println("---");
    }

    // Calculates the total price for this product (price * quantity).
    Double calculateTotal() {
        // Check for nulls to avoid errors.
        if (price == null || quantity == null) {
            return 0.0;
        }
        return price * quantity; // Unboxing happens here automatically.
    }
}

class ShoppingCart {
    List<Product> products;

    ShoppingCart() {
        products = new ArrayList<>();
    }

    // This method uses wrapper class parsing to handle string inputs.
    void addProduct(String name, String priceStr, String quantityStr) {
        try {
            // Convert string inputs to their respective wrapper types.
            Double price = Double.parseDouble(priceStr);
            Integer quantity = Integer.parseInt(quantityStr);
            
            Product product = new Product(name, price, quantity);
            products.add(product);
            System.out.println("SUCCESS: Added '" + name + "' to the cart.");
        } catch (NumberFormatException e) {
            // This error occurs if the string is not a valid number.
            System.out.println("ERROR: Invalid price or quantity format for item '" + name + "'.");
        }
    }

    void displayCart() {
        System.out.println("\n=== Your Shopping Cart ===");
        if (products.isEmpty()) {
            System.out.println("The cart is empty.");
            return;
        }
        for (Product product : products) {
            product.displayProduct();
        }
    }

    // This method calculates the total bill for all products in the cart.
    void generateBill() {
        System.out.println("\n=== FINAL BILL ===");
        Double subtotal = 0.0;

        for (Product product : products) {
            subtotal += product.calculateTotal(); // Autoboxing/unboxing in action.
        }

        Double tax = subtotal * 0.08; // 8% sales tax.
        Double total = subtotal + tax;

        // String.format is used for clean formatting of decimal numbers.
        System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
        System.out.println("Tax (8%): $" + String.format("%.2f", tax));
        System.out.println("--------------------");
        System.out.println("Total:    $" + String.format("%.2f", total));
    }
}

public class ShoppingCartDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        System.out.println("=== Adding Products to Cart ===");
        cart.addProduct("Laptop", "999.99", "1");
        cart.addProduct("Mouse", "25.50", "2");
        cart.addProduct("Keyboard", "75.00", "1");
        
        // Attempt to add a product with invalid data.
        cart.addProduct("Invalid Item", "ninety-nine", "one");

        // Display the contents of the cart.
        cart.displayCart();

        // Generate and display the final bill.
        cart.generateBill();
    }
}
