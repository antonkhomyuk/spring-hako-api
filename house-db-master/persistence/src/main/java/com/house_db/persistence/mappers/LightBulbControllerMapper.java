package com.house_db.persistence.mappers;

import com.house_db.persistence.dto.ControllerDto;
import com.house_db.persistence.entities.Controller;
import com.house_db.persistence.entities.LightBulbController;
import org.springframework.stereotype.Component;

@Component
public class LightBulbControllerMapper extends ControllerMapper{
    private final ColorMapper colorMapper;
    public LightBulbControllerMapper(TypeMapper typeMapper, StateMapper stateMapper, ColorMapper colorMapper) {
        super(typeMapper, stateMapper);
        this.colorMapper = colorMapper;
    }

    @Override
    public Controller toEntity(ControllerDto dto) {
        Controller controller = super.toEntity(dto);
        LightBulbController convertedController = (LightBulbController) controller;
        convertedController.setColor(colorMapper.toEntity(dto.getColor()));
        return controller;
    }

    @Override
    public ControllerDto toDto(Controller controller) {
        ControllerDto dto = super.toDto(controller);
        LightBulbController convertedController = (LightBulbController) controller;
        dto.setColor(colorMapper.toDto(convertedController.getColor()));
        return dto;
    }
}
