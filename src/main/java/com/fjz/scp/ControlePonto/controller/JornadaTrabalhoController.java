package com.fjz.scp.ControlePonto.controller;

import com.fjz.scp.ControlePonto.model.JornadaTrabalho;
import com.fjz.scp.ControlePonto.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/jornada")
public class JornadaTrabalhoController {

    @Autowired
    private JornadaService jornadaService;

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.save(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> getJornadaList(){

        return jornadaService.findAll();
    }

    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> getJornadaByID(@PathVariable("idJornada") Long idJornada) throws Exception {
        return ResponseEntity.ok(jornadaService.getById(idJornada).orElseThrow(()-> new Exception("jornada nao encontrada")));
    }

    @PutMapping
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.save(jornadaTrabalho);
    }

    @DeleteMapping("/{idJornada}")
    public void deleteJornada(@PathVariable("idJornada") Long idJornada) throws Exception {
        ResponseEntity<JornadaTrabalho> jornadaTrabalho = this.getJornadaByID(idJornada);
        jornadaService.delete(jornadaTrabalho.getBody().getId());
    }



}
