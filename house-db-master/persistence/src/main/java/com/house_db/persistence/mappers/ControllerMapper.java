package com.house_db.persistence.mappers;

import com.house_db.persistence.dto.ControllerDto;
import com.house_db.persistence.entities.Controller;
import org.springframework.stereotype.Component;

@Component
public abstract class ControllerMapper {
    protected final TypeMapper typeMapper;
    protected final StateMapper stateMapper;

    protected ControllerMapper(TypeMapper typeMapper, StateMapper stateMapper) {
        this.typeMapper = typeMapper;
        this.stateMapper = stateMapper;
    }


    public Controller toEntity(ControllerDto dto) {
        throw new UnsupportedOperationException();
    }

    public ControllerDto toDto(Controller controller) {
        return ControllerDto.builder()
                .type(typeMapper.toDto(controller.getType()))
                .state(stateMapper.toDto(controller.getState()))
                .name(controller.getName())
                .turnedOn(controller.getTurnedOn())
                .build();
    }
}
