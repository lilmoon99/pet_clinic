package com.lilmoon.pet_clinic.dtos.petOwner;

import com.lilmoon.pet_clinic.dtos.pet.PetDTO;
import com.lilmoon.pet_clinic.dtos.visit.VisitDTO;
import lombok.Data;

import java.util.List;

@Data
public class PetOwnerDetailsDTO {
    private Long id;
    private String name;
    private String email;
    private List<PetDTO> pets;
    private List<VisitDTO> visits;
}
