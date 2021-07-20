package com.fjz.scp.ControlePonto.service;
import com.fjz.scp.ControlePonto.model.Movimentacao;
import com.fjz.scp.ControlePonto.repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimentacaoService {

    MovimentacaoRepository movimentacaoRepository;

    @Autowired
    public MovimentacaoService(MovimentacaoRepository movimentacaoRepository) {
        this.movimentacaoRepository = movimentacaoRepository;
    }

    public List<Movimentacao> findAll() {
        return movimentacaoRepository.findAll();
    }

    public <S extends Movimentacao> S save(S entity) {
        return movimentacaoRepository.save(entity);
    }

    public <S extends Movimentacao> S update(S entity) {
        return movimentacaoRepository.save(entity);
    }

    public Optional<Movimentacao> getById(Long aLong) {
        return movimentacaoRepository.findById(aLong);
    }

    public void deleteById(Long aLong) {
        movimentacaoRepository.deleteById(aLong);
    }

}
