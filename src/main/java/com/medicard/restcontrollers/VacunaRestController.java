package com.medicard.restcontrollers;


import com.medicard.models.Vacunas;
import com.medicard.services.VacunasService;
import com.medicard.util.Routes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Routes.VACUNAS)
public class VacunaRestController {

    @Autowired
    VacunasService service;

    @GetMapping(Routes.LIST)
    public List<Vacunas> list(){
        return service.list();
    }

    @GetMapping(Routes.FIND)
    public Vacunas findById(@PathVariable int id){
        return service.get(id);
    }

    @PostMapping(Routes.CREATE)
    public void add(@RequestBody Vacunas vacunas){
        service.add(vacunas);
    }

    @PutMapping(Routes.EDIT)
    public void update(@RequestBody Vacunas vacunas, @PathVariable int id){

        service.update(vacunas, id);
    }

    @DeleteMapping(Routes.REMOVE)
    public void delete(@PathVariable int id){
        service.delete(id);
    }
}
