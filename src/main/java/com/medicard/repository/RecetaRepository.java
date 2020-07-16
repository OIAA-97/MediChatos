package com.medicard.repository;

import com.medicard.models.Receta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecetaRepository extends JpaRepository<Receta, Integer> {
}
