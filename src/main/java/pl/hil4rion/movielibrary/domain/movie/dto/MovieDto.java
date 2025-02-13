package pl.hil4rion.movielibrary.domain.movie.dto;

import lombok.Builder;

@Builder
public record MovieDto(Integer id,
                       String title,
                       String rating,
                       byte[] image) {
}
