package com.medicard.restcontrollers;

import com.medicard.models.Empleado;
import com.medicard.models.Medicamentos;
import com.medicard.services.EmpleadoService;
import com.medicard.util.Routes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Routes.EMPLEADOS)
public class EmpleadoRestController {

    @Autowired
    EmpleadoService service;

    @GetMapping(Routes.LIST)
    public List<Empleado> list(){
        return service.list();
    }

    @GetMapping(Routes.FIND)
    public Empleado findById(@PathVariable int id){
        return service.get(id);
    }

    @PostMapping(Routes.CREATE)
    public void add(@RequestBody Empleado empleado){
        service.add(empleado);
    }

    @PutMapping(Routes.EDIT)
    public void update(@RequestBody Empleado empleado, @PathVariable int id){
        service.updtate(empleado, id);
    }

    @DeleteMapping(Routes.REMOVE)
    public void delete(@PathVariable int id) {
        service.delete(id);
    }
}
