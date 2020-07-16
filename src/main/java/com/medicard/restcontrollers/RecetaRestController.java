package com.medicard.restcontrollers;


import com.medicard.models.Receta;
import com.medicard.services.RecetaService;
import com.medicard.util.Routes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Routes.RECETA)
public class RecetaRestController {

    @Autowired
    RecetaService service;

    @GetMapping(Routes.LIST)
    public List<Receta> list(){
        return service.list();
    }

    @GetMapping(Routes.FIND)
    public Receta findById(@PathVariable int id){
        return service.get(id);
    }

    @PostMapping(Routes.CREATE)
    public void add(@RequestBody Receta receta){
        service.add(receta);
    }

    @PutMapping(Routes.EDIT)
    public void update(@RequestBody Receta receta, @PathVariable int id){

        service.update(receta, id);
    }

    @DeleteMapping(Routes.REMOVE)
    public void delete(@PathVariable int id){
        service.delete(id);
    }
}
