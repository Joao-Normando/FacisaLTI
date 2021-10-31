package com.joao.normando.desafioStagio.service;

import com.joao.normando.desafioStagio.model.Conta;
import com.joao.normando.desafioStagio.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ContaService {
    @Autowired
    ContaRepository contaRepository;

    @Autowired
    public List<Conta> listarContas() {
        List<Conta> contas = new ArrayList<>();
        contaRepository.findAll().forEach(conta -> contas.add(conta));
        return contas;
    }

    public Conta buscar(Integer id) {
        return contaRepository.findById(id).get();
    }

    public Conta adicionarOuAtualizar(Conta conta) {
        return contaRepository.save(conta);
    }

    public void remover(Integer id) {
        contaRepository.deleteById(id);
    }

    public void sacar (Integer id, Double valor ){
        Conta conta = contaRepository.findById(id).get();
        Double saldo = conta.getSaldo() - valor;
        conta.setSaldo(saldo);
    }

    public void depositar (Integer id, Double valor ){
        Conta conta = contaRepository.findById(id).get();
        Double saldo = conta.getSaldo() + valor;
        conta.setSaldo(saldo);
    }

    public Double consultarSaldo (Integer id){
        Conta conta = contaRepository.findById(id).get();
        return conta.getSaldo();
    }
}

