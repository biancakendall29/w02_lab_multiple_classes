public class Artwork {

    private String title;
    private String artist;
    private float price;
    private String nft;

    public Artwork(String title, String artist, float price, String nft) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.nft = nft;
    }

    public String getTitle() {
        return this.title;
    }

    public String getArtist() {
        return this.artist;
    }

    public float getPrice() {
        return price;
    }

    public String getNft() {
        return nft;
    }
}
