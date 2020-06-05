package com.house_db.persistence.mappers;

import com.house_db.persistence.dto.ColorDto;
import com.house_db.persistence.entities.Color;
import org.springframework.stereotype.Component;

@Component
public class ColorMapper {
    public Color toEntity(ColorDto dto) {
        throw new UnsupportedOperationException();
    }

    public ColorDto toDto(Color color) {
        return ColorDto.builder()
                .red(color.getRed())
                .green(color.getGreen())
                .blue(color.getBlue())
                .build();
    }
}
