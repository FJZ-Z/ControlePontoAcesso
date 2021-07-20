package com.fjz.scp.ControlePonto.controller;
import com.fjz.scp.ControlePonto.model.Ocorrencia;
import com.fjz.scp.ControlePonto.service.OcorrenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/ocorrencia")
public class OcorrenciaController {

    @Autowired
    OcorrenciaService ocorrenciaService;


    @PostMapping
    public Ocorrencia createOcorrencia(@RequestBody Ocorrencia ocorrencia){
        return ocorrenciaService.save(ocorrencia);
    }

    @GetMapping
    public List<Ocorrencia> getOcorrenciaList(){

        return ocorrenciaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ocorrencia> getOcorrenciaByID(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(ocorrenciaService.getById(id).orElseThrow(()-> new Exception("Ocorrencia nao encontrada")));
    }

    @PutMapping
    public Ocorrencia updateOcorrencia(@RequestBody Ocorrencia ocorrencia){
        return ocorrenciaService.save(ocorrencia);
    }

    @DeleteMapping("/{id}")
    public void deleteOcorrencia(@PathVariable("id") Long id) throws Exception {
        ResponseEntity<Ocorrencia> ocorrencia = this.getOcorrenciaByID(id);
        ocorrenciaService.deleteById(ocorrencia.getBody().getId());
    }




}
