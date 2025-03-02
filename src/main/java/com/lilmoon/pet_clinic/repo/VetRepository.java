package com.lilmoon.pet_clinic.repo;

import com.lilmoon.pet_clinic.model.Vets.Vet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VetRepository extends JpaRepository<Vet,Long> {
}
