class Book {
    String title, author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class Q2 {
    static void printByAuthor(Book[] books, String author) {
        for (int x = 0; x < books.length; x++) {
            if (books[x].author.equals(author)) {
                System.out.println(books[x].title);
            }
        }
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book("Book1", "Author1"),
            new Book("Book2", "Author2"),
            new Book("Book3", "Author1"),
            new Book("Book4", "Author3"),
            new Book("Book5", "Author1")
        };
        printByAuthor(books, "Author1");
    }
}
