package com.fjz.scp.ControlePonto.repository;

import com.fjz.scp.ControlePonto.model.CategoriaUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaUsuarioRepository extends JpaRepository<CategoriaUsuario,Long> {
}
