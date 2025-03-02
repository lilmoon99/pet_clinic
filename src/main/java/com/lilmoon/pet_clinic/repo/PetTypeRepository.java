package com.lilmoon.pet_clinic.repo;

import com.lilmoon.pet_clinic.model.Pets.PetType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetTypeRepository extends JpaRepository<PetType,Long> {
}
