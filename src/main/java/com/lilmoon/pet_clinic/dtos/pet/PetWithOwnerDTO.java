package com.lilmoon.pet_clinic.dtos.pet;

import com.lilmoon.pet_clinic.dtos.petOwner.PetOwnerDTO;
import lombok.Data;

import java.time.LocalDate;

@Data
public class PetWithOwnerDTO
{
    private Long id;
    private String name;
    private String petType;
    private LocalDate birthDate;
    private PetOwnerDTO owner;
}
