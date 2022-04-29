import java.util.ArrayList;

public class Gallery {

    private String name;
    private float till = 0;
    private ArrayList<Artwork> artwork;


    public Gallery(String name) {
        this.name = name;
        this.till = 0;
        this.artwork = new ArrayList<Artwork>();
    }

    public String getName() {
        return this.name;
    }

    public void addArtwork(Artwork artwork) {
        this.artwork.add(artwork);
        // Artist x = artwork.getArtist();
        // x.addToArtistCollection(this);
    }

    public ArrayList<Artwork> getArtwork() {
        return this.artwork;
    }

    public void removeArtwork(Artwork artwork) {
        this.artwork.remove(artwork);
    }

    public void sellArtwork(Artwork artwork, Customer customer) {
        // fire buyArtwork in Customer
        // fire increaseTill in Gallery
        // fire decreaseWallet in Customer
        if (customer.getWallet() >= (artwork.getPrice())) {
            removeArtwork(artwork);
            increaseTill(artwork);
            customer.buyArtwork(artwork);
        }
    }

    public void increaseTill(Artwork artwork) {
        this.till += artwork.getPrice();
    }

    public float getTill() {
        return this.till;
    }


}
