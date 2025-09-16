class Movie {
    String title;
    String genre;
    double rating;
    Movie(String title, String genre, double rating){
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }
    void display(){
        System.out.println(title + " " + genre + " " + rating);
    }
}

public class MovieTest {
    public static void main(String[] args) {
        Movie m = new Movie("Inception", "Sci-Fi", 9.0);
        m.display();
    }
}
