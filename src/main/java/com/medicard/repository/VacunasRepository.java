package com.medicard.repository;

import com.medicard.models.Vacunas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacunasRepository extends JpaRepository<Vacunas, Integer> {
}
