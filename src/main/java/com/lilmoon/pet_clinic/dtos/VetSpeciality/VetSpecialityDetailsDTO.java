package com.lilmoon.pet_clinic.dtos.VetSpeciality;

import com.lilmoon.pet_clinic.dtos.vet.VetDTO;
import lombok.Data;

import java.util.Set;

@Data
public class VetSpecialityDetailsDTO {
    private Long id;
    private String name;
    private Set<VetDTO> vets;
}
