package com.medicard.restcontrollers;


import com.medicard.models.ArchivoClinico;
import com.medicard.services.ArchivoClinicoService;
import com.medicard.util.Routes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Routes.ARCHIVOCLINICO)
public class ArchivoClinicoRestController {

    @Autowired
    ArchivoClinicoService service;

    @GetMapping(Routes.LIST)
    public List<ArchivoClinico> list(){
        return service.list();
    }

    @GetMapping(Routes.FIND)
    public ArchivoClinico findById(@PathVariable int id){
        return service.get(id);
    }

    @PostMapping(Routes.CREATE)
    public void add(@RequestBody ArchivoClinico archivoclinico){
        service.add(archivoclinico);
    }

    @PutMapping(Routes.EDIT)
    public void update(@RequestBody ArchivoClinico archivoclinico, @PathVariable int id){

        service.update(archivoclinico, id);
    }

    @DeleteMapping(Routes.REMOVE)
    public void delete(@PathVariable int id){
        service.delete(id);
    }

}
