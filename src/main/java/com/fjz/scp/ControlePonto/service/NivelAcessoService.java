package com.fjz.scp.ControlePonto.service;

import com.fjz.scp.ControlePonto.model.NivelAcesso;
import com.fjz.scp.ControlePonto.repository.NivelAcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NivelAcessoService {

    NivelAcessoRepository nivelAcessoRepository;

    @Autowired
    public NivelAcessoService(NivelAcessoRepository nivelAcessoRepository) {
        this.nivelAcessoRepository = nivelAcessoRepository;
    }

    public List<NivelAcesso> findAll() {
        return nivelAcessoRepository.findAll();
    }

    public <S extends NivelAcesso> S save(S entity) {
        return nivelAcessoRepository.save(entity);
    }

    public Optional<NivelAcesso> getById(Long aLong) {
        return nivelAcessoRepository.findById(aLong);
    }

    public void deleteById(Long aLong) {
        nivelAcessoRepository.deleteById(aLong);
    }
}
