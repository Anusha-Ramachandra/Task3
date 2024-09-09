import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    // Constructor
    public Library() {
        books = new ArrayList<>();
    }

    // Add a book
    public void addBook(Book book) {
        books.add(book);
    }

    // Remove a book by ID
    public boolean removeBook(int bookID) {
        for (Book book : books) {
            if (book.getBookID() == bookID) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }

    // Search for a book by ID
    public Book searchBook(int bookID) {
        for (Book book : books) {
            if (book.getBookID() == bookID) {
                return book;
            }
        }
        return null;
    }

    // Display all books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}
