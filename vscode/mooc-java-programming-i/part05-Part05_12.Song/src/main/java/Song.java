
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    // We are comparing the variables. They must be the same Object Type
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        // The Variables were not the same. Is it the same Object to begin with?
        if (!(compared instanceof Song)) {
            return false;
        }

        // Looks like it was a different type of object. Lets just compare variables by
        // converting the object.
        Song compareSong = (Song) compared;

        if (this.artist.equals(compareSong.artist) &&
                this.name.equals(compareSong.name) &&
                this.durationInSeconds == compareSong.durationInSeconds) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

}
