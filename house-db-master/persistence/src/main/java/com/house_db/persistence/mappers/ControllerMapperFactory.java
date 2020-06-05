package com.house_db.persistence.mappers;

import com.house_db.persistence.entities.ControllerType;
import org.springframework.stereotype.Component;

@Component
public class ControllerMapperFactory {

    private final TypeMapper typeMapper;
    private final StateMapper stateMapper;
    private final ColorMapper colorMapper;

    public ControllerMapperFactory(TypeMapper typeMapper, StateMapper stateMapper, ColorMapper colorMapper) {
        this.typeMapper = typeMapper;
        this.stateMapper = stateMapper;
        this.colorMapper = colorMapper;
    }

    public ControllerMapper getMapper(ControllerType type) {
        switch (type.getType()) {
            case "lock":
                return new LockControllerMapper(typeMapper, stateMapper);
            case "light_bulb":
                return new LightBulbControllerMapper(typeMapper, stateMapper, colorMapper);
            case "rosette":
                return new RosetteControllerMapper(typeMapper, stateMapper);
            default:
                return new DefaultControllerMapper(typeMapper, stateMapper);
        }
    }
}
