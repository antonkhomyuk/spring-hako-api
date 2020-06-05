package com.house_db.persistence.mappers;

import com.house_db.persistence.dto.ControllerDto;
import com.house_db.persistence.entities.Controller;
import com.house_db.persistence.entities.RosetteController;
import org.springframework.stereotype.Component;

@Component
public class RosetteControllerMapper extends ControllerMapper {
    public RosetteControllerMapper(TypeMapper typeMapper, StateMapper stateMapper) {
        super(typeMapper, stateMapper);
    }

    @Override
    public Controller toEntity(ControllerDto dto) {
        Controller controller = super.toEntity(dto);
        RosetteController convertedController = (RosetteController) controller;
        convertedController.setEnergyConsumption(dto.getEnergyConsumption());
        return controller;
    }

    @Override
    public ControllerDto toDto(Controller controller) {
        ControllerDto dto = super.toDto(controller);
        RosetteController convertedController = (RosetteController) controller;
        dto.setEnergyConsumption(convertedController.getEnergyConsumption());
        return dto;
    }
}
