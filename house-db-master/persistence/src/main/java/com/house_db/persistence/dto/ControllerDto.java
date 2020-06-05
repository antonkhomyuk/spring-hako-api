package com.house_db.persistence.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ControllerDto {
    private ControllerTypeDto type;

    /*
     * 0 - Turned off
     * 1 - Turned on
     * */
    private StateDto state;

    private LocalDateTime turnedOn;

    private ColorDto color;

    private Double energyConsumption;

    private String name;
}
