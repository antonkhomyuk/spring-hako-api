package com.house_db.persistence.mappers;

import com.house_db.persistence.dto.StateDto;
import com.house_db.persistence.entities.ControllerState;
import org.springframework.stereotype.Component;

@Component
public class StateMapper {

    public ControllerState toEntity(StateDto dto) {
        throw new UnsupportedOperationException();
    }

    public StateDto toDto(ControllerState state) {
        return StateDto.builder()
                .id(state.getId())
                .state(state.getState())
                .build();
    }
}
