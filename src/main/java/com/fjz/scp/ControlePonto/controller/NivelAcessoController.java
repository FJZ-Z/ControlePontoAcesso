package com.fjz.scp.ControlePonto.controller;
import com.fjz.scp.ControlePonto.model.NivelAcesso;
import com.fjz.scp.ControlePonto.service.NivelAcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/nivelacesso")
public class NivelAcessoController {

    @Autowired
    NivelAcessoService nivelAcessoService;


    @PostMapping
    public NivelAcesso createNivelAcesso(@RequestBody NivelAcesso nivelAcesso){
        return nivelAcessoService.save(nivelAcesso);
    }

    @GetMapping
    public List<NivelAcesso> getNivelAcessoList(){

        return nivelAcessoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<NivelAcesso> getNivelAcessoByID(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(nivelAcessoService.getById(id).orElseThrow(()-> new Exception("NivelAcesso nao encontrado")));
    }

    @PutMapping
    public NivelAcesso updateNivelAcesso(@RequestBody NivelAcesso nivelAcesso){
        return nivelAcessoService.save(nivelAcesso);
    }

    @DeleteMapping("/{id}")
    public void deleteNivelAcesso(@PathVariable("id") Long id) throws Exception {
        ResponseEntity<NivelAcesso> nivelAcesso = this.getNivelAcessoByID(id);
        nivelAcessoService.deleteById(nivelAcesso.getBody().getId());
    }




}
