package com.fjz.scp.ControlePonto.controller;
import com.fjz.scp.ControlePonto.model.TipoData;
import com.fjz.scp.ControlePonto.service.TipoDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/tipodata")
public class TipoDataController {

    @Autowired
    TipoDataService tipoDataService;


    @PostMapping
    public TipoData createTipodata(@RequestBody TipoData tipoData){
        return tipoDataService.save(tipoData);
    }

    @GetMapping
    public List<TipoData> getTipoDataList(){

        return tipoDataService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoData> getTipodataByID(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(tipoDataService.getById(id).orElseThrow(()-> new Exception("TipoData nao encontrada")));
    }

    @PutMapping
    public TipoData updateTipoData(@RequestBody TipoData tipoData){
        return tipoDataService.save(tipoData);
    }

    @DeleteMapping("/{id}")
    public void deleteTipodata(@PathVariable("id") Long id) throws Exception {
        ResponseEntity<TipoData> tipodata = this.getTipodataByID(id);
        tipoDataService.deleteById(tipodata.getBody().getId());
    }




}
