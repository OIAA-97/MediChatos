package com.medicard.services;

import com.medicard.dao.CRUD;
import com.medicard.models.Receta;
import com.medicard.repository.RecetaRepository;

import java.util.List;

public class RecetaService extends CRUD<Receta, RecetaRepository> {
    public RecetaService(RecetaRepository repository) {
        super(repository);
    }

    @Override
    public List<Receta> list() {
        return repository.findAll();
    }

    @Override
    public Receta get(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void add(Receta o) {
        repository.save(o);
    }

    @Override
    public void updtate(Receta o, int id) {
        o.setIdReceta(id);
        repository.save(o);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
