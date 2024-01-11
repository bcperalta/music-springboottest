package nz.co.pfr.art.Music.controller;

import nz.co.pfr.art.Music.service.ArtistService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MusicController {
    private final ArtistService artistService;

    public MusicController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping(value = "/artists/mostProductive")
    public ResponseEntity<List<String>> mostProductiveArtist() {
        return ResponseEntity.ok(artistService.getMostProductiveArtists());

    }


}
