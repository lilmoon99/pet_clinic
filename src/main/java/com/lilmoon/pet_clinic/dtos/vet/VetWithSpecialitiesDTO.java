package com.lilmoon.pet_clinic.dtos.vet;

import com.lilmoon.pet_clinic.dtos.VetSpeciality.VetSpecialityDTO;
import com.lilmoon.pet_clinic.model.Vets.VetSpeciality;

import java.util.Set;

public class VetWithSpecialitiesDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private Set<VetSpecialityDTO> specialities;
}
