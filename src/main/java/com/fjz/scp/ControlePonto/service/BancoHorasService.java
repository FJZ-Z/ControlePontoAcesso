package com.fjz.scp.ControlePonto.service;

import com.fjz.scp.ControlePonto.model.BancoHoras;
import com.fjz.scp.ControlePonto.repository.BancoHorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BancoHorasService {

    BancoHorasRepository bancoHorasRepository;

    @Autowired
    public BancoHorasService(BancoHorasRepository bancoHorasRepository) {
        this.bancoHorasRepository = bancoHorasRepository;
    }

    public List<BancoHoras> findAll() {
        return bancoHorasRepository.findAll();
    }

    public <S extends BancoHoras> S save(S entity) {
        return bancoHorasRepository.save(entity);
    }

    public <S extends BancoHoras> S update(S entity) {
        return bancoHorasRepository.save(entity);
    }

    public Optional<BancoHoras> getById(Long aLong) {
        return bancoHorasRepository.findById(aLong);
    }

    public void deleteById(Long aLong) {
        bancoHorasRepository.deleteById(aLong);
    }

}
