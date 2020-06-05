package com.house_db.persistence.entities;


import lombok.Data;
import org.hibernate.annotations.DiscriminatorFormula;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "controllers")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorFormula("type_id")
@Data
public abstract class Controller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected Long id;

    @Column(name = "name")
    protected String name;

    @ManyToOne
    @JoinColumn(name = "type_id")
    protected ControllerType type;

    @ManyToOne
    @JoinColumn(name = "state_id")
    protected ControllerState state;

    @Column(name = "turned_on")
    protected LocalDateTime turnedOn;
}
