package com.lilmoon.pet_clinic.service.Interfaces;

import com.lilmoon.pet_clinic.dtos.pet.PetDTO;
import com.lilmoon.pet_clinic.dtos.petOwner.PetOwnerDTO;
import com.lilmoon.pet_clinic.dtos.petOwner.PetOwnerWithPetsDTO;

public interface PetOwnerServiceInterface {

    //TODO
    // 0 Improve DTOs and create validators
    // 1 create owner
    // 2 add pet to owner
    // 3 search methods(id, email etc.)
    // 4 delete owner
    // 5 delete pet from owner
    // 6 update owner(email, pets)

    PetOwnerWithPetsDTO createPetOwnerWithPet(PetOwnerDTO owner, PetDTO pet);

}
