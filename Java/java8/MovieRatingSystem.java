package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Movie {

    private String movieName;
    private String genre;
    private double rating;

    public Movie(String movieName, String genre, double rating) {
        this.movieName = movieName;
        this.genre = genre;
        this.rating = rating;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return movieName + " | " + genre + " | Rating : " + rating;
    }
}

public class MovieRatingSystem {

    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
                new Movie("Leo", "Action", 4.5),
                new Movie("KGF", "Action", 4.8),
                new Movie("3 Idiots", "Comedy", 4.9),
                new Movie("Bahubali", "Historical", 4.7),
                new Movie("Jailer", "Action", 3.8)
        );

        System.out.println("Movies above 4.0");

        movies.stream()
                .filter(m -> m.getRating() > 4.0)
                .forEach(System.out::println);

        System.out.println("\nSorted by Rating");

        movies.stream()
                .sorted(Comparator.comparing(Movie::getRating))
                .forEach(System.out::println);

        System.out.println("\nGrouped by Genre");

        Map<String, List<Movie>> grouped =
                movies.stream()
                        .collect(Collectors.groupingBy(Movie::getGenre));

        grouped.forEach((genre, movieList) -> {
            System.out.println(genre);
            movieList.forEach(System.out::println);
        });

        System.out.println("\nHighest Rated Movie");

        movies.stream()
                .max(Comparator.comparing(Movie::getRating))
                .ifPresent(System.out::println);
    }
}