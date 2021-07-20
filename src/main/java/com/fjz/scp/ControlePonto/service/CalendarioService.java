package com.fjz.scp.ControlePonto.service;

import com.fjz.scp.ControlePonto.model.Calendario;
import com.fjz.scp.ControlePonto.repository.CalendarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalendarioService {
    CalendarioRepository calendarioRepository;

    @Autowired
    public CalendarioService(CalendarioRepository calendarioRepository) {
        this.calendarioRepository = calendarioRepository;
    }

    public List<Calendario> findAll() {
        return calendarioRepository.findAll();
    }

    public Optional<Calendario> getById(Long aLong) {
        return calendarioRepository.findById(aLong);
    }

    public <S extends Calendario> S save(S entity) {
        return calendarioRepository.save(entity);
    }
    public <S extends Calendario> S update(S entity) {
        return calendarioRepository.save(entity);
    }

    public void deleteById(Long aLong) {
        calendarioRepository.deleteById(aLong);
    }
}
