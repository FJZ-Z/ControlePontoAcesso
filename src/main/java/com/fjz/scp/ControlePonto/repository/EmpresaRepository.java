package com.fjz.scp.ControlePonto.repository;

import com.fjz.scp.ControlePonto.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa,Long> {
}
