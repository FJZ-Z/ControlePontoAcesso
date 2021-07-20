package com.fjz.scp.ControlePonto.service;

import com.fjz.scp.ControlePonto.model.TipoData;
import com.fjz.scp.ControlePonto.repository.TipoDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDataService {

    TipoDataRepository tipoDataRepository;

    @Autowired
    public TipoDataService(TipoDataRepository tipoDataRepository) {
        this.tipoDataRepository = tipoDataRepository;
    }

    public List<TipoData> findAll() {
        return tipoDataRepository.findAll();
    }

    public <S extends TipoData> S save(S entity) {
        return tipoDataRepository.save(entity);
    }

    public Optional<TipoData> getById(Long aLong) {
        return tipoDataRepository.findById(aLong);
    }

    public void deleteById(Long aLong) {
        tipoDataRepository.deleteById(aLong);
    }
}
