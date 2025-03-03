package com.lilmoon.pet_clinic.dtos.petOwner;

import com.lilmoon.pet_clinic.dtos.pet.PetDTO;
import lombok.Data;

import java.util.List;

@Data
public class PetOwnerWithPetsDTO {
    private Long id;
    private String name;
    private String email;
    private List<PetDTO> pets;
}
