//  Copy Constructor
// Create a Book class with attributes title and price. Implement:
// o A parameterized constructor to initialize these values.
// o A copy constructor to create a new Book object using an existing object.
// Demonstrate the copy constructor by creating a duplicate object.

public class Book {

    String title;
    double price;

    // Parameterized constructor
    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    // Copy constructor
    public Book(Book other) {
        this.title = other.title;
        this.price = other.price;
    }

    public static void main(String[] args) {

        // aik original book ka object create karte hain
        Book originalBook = new Book("Effective Java", 45.99);

        // abb aik alag book ka object bna k us ko alag book ka object pass kar diya
        // is sy copiedBook ma originalBook ka data aa jaye ga
        Book copiedBook = new Book(originalBook);

        // Print
        System.out.println("Original Book: " + originalBook.title + ", Price: $" + originalBook.price);
        System.out.println("Copied Book: " + copiedBook.title + ", Price: $" + copiedBook.price);
    }
}
