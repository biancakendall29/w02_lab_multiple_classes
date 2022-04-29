import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GalleryTest {

    Gallery gallery;
    Artwork mona;
    Customer tom;

    @BeforeEach
    public void setUp() {
        gallery = new Gallery("Wallace Collection"); // till starts at 0 and list of artwork starts with none
        mona = new Artwork("Mona Lisa", "Leonardo da Vinci", 900, "ML_LdV");
        tom = new Customer("Tom");
    }

    @Test
    public void hasName() {
        assertThat(gallery.getName()).isEqualTo("Wallace Collection");
    }

    @Test
    public void canAddArtwork() {
        gallery.addArtwork(mona);
        assertThat(gallery.getArtwork().size()).isEqualTo(1);
    }

    @Test
    public void canSellArtwork() {
        gallery.addArtwork(mona);
        gallery.removeArtwork(mona);
        gallery.increaseTill(mona);
        assertThat(gallery.getArtwork().size()).isEqualTo(0);
        assertThat(gallery.getTill()).isEqualTo(900);
    }

    @Test
    public void canSellArtwork2() {
        gallery.sellArtwork(mona, tom);
        assertThat(gallery.getArtwork().size()).isEqualTo(0);
        assertThat(gallery.getTill()).isEqualTo(900);
    }

}
