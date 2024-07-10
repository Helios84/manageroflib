import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Borrower> borrowers;

    public Library() {
        books = new ArrayList<>();
        borrowers = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addBorrower(Borrower borrower) {
        borrowers.add(borrower);
    }

    public Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public Borrower findBorrower(String name) {
        for (Borrower borrower : borrowers) {
            if (borrower.getName().equalsIgnoreCase(name)) {
                return borrower;
            }
        }
        return null;
    }

    public void borrowBook(String title, String borrowerName) {
        Book book = findBook(title);
        Borrower borrower = findBorrower(borrowerName);

        if (book != null && borrower != null && !book.isBorrowed()) {
            book.borrowBook();
            System.out.println(  "------------" + borrower.getName() + " взял(а)/ took " + book.getTitle() + "------------");
        } else {
            System.out.println("---------Невозможно взять книгу / It is impossible to take this book.---------");
        }
    }

    public void returnBook(String title) {
        Book book = findBook(title);
        if (book != null && book.isBorrowed()) {
            book.returnBook();
            System.out.println( "------------" + book.getTitle() + " возвращена / is returned." + "------------");
        } else {
            System.out.println("---------Невозможно вернуть книгу / It is impossible to return this book.---------");
        }
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
