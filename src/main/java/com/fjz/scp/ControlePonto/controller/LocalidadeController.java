package com.fjz.scp.ControlePonto.controller;
import com.fjz.scp.ControlePonto.model.Localidade;
import com.fjz.scp.ControlePonto.service.LocalidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/localidade")
public class LocalidadeController {

    @Autowired
    LocalidadeService localidadeService;


    @PostMapping
    public Localidade createLocalidade(@RequestBody Localidade localidade){
        return localidadeService.save(localidade);
    }

    @GetMapping
    public List<Localidade> getLocalidadeList(){

        return localidadeService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Localidade> getLocalidadeByID(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(localidadeService.getById(id).orElseThrow(()-> new Exception("Localidade nao encontrada")));
    }

    @PutMapping
    public Localidade updateLocalidade(@RequestBody Localidade localidade){
        return localidadeService.save(localidade);
    }

    @DeleteMapping("/{id}")
    public void deleteLocalidade(@PathVariable("id") Long id) throws Exception {
        ResponseEntity<Localidade> localidade = this.getLocalidadeByID(id);
        localidadeService.deleteById(localidade.getBody().getId());
    }




}
