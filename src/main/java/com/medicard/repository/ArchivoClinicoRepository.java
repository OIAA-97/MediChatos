package com.medicard.repository;

import com.medicard.models.ArchivoClinico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArchivoClinicoRepository extends JpaRepository<ArchivoClinico, Integer> {
}
