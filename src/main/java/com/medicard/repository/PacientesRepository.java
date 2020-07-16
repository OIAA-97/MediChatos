package com.medicard.repository;

import com.medicard.models.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacientesRepository extends JpaRepository<Paciente, Integer> {
}
