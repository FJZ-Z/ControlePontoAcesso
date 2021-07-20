package com.fjz.scp.ControlePonto.service;

import com.fjz.scp.ControlePonto.model.Ocorrencia;
import com.fjz.scp.ControlePonto.repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OcorrenciaService {

    OcorrenciaRepository ocorrenciaRepository;

    @Autowired
    public OcorrenciaService(OcorrenciaRepository ocorrenciaRepository) {
        this.ocorrenciaRepository = ocorrenciaRepository;
    }

    public List<Ocorrencia> findAll() {
        return ocorrenciaRepository.findAll();
    }

    public <S extends Ocorrencia> S save(S entity) {
        return ocorrenciaRepository.save(entity);
    }

    public Optional<Ocorrencia> getById(Long aLong) {
        return ocorrenciaRepository.findById(aLong);
    }

    public void deleteById(Long aLong) {
        ocorrenciaRepository.deleteById(aLong);
    }
}
