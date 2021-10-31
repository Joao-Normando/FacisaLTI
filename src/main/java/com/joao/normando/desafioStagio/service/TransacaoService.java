package com.joao.normando.desafioStagio.service;

import com.joao.normando.desafioStagio.model.Conta;
import com.joao.normando.desafioStagio.model.Transacao;
import com.joao.normando.desafioStagio.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional

public class TransacaoService {
    @Autowired
    private TransacaoRepository transacaoRepository;

    public Transacao salvar(Transacao transacao) {
        return transacaoRepository.save(transacao);
    }

    public List<Transacao> listar() {
        return transacaoRepository.findAll();
    }

}