package com.house_db.persistence.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "colors")
@Data
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "red")
    private Byte red;

    @Column(name = "green")
    private Byte green;

    @Column(name = "blue")
    private Byte blue;
}
