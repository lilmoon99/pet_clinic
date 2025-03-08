package com.lilmoon.pet_clinic.model.pets;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "pet_types")
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class PetType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pet_type_name")
    private String petTypeName;

    @OneToMany(mappedBy = "petType", cascade =CascadeType.ALL)
    private Set<Pet> pets;
}
