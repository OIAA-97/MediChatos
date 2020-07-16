package com.medicard.restcontrollers;

import com.medicard.models.Factura;
import com.medicard.services.FacturaService;
import com.medicard.util.Routes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Routes.FACTURA)
public class FacturaRestController {

    @Autowired
    FacturaService service;

    @GetMapping(Routes.LIST)
    public List<Factura> list(){
        return service.list();
    }

    @GetMapping(Routes.FIND)
    public Factura findById(@PathVariable int id){
        return service.get(id);
    }

    @PostMapping(Routes.CREATE)
    public void add(@RequestBody Factura factura){
        service.add(factura);
    }

    @PutMapping(Routes.EDIT)
    public void update(@RequestBody Factura factura, @PathVariable int id){

        service.update(factura, id);
    }

    @DeleteMapping(Routes.REMOVE)
    public void delete(@PathVariable int id){
        service.delete(id);
    }
}
