package com.medicard.services;

import com.medicard.dao.CRUD;
import com.medicard.models.Factura;
import com.medicard.repository.FacturaRepository;

import java.util.List;

public class FacturaService extends CRUD<Factura, FacturaRepository> {
    public FacturaService(FacturaRepository repository) {
        super(repository);
    }

    @Override
    public List<Factura> list() {
        return repository.findAll();
    }

    @Override
    public Factura get(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void add(Factura o) {
        repository.save(o);
    }

    @Override
    public void updtate(Factura o, int id) {
        o.setIdFactura(id);
        repository.save(o);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
