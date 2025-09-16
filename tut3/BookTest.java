class Book {
    String title;
    String author;
    double price;
    Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    double discountedPrice(double discount){
        return price - (price * discount / 100);
    }
}

public class BookTest {
    public static void main(String[] args) {
        Book b = new Book("Java Basics", "Herbert Schildt", 500);
        System.out.println("Price after discount: " + b.discountedPrice(10));
    }
}
