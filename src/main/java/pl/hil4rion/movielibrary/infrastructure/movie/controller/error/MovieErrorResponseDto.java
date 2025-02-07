package pl.hil4rion.movielibrary.infrastructure.movie.controller.error;

import org.springframework.http.HttpStatus;

public record MovieErrorResponseDto(String message, HttpStatus status) {
}
