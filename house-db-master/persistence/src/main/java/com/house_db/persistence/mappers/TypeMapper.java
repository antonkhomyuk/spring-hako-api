package com.house_db.persistence.mappers;

import com.house_db.persistence.dto.ControllerTypeDto;
import com.house_db.persistence.entities.ControllerType;
import com.house_db.persistence.exceptions.TypeNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class TypeMapper {

    public ControllerType toEntity(ControllerTypeDto dto) {
        switch (dto.getType()) {
            case "socket":
                return ControllerType.SOCKET_CONTROLLER;
            case "lock":
                return ControllerType.LOCK_CONTROLLER;
            case "light_bulb":
                return ControllerType.LIGHT_BULB_CONTROLLER;
            default:
                throw new TypeNotFoundException(dto.getType());
        }
    }

    public ControllerTypeDto toDto(ControllerType type) {
        return ControllerTypeDto.builder()
                .id(type.getId())
                .type(type.getType())
                .build();
    }
}
