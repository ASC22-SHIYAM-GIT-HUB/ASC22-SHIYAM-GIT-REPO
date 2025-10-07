package lab3;

public class SpecialMovie extends Movie {
    private String soundEffectsTechnology;
    private String visualEffectsTechnology;

    public SpecialMovie(String movieName, String producedBy,
                        String soundEffectsTechnology, String visualEffectsTechnology) {
        super(movieName, producedBy);
        this.soundEffectsTechnology = soundEffectsTechnology;
        this.visualEffectsTechnology = visualEffectsTechnology;
    }

    @Override
    public String showDetails() {
        return super.showDetails() +
               ", Sound Effects: " + soundEffectsTechnology +
               ", Visual Effects: " + visualEffectsTechnology;
    }
}
