package com.fjz.scp.ControlePonto.controller;

import com.fjz.scp.ControlePonto.model.Calendario;
import com.fjz.scp.ControlePonto.model.CategoriaUsuario;
import com.fjz.scp.ControlePonto.service.CategoriaUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/categoriausuario")
public class CategoriaUsuarioController {
    @Autowired
    CategoriaUsuarioService categoriaUsuarioService;


    @PostMapping
    public CategoriaUsuario createCategoriaU(@RequestBody CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioService.save(categoriaUsuario);
    }

    @GetMapping
    public List<CategoriaUsuario> getCategoriaUList(){

        return categoriaUsuarioService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoriaUsuario> getCategoriaUByID(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(categoriaUsuarioService.getById(id).orElseThrow(()-> new Exception("categoriaUsuario nao encontrado")));
    }

    @PutMapping
    public CategoriaUsuario updateCategoriaU(@RequestBody CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioService.save(categoriaUsuario);
    }

    @DeleteMapping("/{id}")
    public void deleteCategoriaU(@PathVariable("id") Long id) throws Exception {
        ResponseEntity<CategoriaUsuario> categoriaU = this.getCategoriaUByID(id);
        categoriaUsuarioService.deleteById(categoriaU.getBody().getId());
    }


}
