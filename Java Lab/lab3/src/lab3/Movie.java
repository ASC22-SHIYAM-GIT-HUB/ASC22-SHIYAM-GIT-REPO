package lab3;

public class Movie {
    private String movieName;
    private String producedBy;
    private String directedBy;
    private int duration;
    private int year;
    private String category;

    private final String movieId;
    private static int moviesCount = 0;

    public Movie(String movieName, String producedBy) {
        if (movieName == null || producedBy == null) {
            throw new IllegalArgumentException("movieName and producedBy are required.");
        }
        this.movieName = movieName;
        this.producedBy = producedBy;
        moviesCount++;
        this.movieId = movieName + "_" + moviesCount;
    }

    public Movie(String movieName, String producedBy, String directedBy,
                 int duration, int year, String category) {
        this(movieName, producedBy);
        this.directedBy = directedBy;
        this.duration = duration;
        this.year = year;
        this.category = category;
    }

    public String getMovieId() {
        return movieId;
    }

    public static int getMoviesCount() {
        return moviesCount;
    }

    public void acceptInfo(String directedBy, int duration, int year, String category) {
        this.directedBy = directedBy;
        this.duration = duration;
        this.year = year;
        this.category = category;
    }

    public String showDetails() {
        return "MovieID: " + movieId + ", Name: " + movieName + ", Produced By: " + producedBy +
                ", Directed By: " + directedBy + ", Duration: " + duration +
                ", Year: " + year + ", Category: " + category;
    }
}
