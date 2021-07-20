package com.fjz.scp.ControlePonto.repository;
import com.fjz.scp.ControlePonto.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentacaoRepository extends JpaRepository<Movimentacao,Long> {
}
