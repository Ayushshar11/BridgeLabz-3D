package Level1;
class Book {
    static String libName;
    private final String isbn;
    private String title, author;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void setLibName(String name) {
        libName = name;
    }

    public static void showLibName() {
        System.out.println("Library: " + libName);
    }

    public void showBook() {
        if (this instanceof Book) {
            System.out.println(title + " by " + author + " | ISBN: " + isbn);
        }
    }
}

public class Library {
    public static void main(String[] args) {
        Book.setLibName("City Library");
        Book.showLibName();

        Book b1 = new Book("Java Basics", "James Gosling", "J123");
        b1.showBook();
    }
}
