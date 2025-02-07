package pl.hil4rion.movielibrary.domain.movie;

import pl.hil4rion.movielibrary.domain.movie.dto.MovieDto;
import pl.hil4rion.movielibrary.domain.movie.dto.MovieRequestDto;

class MovieMapper {
    static Movie mapFromMovieRequestDtoToMovie(MovieRequestDto movieRequestDto) {
        return Movie.builder()
                .title(movieRequestDto.title())
                .rating(movieRequestDto.rating())
                .image(movieRequestDto.image())
                .build();
    }
    static MovieDto mapFromMovieToDto(Movie movie) {
        return MovieDto.builder()
                .id(movie.getId())
                .title(movie.getTitle())
                .rating(movie.getRating())
                .image(movie.getImage())
                .build();
    }
}
