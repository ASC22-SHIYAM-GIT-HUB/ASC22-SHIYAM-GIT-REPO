package lab3;

public class MovieApp {
    public static void main(String[] args) {
        Movie m1 = new Movie("Avengers", "Marvel Studios", "Joss Whedon", 180, 2012, "Action");
        SpecialMovie m2 = new SpecialMovie("Inception", "Warner Bros", "Dolby Atmos", "CGI Max");
        InternationalMovie m3 = new InternationalMovie("Parasite", "Barunson", "South Korea", "Korean");

        Movie[] movies = new Movie[3];
        movies[0] = m1;
        movies[1] = m2;
        movies[2] = m3;

        for (Movie m : movies) {
            System.out.println(m.showDetails());
            if (m instanceof SpecialMovie) {
                SpecialMovie sm = (SpecialMovie) m;
                System.out.println("This is a Special Movie.");
            } else if (m instanceof InternationalMovie) {
                InternationalMovie im = (InternationalMovie) m;
                System.out.println("This is an International Movie.");
            }
        }

        System.out.println("Total movies created: " + Movie.getMoviesCount());
    }
}
