package pl.hil4rion.movielibrary.infrastructure.movie.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.hil4rion.movielibrary.domain.movie.MovieFacade;
import pl.hil4rion.movielibrary.domain.movie.dto.MovieDto;
import pl.hil4rion.movielibrary.domain.movie.dto.MovieRequestDto;

import java.util.List;

@RestController
@RequestMapping("/movies")
@AllArgsConstructor
public class MovieRestController {

    private final MovieFacade movieFacade;

    @GetMapping
    public ResponseEntity<List<MovieDto>> getAllMovies() {
        List<MovieDto> movieDtos = movieFacade.findAll();
        return ResponseEntity.ok(movieDtos);
    }

    @GetMapping("/{title}")
    public ResponseEntity<MovieDto> getMovieByTitle(@PathVariable String title) {
        MovieDto movieDto = movieFacade.findByTitle(title);
        return ResponseEntity.ok(movieDto);
    }

    @PostMapping
    public ResponseEntity<MovieDto> addMovie(@RequestBody @Valid MovieRequestDto movieRequestDto) {
        MovieDto movieDto = movieFacade.addMovie(movieRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(movieDto);
    }

    @PutMapping
    public ResponseEntity<MovieDto> updateMovie(@RequestBody @Valid MovieRequestDto movieRequestDto) {
        MovieDto movieDto = movieFacade.updateMovie(movieRequestDto);
        return ResponseEntity.ok(movieDto);
    }

    @DeleteMapping("/{title}")
    public ResponseEntity<MovieDto> deleteMovie(@PathVariable String title) {
        MovieDto deletedMovie = movieFacade.deleteMovie(title);
        return ResponseEntity.ok(deletedMovie);
    }
}
