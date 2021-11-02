package com.joao.normando.desafioStagio.service;

import com.joao.normando.desafioStagio.model.Pessoa;
import com.joao.normando.desafioStagio.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Service
@Transactional
public class PessoaService implements Serializable {
    @Autowired
    PessoaRepository pessoaRepository;

    public List<Pessoa> getAllPessoas() {
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoaRepository.findAll().forEach(pessoa -> pessoas.add(pessoa));

        ModelAndView modelAndView = new ModelAndView("pessoas");
        modelAndView.addObject("pessoas", pessoas);

        return pessoas;
    }

    public Pessoa getPessoaById(int id) {
        return pessoaRepository.findById(id).get();
    }
    public Pessoa saveOrUpdate(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public void delete(int id) {
        pessoaRepository.deleteById(id);
    }
}
