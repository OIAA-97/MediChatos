package com.medicard.services;

import com.medicard.dao.CRUD;
import com.medicard.models.Paciente;
import com.medicard.repository.PacientesRepository;

import java.util.List;

public class PacienteService extends CRUD<Paciente, PacientesRepository> {
    public PacienteService(PacientesRepository repository) {
        super(repository);
    }

    @Override
    public List<Paciente> list() {
        return repository.findAll();
    }

    @Override
    public Paciente get(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void add(Paciente o) {
        repository.save(o);
    }

    @Override
    public void updtate(Paciente o, int id) {
        o.setNSS(id);
        repository.save(o);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
