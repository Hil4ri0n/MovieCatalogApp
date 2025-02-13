package pl.hil4rion.movielibrary.domain.movie;

import lombok.AllArgsConstructor;
import pl.hil4rion.movielibrary.domain.movie.dto.MovieDto;
import pl.hil4rion.movielibrary.domain.movie.dto.MovieRequestDto;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class MovieFacade {

    private final MovieService movieService;

    public MovieDto findByTitle(String title) {
        Movie movieByTitle = movieService.findByTitle(title);
        return MovieMapper.mapFromMovieToDto(movieByTitle);
    }

    public List<MovieDto> findAll() {
        List<Movie> movies = movieService.findAll();
        return movies.stream()
                .map(MovieMapper::mapFromMovieToDto)
                .collect(Collectors.toList());
    }

    public MovieDto addMovie(MovieRequestDto movieRequestDto) {
        Movie movie = MovieMapper.mapFromMovieRequestDtoToMovie(movieRequestDto);
        Movie addedMovie = movieService.addMovie(movie);
        return MovieMapper.mapFromMovieToDto(addedMovie);
    }

    public MovieDto updateMovie(MovieRequestDto movieRequestDto) {
        Movie movie = MovieMapper.mapFromMovieRequestDtoToMovie(movieRequestDto);
        Movie updatedMovie = movieService.updateMovie(movie);
        return MovieMapper.mapFromMovieToDto(updatedMovie);
    }

    public MovieDto deleteMovie(String title) {
        Movie deletedMovie = movieService.deleteByTitle(title);
        return MovieMapper.mapFromMovieToDto(deletedMovie);
    }
}
