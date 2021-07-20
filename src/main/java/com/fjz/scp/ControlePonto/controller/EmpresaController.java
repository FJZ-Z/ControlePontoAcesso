package com.fjz.scp.ControlePonto.controller;
import com.fjz.scp.ControlePonto.model.Empresa;
import com.fjz.scp.ControlePonto.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/empresa")
public class EmpresaController {

    @Autowired
    EmpresaService empresaService;


    @PostMapping
    public Empresa createEmpresa(@RequestBody Empresa empresa){
        return empresaService.save(empresa);
    }

    @GetMapping
    public List<Empresa> getEmpresaList(){

        return empresaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Empresa> getEmpresaByID(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(empresaService.getById(id).orElseThrow(()-> new Exception("Empresa nao encontrada")));
    }

    @PutMapping
    public Empresa updateEmpresa(@RequestBody Empresa empresa){
        return empresaService.save(empresa);
    }

    @DeleteMapping("/{id}")
    public void deleteEmpresa(@PathVariable("id") Long id) throws Exception {
        ResponseEntity<Empresa> empresa = this.getEmpresaByID(id);
        empresaService.deleteById(empresa.getBody().getId());
    }




}
