package com.fjz.scp.ControlePonto.repository;
import com.fjz.scp.ControlePonto.model.Ocorrencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcorrenciaRepository extends JpaRepository<Ocorrencia,Long> {
}
