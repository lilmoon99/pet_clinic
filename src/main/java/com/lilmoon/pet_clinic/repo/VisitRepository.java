package com.lilmoon.pet_clinic.repo;

import com.lilmoon.pet_clinic.model.Visit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitRepository extends JpaRepository<Visit,Long> {
}
