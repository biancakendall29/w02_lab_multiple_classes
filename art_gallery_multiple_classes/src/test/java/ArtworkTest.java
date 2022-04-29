import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArtworkTest {

    Artwork artwork;

    @BeforeEach
    public void setUp() {
        artwork = new Artwork("Mona Lisa", "Leonardo da Vinci", 900, "ML_LdV");
    }

    @Test
    public void hasTitle(){
        assertThat(artwork.getTitle()).isEqualTo("Mona Lisa");
    }

    @Test
    public void hasArtist() {
        assertThat(artwork.getArtist()).isEqualTo("Leonardo da Vinci");
    }

    @Test
    public void canGetPrice() {
        assertThat(artwork.getPrice()).isEqualTo(500);
    }

    @Test
    public void canGetNft() {
        assertThat(artwork.getNft()).isEqualTo("ML_LdV");
    }
}
