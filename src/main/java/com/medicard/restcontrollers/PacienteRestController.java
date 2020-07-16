package com.medicard.restcontrollers;

import com.medicard.models.Paciente;
import com.medicard.services.PacienteService;
import com.medicard.util.Routes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Routes.PACIENTE)
public class PacienteRestController {

    @Autowired
    PacienteService service;

    @GetMapping(Routes.LIST)
    public List<Paciente> list(){
        return service.list();
    }

    @GetMapping(Routes.FIND)
    public Paciente findById(@PathVariable int id){
        return service.get(id);
    }

    @PostMapping(Routes.CREATE)
    public void add(@RequestBody Paciente paciente){
        service.add(paciente);
    }

    @PutMapping(Routes.EDIT)
    public void update(@RequestBody Paciente paciente, @PathVariable int id){

        service.update(paciente, id);
    }

    @DeleteMapping(Routes.REMOVE)
    public void delete(@PathVariable int id){
        service.delete(id);
    }

}
