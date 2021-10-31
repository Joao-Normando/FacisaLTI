package com.joao.normando.desafioStagio.controller;

import com.joao.normando.desafioStagio.model.Pessoa;
import com.joao.normando.desafioStagio.service.PessoaService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@Transactional
@RequestMapping(value = "/pessoa")
public class PessoaController {

    @Autowired
    PessoaService pessoaService;

    @RequestMapping(method=RequestMethod.GET, path="listar")
    public ResponseEntity<?> listar(){
        List<Pessoa> pessoas = pessoaService.getAllPessoas();
        return new ResponseEntity<>(pessoas, HttpStatus.OK);
    }
    @RequestMapping(method=RequestMethod.POST, path="salvar")
    public ResponseEntity<?> salvar(@RequestBody Pessoa pessoa){
        Pessoa p = pessoaService.saveOrUpdate(pessoa);
        return new ResponseEntity<>(p, HttpStatus.OK);
    }
}
