package com.fjz.scp.ControlePonto.repository;

import com.fjz.scp.ControlePonto.model.Calendario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarioRepository extends JpaRepository<Calendario,Long> {
}
