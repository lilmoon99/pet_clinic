package com.lilmoon.pet_clinic.model.mapper;

import com.lilmoon.pet_clinic.dtos.pet.PetDetailsDTO;
import com.lilmoon.pet_clinic.dtos.petOwner.PetOwnerDTO;
import com.lilmoon.pet_clinic.dtos.petTypeDTO.PetTypeDTO;
import com.lilmoon.pet_clinic.model.pets.Pet;

public class PetMapper implements Mappable<Pet, PetDetailsDTO>{

    @Override
    public PetDetailsDTO mapToDTO(Pet entity) {

        PetTypeDTO petTypeDTO = PetTypeDTO.builder()
                .id(entity.getPetType().getId())
                .name(entity.getPetType().getPetTypeName())
                .build();

        PetOwnerDTO petOwnerDTO = PetOwnerDTO
                .builder()
                .id(entity.getPetOwner().getId())
                .name(entity.getPetOwner().getName())
                .build();
        return PetDetailsDTO
                .builder()
                .name(entity.getName())
                .petType(petTypeDTO)
                .petOwner(petOwnerDTO)
                .build();
    }

    @Override
    public Pet mapToEntity(PetDetailsDTO dto) {
        return null;
    }
}
