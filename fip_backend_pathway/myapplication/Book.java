import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private String isdn;

    // Constructor to initialize the attributes of the Book class
    public Book(String title, String author, String isdn) {
        this.title = title;
        this.author = author;
        this.isdn = isdn;
    }

    // Getter methods to access the attributes
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsdn() {
        return isdn;
    }

    // Override toString to display book details in a readable format
    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', isdn='" + isdn + "'}";
    }
}

class BookCollection {
    private List<Book> books;

    // Constructor to initialize the collection
    public BookCollection() {
        books = new ArrayList<>();
    }

    // Method to add a book to the collection
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to remove a book from the collection by ISDN
    public boolean removeBook(String isdn) {
        for (Book book : books) {
            if (book.getIsdn().equals(isdn)) {
                books.remove(book);
                return true; // Book removed successfully
            }
        }
        return false; // Book not found
    }

    // Method to display all books in the collection
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the collection.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        // Create book collection
        BookCollection collection = new BookCollection();

        // Create books
        Book book1 = new Book("Java Basics", "Michael Ukana", "6334");
        Book book2 = new Book("Advanced Java", "Daniel Ukana", "8768");

        // Add books to collection
        collection.addBook(book1);
        collection.addBook(book2);

        // Display all books
        System.out.println("Books in collection:");
        collection.displayBooks();

        // Remove a book by ISDN
        System.out.println("\nRemoving book with ISDN 8768...");
        if (collection.removeBook("8768")) {
            System.out.println("Book removed.");
        } else {
            System.out.println("Book not found.");
        }

        // Display all books again
        System.out.println("\nBooks in collection after removal:");
        collection.displayBooks();
    }
}
