package lab3;

public class InternationalMovie extends Movie {
    private String country;
    private String language;

    public InternationalMovie(String movieName, String producedBy,
                              String country, String language) {
        super(movieName, producedBy);
        this.country = country;
        this.language = language;
    }

    @Override
    public String showDetails() {
        return super.showDetails() +
                ", Country: " + country + ", Language: " + language;
    }
}
