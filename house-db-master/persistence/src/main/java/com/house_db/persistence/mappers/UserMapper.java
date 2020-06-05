package com.house_db.persistence.mappers;

import com.house_db.persistence.dto.UserDto;
import com.house_db.persistence.entities.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public User toEntity(UserDto dto) {
        return User.builder()
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .build();
    }

    public UserDto toDto(User entity) {
        return UserDto.builder()
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .build();
    }
}
