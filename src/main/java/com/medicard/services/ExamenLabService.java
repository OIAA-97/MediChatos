package com.medicard.services;

import com.medicard.dao.CRUD;
import com.medicard.models.ExamenLab;
import com.medicard.repository.ExamenLabRepository;

import java.util.List;

public class ExamenLabService extends CRUD<ExamenLab, ExamenLabRepository> {
    public ExamenLabService(ExamenLabRepository repository) {
        super(repository);
    }

    @Override
    public List<ExamenLab> list() {
        return repository.findAll();
    }

    @Override
    public ExamenLab get(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void add(ExamenLab o) {
        repository.save(o);
    }

    @Override
    public void updtate(ExamenLab o, int id) {
        o.setIdExamen(id);
        repository.save(o);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
