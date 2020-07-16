package com.medicard.services;

import com.medicard.dao.CRUD;
import com.medicard.models.Vacunas;
import com.medicard.repository.VacunasRepository;

import java.util.List;

public class VacunasService extends CRUD<Vacunas, VacunasRepository> {
    public VacunasService(VacunasRepository repository) {
        super(repository);
    }

    @Override
    public List<Vacunas> list() {
        return repository.findAll();
    }

    @Override
    public Vacunas get(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void add(Vacunas o) {
        repository.save(o);
    }

    @Override
    public void updtate(Vacunas o, int id) {
        o.setIdVacuna(id);
        repository.save(o);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
