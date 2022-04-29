import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArtistTest {

    Artist artist;
    Artwork mona;

    @BeforeEach
    public void setUp() {
        artist = new Artist("Leonardo da Vinci");
        mona = new Artwork("Mona Lisa", "Leonardo da Vinci", 900, "ML_LdV");

    }

    // when artwork is added to gallery, fire method in Artist class to add that artwork to the Artists collection


    @Test
    public void artistHasName() {
        assertThat(artist.getArtistName()).isEqualTo("Leonardo da Vinci");
    }

    @Test
    public void canAddArtistArtwork() {
        artist.addArtistArtwork(mona);
        assertThat(artist.getArtistArtwork().size()).isEqualTo(1);
    }

}

