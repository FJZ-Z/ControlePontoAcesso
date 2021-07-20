package com.fjz.scp.ControlePonto.repository;

import com.fjz.scp.ControlePonto.model.Localidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalidadeRepository extends JpaRepository<Localidade,Long> {
}
