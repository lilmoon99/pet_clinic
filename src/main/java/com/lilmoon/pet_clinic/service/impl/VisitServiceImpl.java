package com.lilmoon.pet_clinic.service.impl;

import com.lilmoon.pet_clinic.dtos.pet.PetDTO;
import com.lilmoon.pet_clinic.dtos.petOwner.PetOwnerDTO;
import com.lilmoon.pet_clinic.dtos.vet.VetDTO;
import com.lilmoon.pet_clinic.dtos.visit.VisitDTO;
import com.lilmoon.pet_clinic.model.Visit;
import com.lilmoon.pet_clinic.model.exceptions.ResourceNotFoundException;
import com.lilmoon.pet_clinic.model.pets.Pet;
import com.lilmoon.pet_clinic.model.pets.PetOwner;
import com.lilmoon.pet_clinic.model.vets.Vet;
import com.lilmoon.pet_clinic.repo.PetOwnerRepository;
import com.lilmoon.pet_clinic.repo.PetRepository;
import com.lilmoon.pet_clinic.repo.VetRepository;
import com.lilmoon.pet_clinic.repo.VisitRepository;
import com.lilmoon.pet_clinic.service.Interfaces.VisitService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitServiceImpl implements VisitService {


    private final VisitRepository visitRepository;
    private final PetOwnerRepository petOwnerRepository;
    private final PetRepository petRepository;
    private final VetRepository vetRepository;

    public VisitServiceImpl(VisitRepository visitRepository, PetOwnerRepository petOwnerRepository, PetRepository petRepository, VetRepository vetRepository) {
        this.visitRepository = visitRepository;
        this.petOwnerRepository = petOwnerRepository;
        this.petRepository = petRepository;
        this.vetRepository = vetRepository;
    }

    @Override
    public VisitDTO createVisit(PetOwnerDTO petOwner, PetDTO pet, VetDTO vet) {
        return null;
    }

    @Override
    public VisitDTO getVisit(Long id) {
        return null;
    }

    @Override
    public VisitDTO updateVisit(Long id, VisitDTO visitDTO) {
        return null;
    }

    @Override
    public void deleteVisit(Long id) {

    }

    @Override
    public void addVisitToPet(Long petId, Long visitId) {
    Visit visit = visitRepository.findById(visitId).orElseThrow(() -> new ResourceNotFoundException("Visit not found"));
    Pet pet = petRepository.findById(petId).orElseThrow(() -> new ResourceNotFoundException("Pet not found"));
    visit.setPet(pet);
    pet.getVisits().add(visit);
    visitRepository.saveAndFlush(visit);
    petRepository.saveAndFlush(pet);
    }

    @Override
    public void addVisitToVet(Long vetId, Long visitId) {
        Visit visit = visitRepository.findById(visitId).orElseThrow(() -> new ResourceNotFoundException("Visit not found"));
        Vet vet = vetRepository.findById(vetId).orElseThrow(() -> new ResourceNotFoundException("Vet not found"));
        vet.getVisits().add(visit);
        visit.setVet(vet);

        visitRepository.saveAndFlush(visit);
        vetRepository.saveAndFlush(vet);
    }

    @Override
    public void addVisitToPetOwner(Long petOwnerId, Long visitId) {

        Visit visit = visitRepository.findById(visitId).orElseThrow(() -> new ResourceNotFoundException("Visit not found"));
        PetOwner petOwner = petOwnerRepository.findById(petOwnerId).orElseThrow(() -> new ResourceNotFoundException("Pet owner not found"));
        visit.setPetOwner(petOwner);
        petOwner.getVisits().add(visit);

        visitRepository.saveAndFlush(visit);
        petOwnerRepository.saveAndFlush(petOwner);
    }

    @Override
    public List<VisitDTO> gitVisitByPet(Long petId) {
        return List.of();
    }

    @Override
    public List<VisitDTO> gitVisitByVet(Long vetId) {
        return List.of();
    }

    @Override
    public List<VisitDTO> gitVisitByPetOwner(Long petOwnerId) {
        return List.of();
    }
}
