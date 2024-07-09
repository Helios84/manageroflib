import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Меню библиотеки / Menu of the library:"); 
            System.out.println("1. Добавить книгу / ADD BOOK"); 
            System.out.println("2. Добавить читателя / ADD A READER");
            System.out.println("3. Взять книгу / TAKE A BOOK");
            System.out.println("4. Вернуть книгу / RETURN A BOOK");
            System.out.println("5. Показать все книги / SHOW ALL BOOKS");
            System.out.println("6. Выйти / EXIT");
            System.out.print("Выберите опцию / CHOOSE THE OPTION: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    System.out.print("---------Введите название книги / ENTER THE BOOK TITLE: ");
                    String title = scanner.nextLine();
                    System.out.print("---------Введите имя автора / ENTER THE AUTHOR'S NAME: ");
                    String authorName = scanner.nextLine();
                    Author author = new Author(authorName);
                    Book book = new Book(title, author);
                    library.addBook(book);
                    break;
                case 2:
                    System.out.print("---------Введите имя читателя / ENTER THE READER'S NAME: ");
                    String borrowerName = scanner.nextLine();
                    Borrower borrower = new Borrower(borrowerName);
                    library.addBorrower(borrower);
                    break;
                case 3:
                    System.out.print("---------Введите название книги / ENTER THE BOOK TITLE: ");
                    title = scanner.nextLine();
                    System.out.print("---------Введите имя читателя / ENTER THE READER'S NAME: ");
                    borrowerName = scanner.nextLine();
                    library.borrowBook(title, borrowerName);
                    break;
                case 4:
                    System.out.print("---------Введите название книги / ENTER THE BOOK TITLE: ");
                    title = scanner.nextLine();
                    library.returnBook(title);
                    break;
                case 5:
                    library.displayBooks();
                    break;
                case 6:
                    System.out.println("---------Выход / EXIT...---------");
                    scanner.close();
                    return;
                default:
                    System.out.println("---------Неверный выбор / WRONG CHOICE.---------");
            }
        }
    }
}
