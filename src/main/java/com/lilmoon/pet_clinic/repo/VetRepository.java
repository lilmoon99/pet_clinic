package com.lilmoon.pet_clinic.repo;

import com.lilmoon.pet_clinic.model.vets.Vet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VetRepository extends JpaRepository<Vet,Long> {
}
