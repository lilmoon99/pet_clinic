package com.lilmoon.pet_clinic.service.Interfaces;

import com.lilmoon.pet_clinic.dtos.pet.PetDTO;
import com.lilmoon.pet_clinic.dtos.petOwner.PetOwnerDTO;
import com.lilmoon.pet_clinic.dtos.vet.VetDTO;
import com.lilmoon.pet_clinic.dtos.visit.VisitDTO;

public interface VisitServiceInterface {
    VisitDTO createVisit(PetOwnerDTO petOwner, PetDTO pet, VetDTO vet);
    VisitDTO getVisit(Long id);
    VisitDTO updateVisit(Long id, VisitDTO visitDTO);
    void deleteVisit(Long id);

    void addVisitToPet(Long petId, VisitDTO visitDTO);
    void addVisitToVet(Long vetId, VisitDTO visitDTO);
    void addVisitToPetOwner(Long petOwnerId, VisitDTO visitDTO);


}
