package com.fjz.scp.ControlePonto.service;

import com.fjz.scp.ControlePonto.model.CategoriaUsuario;
import com.fjz.scp.ControlePonto.repository.CategoriaUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaUsuarioService {

    CategoriaUsuarioRepository categoriaUsuarioRepository;

    @Autowired

    public CategoriaUsuarioService(CategoriaUsuarioRepository categoriaUsuarioRepository) {
        this.categoriaUsuarioRepository = categoriaUsuarioRepository;
    }

    public List<CategoriaUsuario> findAll() {
        return categoriaUsuarioRepository.findAll();
    }

    public Optional<CategoriaUsuario> getById(Long aLong) {
        return categoriaUsuarioRepository.findById(aLong);
    }

    public <S extends CategoriaUsuario> S save(S entity) {
        return categoriaUsuarioRepository.save(entity);
    }
    public <S extends CategoriaUsuario> S update(S entity) {
        return categoriaUsuarioRepository.save(entity);
    }

    public void deleteById(Long aLong) {
        categoriaUsuarioRepository.deleteById(aLong);
    }
}
