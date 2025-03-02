package com.lilmoon.pet_clinic.repo;

import com.lilmoon.pet_clinic.model.Pets.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet,Long> {
}
