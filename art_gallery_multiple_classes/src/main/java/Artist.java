import java.util.ArrayList;

public class Artist {

    static String name;
    static ArrayList<Artwork> work;

    public Artist(String name) {
        this.name = name;
        this.work = new ArrayList<Artwork>();
    }

    public String getArtistName() {
        return this.name;
    }

    public void addArtistArtwork(Artwork work) {
        this.work.add(work);
    }

    public ArrayList<Artwork> getArtistArtwork() {
        return this.work;
    }
}

