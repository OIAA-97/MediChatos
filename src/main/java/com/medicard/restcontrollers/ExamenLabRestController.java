package com.medicard.restcontrollers;


import com.medicard.models.ExamenLab;
import com.medicard.services.ExamenLabService;
import com.medicard.util.Routes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Routes.EXAMENLAB)
public class ExamenLabRestController {

    @Autowired
    ExamenLabService service;

    @GetMapping(Routes.LIST)
    public List<ExamenLab> list(){
        return service.list();
    }

    @GetMapping(Routes.FIND)
    public ExamenLab findById(@PathVariable int id){
        return service.get(id);
    }

    @PostMapping(Routes.CREATE)
    public void add(@RequestBody ExamenLab examenLab){
        service.add(examenLab);
    }

    @PutMapping(Routes.EDIT)
    public void update(@RequestBody ExamenLab examenLab, @PathVariable int id){

        service.update(examenLab, id);
    }

    @DeleteMapping(Routes.REMOVE)
    public void delete(@PathVariable int id) {
        service.delete(id);
    }
}
