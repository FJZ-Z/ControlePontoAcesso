package com.fjz.scp.ControlePonto.controller;

import com.fjz.scp.ControlePonto.model.BancoHoras;
import com.fjz.scp.ControlePonto.service.BancoHorasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/bancohoras")
public class BancoHorasController {

    @Autowired
    BancoHorasService bancoHorasService;

    @PostMapping
    public BancoHoras createBancoHoras(@RequestBody BancoHoras bancoHoras){
        return bancoHorasService.save(bancoHoras);
    }

    @GetMapping
    public List<BancoHoras> getBancoHorasList(){

        return bancoHorasService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BancoHoras> getBancoHorasByID(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(bancoHorasService.getById(id).orElseThrow(()-> new Exception("BancoHoras nao encontrado")));
    }

    @PutMapping
    public BancoHoras updateBancoHoras(@RequestBody BancoHoras bancoHoras){
        return bancoHorasService.save(bancoHoras);
    }

}
