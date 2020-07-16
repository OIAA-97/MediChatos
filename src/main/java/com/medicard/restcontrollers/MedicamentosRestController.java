package com.medicard.restcontrollers;

import com.medicard.models.Medicamentos;
import com.medicard.services.MedicamentoService;
import com.medicard.util.Routes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Routes.MEDICAMENTOS)
public class MedicamentosRestController {

    @Autowired
    MedicamentoService service;

    @GetMapping(Routes.LIST)
    public List<Medicamentos> list(){
        return service.list();
    }

    @GetMapping(Routes.FIND)
    public Medicamentos findById(@PathVariable int id){
        return service.get(id);
    }

    @PostMapping(Routes.CREATE)
    public void add(@RequestBody Medicamentos medicamentos){
        service.add(medicamentos);
    }

    @PutMapping(Routes.EDIT)
    public void update(@RequestBody Medicamentos medicamentos, @PathVariable int id){
        service.updtate(medicamentos, id);
    }

    @DeleteMapping(Routes.REMOVE)
    public void delete(@PathVariable int id){
        service.delete(id);
    }

}
