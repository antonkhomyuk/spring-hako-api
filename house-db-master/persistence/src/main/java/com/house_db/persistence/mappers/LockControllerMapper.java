package com.house_db.persistence.mappers;

import com.house_db.persistence.dto.ControllerDto;
import com.house_db.persistence.entities.Controller;
import org.springframework.stereotype.Component;

@Component
public class LockControllerMapper extends ControllerMapper {
    public LockControllerMapper(TypeMapper typeMapper, StateMapper stateMapper) {
        super(typeMapper, stateMapper);
    }

    @Override
    public Controller toEntity(ControllerDto dto) {
        return super.toEntity(dto);
    }

    @Override
    public ControllerDto toDto(Controller controller) {
        return super.toDto(controller);
    }
}
