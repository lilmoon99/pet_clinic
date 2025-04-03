package com.lilmoon.pet_clinic.dtos.petTypeDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PetTypeDTO {
    private Long id;
    private String name;
}
