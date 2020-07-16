package com.medicard.repository;

import com.medicard.models.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository  extends JpaRepository<Empleado, Integer> {
}
