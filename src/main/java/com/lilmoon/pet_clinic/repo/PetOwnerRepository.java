package com.lilmoon.pet_clinic.repo;

import com.lilmoon.pet_clinic.model.Pets.PetOwner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetOwnerRepository extends JpaRepository<PetOwner,Long> {
}
