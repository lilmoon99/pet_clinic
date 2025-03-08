package com.lilmoon.pet_clinic.model.vets;

import com.lilmoon.pet_clinic.model.Visit;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "vets")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Vet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "vet_specialties",joinColumns = @JoinColumn(name = "vet_id"),inverseJoinColumns = @JoinColumn(name = "vet_speciality_id"))
    private Set<VetSpeciality> vetSpecialities = new HashSet<>();

    @OneToMany(mappedBy = "vet",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Visit> visits;

    public void addSpecialty(VetSpeciality vetSpeciality){
        this.vetSpecialities.add(vetSpeciality);
    }

    public void removeSpeciality(VetSpeciality vetSpeciality){
        this.vetSpecialities.remove(vetSpeciality);
    }

}
