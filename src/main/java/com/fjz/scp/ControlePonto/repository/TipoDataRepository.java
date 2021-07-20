package com.fjz.scp.ControlePonto.repository;
import com.fjz.scp.ControlePonto.model.TipoData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDataRepository extends JpaRepository<TipoData,Long> {
}
