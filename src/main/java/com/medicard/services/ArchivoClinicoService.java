package com.medicard.services;

import com.medicard.dao.CRUD;
import com.medicard.models.ArchivoClinico;
import com.medicard.repository.ArchivoClinicoRepository;

import java.util.List;

public class ArchivoClinicoService extends CRUD<ArchivoClinico, ArchivoClinicoRepository> {
    public ArchivoClinicoService(ArchivoClinicoRepository repository) {
        super(repository);
    }

    @Override
    public List<ArchivoClinico> list() {
        return repository.findAll();
    }

    @Override
    public ArchivoClinico get(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void add(ArchivoClinico o) {
        repository.save(o);
    }

    @Override
    public void updtate(ArchivoClinico o, int id) {
        o.setNSS(id);
        repository.save(o);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
