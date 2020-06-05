package com.house_db.persistence.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("2")
@Data
public class RosetteController extends Controller {
    /**
     * Energy consumption from this rosette in kW-h
     */
    @Column(name = "energy_consumption")
    private Double energyConsumption;
}
