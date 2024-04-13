public class Film {
    private String name;
    private int ageRating;

    public Film(String filmName, int filmAge) {
        this.name = filmName;
        this.ageRating = filmAge;
    }

    public String name() {
        return name;
    }

    public int ageRating() {
        return ageRating;
    }
}
