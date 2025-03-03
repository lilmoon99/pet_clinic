package com.lilmoon.pet_clinic.dtos.visit;

import com.lilmoon.pet_clinic.dtos.pet.PetDTO;
import com.lilmoon.pet_clinic.dtos.petOwner.PetOwnerDTO;
import com.lilmoon.pet_clinic.dtos.vet.VetDTO;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class VisitDTO {
    private Long id;
    private PetDTO pet;
    private PetOwnerDTO petOwner;
    private VetDTO vet;
    private LocalDateTime startedAt;
}
