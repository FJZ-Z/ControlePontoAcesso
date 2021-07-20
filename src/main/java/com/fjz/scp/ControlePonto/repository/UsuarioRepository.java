package com.fjz.scp.ControlePonto.repository;
import com.fjz.scp.ControlePonto.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
}
