package com.lilmoon.pet_clinic.model.Pets;

import com.lilmoon.pet_clinic.model.Visit;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "pets")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pet_type_id")
    private PetType petType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pet_owner_id")
    private PetOwner petOwner;

    @OneToMany(mappedBy = "pet",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Visit> visits;

    @Column(name = "birth_date")
    private LocalDate birthDate;
}
