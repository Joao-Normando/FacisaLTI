package com.joao.normando.desafioStagio.controller;

import com.joao.normando.desafioStagio.model.Conta;
import com.joao.normando.desafioStagio.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@Transactional
@RequestMapping(value= "/contas")
public class ContaController {

    @Autowired
    ContaService contaService;
    //salva uma conta
    @RequestMapping(method = RequestMethod.POST, path = "salvar")
    public ResponseEntity<?> salvar(@RequestBody Conta contaAdicionada) {

        Conta conta = this.contaService.adicionarOuAtualizar(contaAdicionada);
        return new ResponseEntity<>(conta, HttpStatus.OK);
    }

    @RequestMapping(method=RequestMethod.PUT, path="depositar/{quantidade}/{id}" )
    public ResponseEntity<?> depositar(@PathVariable double quantidade, @PathVariable Integer id){

        this.contaService.depositar(id, quantidade);
        return new ResponseEntity<>( HttpStatus.OK);
    }

    @RequestMapping(method=RequestMethod.PUT, path="sacar/{quantidade}/{id}" )
    public ResponseEntity<?> sacar(@PathVariable double quantidade, @PathVariable Integer id){

        this.contaService.sacar(id, quantidade);
        return new ResponseEntity<>( HttpStatus.OK);
    }

    @RequestMapping(method=RequestMethod.GET, path="consultarSaldo/{quantidade}/{id}" )
    public ResponseEntity<?> consultarSaldo( @PathVariable Integer id){

        this.contaService.consultarSaldo(id);
        return new ResponseEntity<>( HttpStatus.OK);
    }

}