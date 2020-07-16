package com.medicard.services;

import com.medicard.dao.CRUD;
import com.medicard.models.Medicamentos;
import com.medicard.repository.MedicamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicamentoService extends CRUD<Medicamentos, MedicamentoRepository> {
    public MedicamentoService(MedicamentoRepository repository) {
        super(repository);
    }

    @Override
    public List<Medicamentos> list() {
        return repository.findAll();
    }

    @Override
    public Medicamentos get(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void add(Medicamentos o) {
        repository.save(o);
    }

    @Override
    public void updtate(Medicamentos o, int id) {
        o.setIdMed(id);
        repository.save(o);

    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
