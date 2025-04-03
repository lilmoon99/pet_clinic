package com.lilmoon.pet_clinic.dtos.petOwner;

import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class PetOwnerDTO {
    private Long id;
    private String name;
    private String email;
}
