
import java.util.Scanner;

public class Main1
{
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\nLibrary System Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int addID = scanner.nextInt();
                    scanner.nextLine();  // Consume newline

                    System.out.print("Enter Title: ");
                    String addTitle = scanner.nextLine();

                    System.out.print("Enter Author: ");
                    String addAuthor = scanner.nextLine();

                    System.out.print("Is Available (true/false): ");
                    boolean addAvailable = scanner.nextBoolean();

                    Book newBook = new Book(addID, addTitle, addAuthor, addAvailable);
                    library.addBook(newBook);
                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    System.out.print("Enter Book ID to Remove: ");
                    int removeID = scanner.nextInt();

                    if (library.removeBook(removeID)) {
                        System.out.println("Book removed successfully.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to Search: ");
                    int searchID = scanner.nextInt();

                    Book foundBook = library.searchBook(searchID);
                    if (foundBook != null) {
                        System.out.println("Book found: " + foundBook);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    library.displayBooks();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
