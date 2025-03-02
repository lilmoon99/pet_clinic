package com.lilmoon.pet_clinic.model.Pets;

import com.lilmoon.pet_clinic.model.Visit;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "pet_owners")
public class PetOwner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "petOwner",cascade = CascadeType.ALL)
    private List<Pet> pets;

    @OneToMany(mappedBy = "petOwner",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Visit> visits;
}
