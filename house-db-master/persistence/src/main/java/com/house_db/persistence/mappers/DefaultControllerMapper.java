package com.house_db.persistence.mappers;

import com.house_db.persistence.dto.ControllerDto;
import com.house_db.persistence.entities.Controller;
import org.springframework.stereotype.Component;

@Component
public class DefaultControllerMapper extends ControllerMapper {

    public DefaultControllerMapper(TypeMapper typeMapper, StateMapper stateMapper) {
        super(typeMapper, stateMapper);
    }

    public Controller toEntity(ControllerDto dto) {
        return super.toEntity(dto);
    }

    public ControllerDto toDto(Controller controller) {
        return super.toDto(controller);
    }
}
