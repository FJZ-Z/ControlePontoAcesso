package com.fjz.scp.ControlePonto.controller;
import com.fjz.scp.ControlePonto.model.Usuario;
import com.fjz.scp.ControlePonto.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;


    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }

    @GetMapping
    public List<Usuario> getUsuarioList(){

        return usuarioService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getUsuarioByID(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(usuarioService.getById(id).orElseThrow(()-> new Exception("Usuario nao encontrado")));
    }

    @PutMapping
    public Usuario updateUsuario(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }

    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable("id") Long id) throws Exception {
        ResponseEntity<Usuario> usuario = this.getUsuarioByID(id);
        usuarioService.deleteById(usuario.getBody().getId());
    }




}
