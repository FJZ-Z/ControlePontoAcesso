package com.fjz.scp.ControlePonto.controller;

import com.fjz.scp.ControlePonto.model.Movimentacao;
import com.fjz.scp.ControlePonto.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/movimentacao")
public class MovimentacaoController {

    @Autowired
    MovimentacaoService movimentacaoService;

    @PostMapping
    public Movimentacao createMovimentacao(@RequestBody Movimentacao movimentacao){
        return movimentacaoService.save(movimentacao);
    }

    @GetMapping
    public List<Movimentacao> getMovimentacaoList(){

        return movimentacaoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movimentacao> getMovimentacaoByID(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(movimentacaoService.getById(id).orElseThrow(()-> new Exception("BancoHoras nao encontrado")));
    }

    @PutMapping
    public Movimentacao updateMovimentacao(@RequestBody Movimentacao movimentacao){
        return movimentacaoService.save(movimentacao);
    }


}
