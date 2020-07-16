package com.medicard.services;

import com.medicard.dao.CRUD;
import com.medicard.models.CitaMedica;
import com.medicard.repository.CitaMedicaRepository;

import java.util.List;

public class CitaMedicaService extends CRUD<CitaMedica, CitaMedicaRepository> {
    public CitaMedicaService(CitaMedicaRepository repository) {
        super(repository);
    }

    @Override
    public List<CitaMedica> list() {
        return repository.findAll();
    }

    @Override
    public CitaMedica get(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void add(CitaMedica o) {
        repository.save(o);
    }

    @Override
    public void updtate(CitaMedica o, int id) {
        o.setIdCita(id);
        repository.save(o);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
