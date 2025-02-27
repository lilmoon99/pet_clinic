package com.lilmoon.pet_clinic.model;

import jakarta.persistence.*;
import org.springframework.context.annotation.Primary;

import java.time.LocalDate;

@Table(name = "Pet")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "pet_type")

    private PetType petType;
    @Column(name = "birth_date")
    private LocalDate birth_date;
}
