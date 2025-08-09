import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        // Sample books
        library.addBook(new Book("Harry Potter", "J.K. Rowling"));
        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien"));
        library.addBook(new Book("1984", "George Orwell"));

        System.out.print("Enter your name: ");
        User user = new User(sc.nextLine());

        int choice;
        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Show Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    library.showAllBooks();
                    break;
                case 2:
                    library.showAllBooks();
                    System.out.print("Enter book number to issue: ");
                    int issueIndex = sc.nextInt() - 1;
                    library.issueBook(issueIndex);
                    break;
                case 3:
                    library.showAllBooks();
                    System.out.print("Enter book number to return: ");
                    int returnIndex = sc.nextInt() - 1;
                    library.returnBook(returnIndex);
                    break;
                case 4:
                    System.out.println("Thank you, " + user.getName() + "! Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        sc.close();
    }
}
