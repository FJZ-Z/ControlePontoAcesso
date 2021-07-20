package com.fjz.scp.ControlePonto.service;

import com.fjz.scp.ControlePonto.model.Empresa;
import com.fjz.scp.ControlePonto.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {

    EmpresaRepository empresaRepository;

    @Autowired
    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public List<Empresa> findAll() {
        return empresaRepository.findAll();
    }

    public <S extends Empresa> S save(S entity) {
        return empresaRepository.save(entity);
    }

    public Optional<Empresa> getById(Long aLong) {
        return empresaRepository.findById(aLong);
    }

    public void deleteById(Long aLong) {
        empresaRepository.deleteById(aLong);
    }
}
