package com.fjz.scp.ControlePonto.repository;
import com.fjz.scp.ControlePonto.model.NivelAcesso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NivelAcessoRepository extends JpaRepository<NivelAcesso,Long> {
}
