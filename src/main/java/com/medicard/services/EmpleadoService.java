package com.medicard.services;

import com.medicard.dao.CRUD;
import com.medicard.models.Empleado;
import com.medicard.repository.EmpleadoRepository;

import java.util.List;

public class EmpleadoService extends CRUD<Empleado, EmpleadoRepository> {
    public EmpleadoService(EmpleadoRepository repository) {
        super(repository);
    }

    @Override
    public List<Empleado> list() {
        return repository.findAll();
    }

    @Override
    public Empleado get(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void add(Empleado o) {
        repository.save(o);
    }

    @Override
    public void updtate(Empleado o, int id) {
        o.setIdEmpleado(id);
        repository.save(o);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
