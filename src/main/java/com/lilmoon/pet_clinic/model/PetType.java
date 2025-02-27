package com.lilmoon.pet_clinic.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "Pet_type")
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class PetType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pet_type_id")
    private Long id;
    @Column(name = "name")
    private String name;
}
