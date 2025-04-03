package com.lilmoon.pet_clinic.service.Interfaces;

import com.lilmoon.pet_clinic.dtos.pet.PetDTO;
import com.lilmoon.pet_clinic.dtos.petOwner.PetOwnerDTO;
import com.lilmoon.pet_clinic.dtos.vet.VetDTO;
import com.lilmoon.pet_clinic.dtos.visit.VisitDTO;

import java.util.List;

public interface VisitService {
    VisitDTO createVisit(PetOwnerDTO petOwner, PetDTO pet, VetDTO vet);
    VisitDTO getVisit(Long id);
    VisitDTO updateVisit(Long id, VisitDTO visitDTO);
    void deleteVisit(Long id);

    void addVisitToPet(Long petId, Long visitId);
    void addVisitToVet(Long vetId, Long visitId);
    void addVisitToPetOwner(Long petOwnerId, Long visitId);


    List<VisitDTO> gitVisitByPet(Long petId);
    List<VisitDTO> gitVisitByVet(Long vetId);
    List<VisitDTO> gitVisitByPetOwner(Long petOwnerId);
}
