package com.medicard.restcontrollers;


import com.medicard.models.CitaMedica;
import com.medicard.services.CitaMedicaService;
import com.medicard.util.Routes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Routes.CITAMEDICA)
public class CitaMedicaRestController {

    @Autowired
    CitaMedicaService service;

    @GetMapping(Routes.LIST)
    public List<CitaMedica> list(){
        return service.list();
    }

    @GetMapping(Routes.FIND)
    public CitaMedica findById(@PathVariable int id){
        return service.get(id);
    }

    @PostMapping(Routes.CREATE)
    public void add(@RequestBody CitaMedica citamedica){
        service.add(citamedica);
    }

    @PutMapping(Routes.EDIT)
    public void update(@RequestBody CitaMedica citamedica, @PathVariable int id){

        service.update(citamedica, id);
    }

    @DeleteMapping(Routes.REMOVE)
    public void delete(@PathVariable int id){
        service.delete(id);
    }
}
