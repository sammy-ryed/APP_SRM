class Movie {
    String title;
    int[] ratings;

    Movie(String title, int[] ratings) {
        this.title = title;
        this.ratings = ratings;
    }

    double average() {
        int sum = 0;
        for (int x = 0; x < ratings.length; x++) {
            sum += ratings[x];
        }
        return (double) sum / ratings.length;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Movie[] movies = {
            new Movie("M1", new int[]{4, 5, 3, 4, 5}),
            new Movie("M2", new int[]{5, 5, 5, 4, 5}),
            new Movie("M3", new int[]{3, 4, 4, 3, 4}),
            new Movie("M4", new int[]{4, 4, 4, 4, 4})
        };

        Movie best = movies[0];
        for (int x = 1; x < movies.length; x++) {
            if (movies[x].average() > best.average()) {
                best = movies[x];
            }
        }
        System.out.println("Best movie: " + best.title + " Avg: " + best.average());
    }
}
