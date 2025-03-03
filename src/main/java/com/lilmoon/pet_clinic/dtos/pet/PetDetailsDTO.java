package com.lilmoon.pet_clinic.dtos.pet;

import com.lilmoon.pet_clinic.dtos.petOwner.PetOwnerDTO;
import com.lilmoon.pet_clinic.dtos.petTypeDTO.PetTypeDTO;
import com.lilmoon.pet_clinic.dtos.visit.VisitDTO;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class PetDetailsDTO {
    private Long id;
    private String name;
    private PetTypeDTO petType;
    private PetOwnerDTO petOwner;
    private List<VisitDTO> visits;
    private LocalDate birthDate;
}
