package com.fjz.scp.ControlePonto.service;

import com.fjz.scp.ControlePonto.model.Usuario;
import com.fjz.scp.ControlePonto.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public <S extends Usuario> S save(S entity) {
        return usuarioRepository.save(entity);
    }

    public Optional<Usuario> getById(Long aLong) {
        return usuarioRepository.findById(aLong);
    }

    public void deleteById(Long aLong) {
        usuarioRepository.deleteById(aLong);
    }
}
