package com.house_db.persistence.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "controller_state")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ControllerState {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "state")
    private String state;

    public static final ControllerState OFF = new ControllerState(0L, "off");
    public static final ControllerState ON = new ControllerState(1L, "on");
}
