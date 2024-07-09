public class Book {
    private String title;
    private Author author;
    private boolean isBorrowed;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowBook() {
        isBorrowed = true;
    }

    public void returnBook() {
        isBorrowed = false;
    }

    @Override
    public String toString() {
        return "\n" + "------------" + title + " by " + author.getName() + "------------" + "\n";
    }
}
