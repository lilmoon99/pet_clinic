package com.lilmoon.pet_clinic.dtos.petTypeDTO;

import com.lilmoon.pet_clinic.dtos.pet.PetDTO;
import lombok.Data;

import java.util.Set;

@Data
public class PetTypeDetailsDTO {
    private Long id;
    private String petTypeName;
    private Set<PetDTO> pets;
}
