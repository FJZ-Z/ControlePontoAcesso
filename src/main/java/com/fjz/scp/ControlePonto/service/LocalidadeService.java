package com.fjz.scp.ControlePonto.service;


import com.fjz.scp.ControlePonto.model.Localidade;
import com.fjz.scp.ControlePonto.repository.LocalidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalidadeService {

    LocalidadeRepository localidadeRepository;

    @Autowired
    public LocalidadeService(LocalidadeRepository localidadeRepository) {
        this.localidadeRepository = localidadeRepository;
    }

    public List<Localidade> findAll() {
        return localidadeRepository.findAll();
    }

    public <S extends Localidade> S save(S entity) {
        return localidadeRepository.save(entity);
    }

    public <S extends Localidade> S update(S entity) {
        return localidadeRepository.save(entity);
    }

    public Optional<Localidade> getById(Long aLong) {
        return localidadeRepository.findById(aLong);
    }

    public void deleteById(Long aLong) {
        localidadeRepository.deleteById(aLong);
    }
}
