package com.medicard.repository;

import com.medicard.models.Medicamentos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentoRepository extends JpaRepository<Medicamentos, Integer> {
}
