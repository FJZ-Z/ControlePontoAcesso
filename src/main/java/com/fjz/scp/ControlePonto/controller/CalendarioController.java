package com.fjz.scp.ControlePonto.controller;


import com.fjz.scp.ControlePonto.model.Calendario;
import com.fjz.scp.ControlePonto.service.CalendarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/calendario")
public class CalendarioController {

    @Autowired
    CalendarioService calendarioService;

    @PostMapping
    public Calendario createCalendario(@RequestBody Calendario calendario){
        return calendarioService.save(calendario);
    }

    @GetMapping
    public List<Calendario> getCalendarioList(){

        return calendarioService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Calendario> getCalendarioByID(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(calendarioService.getById(id).orElseThrow(()-> new Exception("calendario nao encontrado")));
    }

    @PutMapping
    public Calendario updateCalendario(@RequestBody Calendario calendario){
        return calendarioService.save(calendario);
    }

    @DeleteMapping("/{id}")
    public void deleteCalendario(@PathVariable("id") Long id) throws Exception {
        ResponseEntity<Calendario> calendario = this.getCalendarioByID(id);
        calendarioService.deleteById(calendario.getBody().getId());
    }


}
