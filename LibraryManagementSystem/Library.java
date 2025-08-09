import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (int i = 0; i < books.size(); i++) {
                System.out.println(i + 1 + ". " + books.get(i));
            }
        }
    }

    public void issueBook(int index) {
        if (index >= 0 && index < books.size()) {
            Book book = books.get(index);
            if (!book.isIssued()) {
                book.issue();
                System.out.println("Book issued successfully.");
            } else {
                System.out.println("Book is already issued.");
            }
        } else {
            System.out.println("Invalid book index.");
        }
    }

    public void returnBook(int index) {
        if (index >= 0 && index < books.size()) {
            Book book = books.get(index);
            if (book.isIssued()) {
                book.returnBook();
                System.out.println("Book returned successfully.");
            } else {
                System.out.println("Book was not issued.");
            }
        } else {
            System.out.println("Invalid book index.");
        }
    }
}
