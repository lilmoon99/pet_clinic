package com.lilmoon.pet_clinic.dtos.pet;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PetDTO {
    private Long id;
    private String name;
    private String petType;
    private LocalDate birthDate;
}
