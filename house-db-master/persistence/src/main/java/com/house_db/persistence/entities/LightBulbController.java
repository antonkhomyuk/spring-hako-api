package com.house_db.persistence.entities;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("1")
@Data
public class LightBulbController extends Controller {

    @JoinColumn(name = "color_id")
    @ManyToOne
    private Color color;
}
