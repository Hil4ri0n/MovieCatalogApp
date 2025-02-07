package pl.hil4rion.movielibrary.domain.loginandregister.dto;

import lombok.Builder;

@Builder
public record UserDto(Long id, String username, String password) {
}
