package com.fjz.scp.ControlePonto.repository;

import com.fjz.scp.ControlePonto.model.BancoHoras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BancoHorasRepository extends JpaRepository<BancoHoras,Long> {
}
