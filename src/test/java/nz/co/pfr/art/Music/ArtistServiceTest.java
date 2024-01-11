package nz.co.pfr.art.Music;

import nz.co.pfr.art.Music.entities.ArtistRepository;
import nz.co.pfr.art.Music.service.ArtistService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ArtistServiceTest {
    @Mock
    ArtistRepository artistRepository;

    @InjectMocks
    ArtistService artistService;

    @Test
    public void test() {
        Mockito.when(artistRepository.findAll()).thenReturn(DummyData.testData());
        Assert.assertTrue( artistService.getMostProductiveArtists().contains("Michael Jackson"));
        Assert.assertEquals(1, artistService.getMostProductiveArtists().size());
    }
}
